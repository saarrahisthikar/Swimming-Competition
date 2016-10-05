package uom.model;

import java.util.ArrayList;
import java.util.List;
import uom.controller.HelperService;

/**
 *
 * Initializing and providing necessary infra-structure to the competition
 */
public class SwimmingCompetition {

    private SwimmingPool pool = null;

    private static SupportingStaff responsibleSupportingStaffMember = null;
    private static Judge responsibleJudge = null;
    private static ScoreBoard scoreBoard = null;
    private static Pavilion pavilion = null;

    private static List<People> people = null;
    private static List<Spectator> spectator = null;
    private static List<Swimmer> swimmers = null;
    private static List<Swimmer> maleSwimmers = null;
    private static List<Swimmer> femaleSwimmers = null;

    public void initialize() {

        pool = new SwimmingPool();

        scoreBoard = new ScoreBoard();
        pavilion = new Pavilion();

        people = new ArrayList<People>();
        spectator = new ArrayList<Spectator>();
        swimmers = new ArrayList<Swimmer>();
        maleSwimmers = new ArrayList<>();
        femaleSwimmers = new ArrayList<>();

        responsibleSupportingStaffMember = new SupportingStaff("Mr.Kumarawadu");
        HelperService.saveSupportingStaff(responsibleSupportingStaffMember);

        responsibleJudge = new Judge("Mr. Amal Perera");
        HelperService.saveJudge(responsibleJudge);

    }

    public static SupportingStaff getResponsibleSupportingStaffMember() {
        return responsibleSupportingStaffMember;
    }

    public static void setResponsibleSupportingStaffMember(SupportingStaff responsibleSupportingStaffMember) {
        SwimmingCompetition.responsibleSupportingStaffMember = responsibleSupportingStaffMember;
    }

    public static Judge getRespovdibleJudge() {
        return responsibleJudge;
    }

    public static void setRespovdibleJudge(Judge respovdibleJudge) {
        SwimmingCompetition.responsibleJudge = respovdibleJudge;
    }

    public static ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public static void setScoreBoard(ScoreBoard scoreBoard) {
        SwimmingCompetition.scoreBoard = scoreBoard;
    }

    public static Pavilion getPavilion() {
        return pavilion;
    }

    public static void setPavilion(Pavilion pavilion) {
        SwimmingCompetition.pavilion = pavilion;
    }

    public static List<People> getPeople() {
        return people;
    }

    public static void setPeople(List<People> people) {
        SwimmingCompetition.people = people;
    }

    public static List<Spectator> getSpectator() {
        return spectator;
    }

    public static void setSpectator(List<Spectator> spectator) {
        SwimmingCompetition.spectator = spectator;
    }

    public static List<Swimmer> getSwimmers() {
        return swimmers;
    }

    public static void setSwimmers(List<Swimmer> swimmers) {
        SwimmingCompetition.swimmers = swimmers;
    }

    public static List<Swimmer> getMaleSwimmers() {
        return maleSwimmers;
    }

    public static void setMaleSwimmers(List<Swimmer> maleSwimmers) {
        SwimmingCompetition.maleSwimmers = maleSwimmers;
    }

    public static List<Swimmer> getFemaleSwimmers() {
        return femaleSwimmers;
    }

    public static void setFemaleSwimmers(List<Swimmer> femaleSwimmers) {
        SwimmingCompetition.femaleSwimmers = femaleSwimmers;
    }

}
