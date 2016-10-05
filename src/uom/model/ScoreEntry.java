package uom.model;

import java.io.Serializable;

public class ScoreEntry implements Serializable {

    private int id;
    private int rank;
    private String name;
    private int laneNo;
    private String gender;
    private int competitionNumber;
    private double timeDuration;
    private String stroke;

    public int getCompetitionNumber() {
        return competitionNumber;
    }

    public void setCompetitionNumber(int competitionNumber) {
        this.competitionNumber = competitionNumber;
    }

    public double getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(double timeDuration) {
        this.timeDuration = timeDuration;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(int laneNo) {
        this.laneNo = laneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }
    
    
}
