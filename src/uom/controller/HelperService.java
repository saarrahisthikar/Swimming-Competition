package uom.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uom.model.ScoreEntry;
import uom.model.FemaleSwimmer;
import uom.model.Judge;
import uom.model.People;
import uom.model.Spectator;
import uom.model.SupportingStaff;
import uom.model.Swimmer;
import uom.model.SwimmingCompetition;
import uom.persitence.DataStorage;
import uom.view.frontend.BaseGUI;

/**
 * Intermediate layer between front-end and persistence
 */
public class HelperService {

    public static void saveSwimmer(Swimmer swimmer) {

        List<People> people = SwimmingCompetition.getPeople();
        people.add(swimmer);

        if (swimmer instanceof FemaleSwimmer) {
            List<Swimmer> femaleSwimmers = SwimmingCompetition.getFemaleSwimmers();
            femaleSwimmers.add(swimmer);

        } else {
            List<Swimmer> maleSwimmers = SwimmingCompetition.getMaleSwimmers();
            maleSwimmers.add(swimmer);

        }
        SwimmingCompetition.getSwimmers().add(swimmer);

    }

    public static List<Swimmer> getAllSwimmers() {
        return SwimmingCompetition.getSwimmers();
    }

    public static void saveSpectator(Spectator spectator) {
        List<People> people = SwimmingCompetition.getPeople();
        people.add(spectator);

        List<Spectator> spectators = SwimmingCompetition.getSpectator();
        spectators.add(spectator);

    }

    public static void saveJudge(Judge judge) {
        List<People> people = SwimmingCompetition.getPeople();
        people.add(judge);
    }

    public static void saveSupportingStaff(SupportingStaff supportingStaff) {
        List<People> people = SwimmingCompetition.getPeople();
        people.add(supportingStaff);
    }

    public static List<Spectator> getAllSpectators() {
        return SwimmingCompetition.getSpectator();
    }

    public static void saveCompetition(ScoreEntry competition) {
        Connection connection = DataStorage.buildConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();

            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO competition_result(id, competition_no, rank, name, lane_no, time_duration, gender, stroke) ");
            sb.append("VALUES ");
            sb.append("(");
            sb.append("null").append(",");
            sb.append(competition.getCompetitionNumber()).append(",");
            sb.append(competition.getRank()).append(",'");
            sb.append(competition.getName()).append("',");
            sb.append(competition.getLaneNo()).append(",");
            sb.append(competition.getTimeDuration()).append(",'");
            sb.append(competition.getGender()).append("','");
            sb.append(competition.getStroke()).append("')");

            String sql = sb.toString();
            statement.executeUpdate(sql);


        } catch (SQLException ex) {
            Logger.getLogger(HelperService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataStorage.releaseResources(statement, connection, null);
        }
    }

    public static List<ScoreEntry> getScoreEntries() {
        List<ScoreEntry> storedScore = new ArrayList<>();
        ScoreEntry scoreEntry = null;

        Connection connection = DataStorage.buildConnection();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.createStatement();
            String sql = "SELECT id, competition_no, rank, name, lane_no, time_duration, gender, stroke from competition_result order by  competition_no, rank";
            rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                    scoreEntry = new ScoreEntry();
                    scoreEntry.setId(rs.getInt("id"));
                    scoreEntry.setCompetitionNumber(rs.getInt("competition_no"));
                    scoreEntry.setRank(rs.getInt("rank"));
                    scoreEntry.setName(rs.getString("name"));
                    scoreEntry.setTimeDuration(rs.getDouble("time_duration"));
                    scoreEntry.setLaneNo(rs.getInt("lane_no"));
                    scoreEntry.setGender(rs.getString("gender"));
                    scoreEntry.setStroke(rs.getString("stroke"));

                    storedScore.add(scoreEntry);

                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(BaseGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataStorage.releaseResources(statement, connection, rs);
        }
        return storedScore;
    }

    public static int getNextCompetitionNumber() {
        int nextValue = 0;
        Connection connection = DataStorage.buildConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql = "SELECT max(competition_no) as max FROM competition_result ";
            ResultSet rs = statement.executeQuery(sql);

            int currentMax = 0;
            if (rs != null) {
                while (rs.next()) {
                    currentMax = rs.getInt("max");
                    break;
                }
            }
            nextValue = currentMax + 1;
        } catch (SQLException ex) {
            Logger.getLogger(HelperService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DataStorage.releaseResources(statement, connection, null);
        }

        return nextValue;
    }

}
