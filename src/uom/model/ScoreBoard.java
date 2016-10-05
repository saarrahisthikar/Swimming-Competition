package uom.model;

import java.util.ArrayList;
import java.util.List;
import uom.controller.HelperService;
import uom.view.frontend.CompetitionSelection;

/*
 * Implements the score board
 * - Displays the result 
 * - Notify Spectators
 */
public class ScoreBoard implements Observable {

    private List<Observer> observers = null;
    private ScoreEntry scoreEntry = null;

    public ScoreBoard() {
        observers = new ArrayList<Observer>();

    }

    public Object[] getScoreUpdates(int competitionNo, Swimmer swimmer, int rank) {
        scoreEntry = new ScoreEntry();

        notifyObservers(observers);

        Object[] score = new Object[4];
        if (swimmer != null) {
            score[0] = rank;
            scoreEntry.setRank(rank);
            score[1] = swimmer.getpName();
            scoreEntry.setName(swimmer.getpName());
            score[2] = swimmer.getLaneNo();
            scoreEntry.setLaneNo(swimmer.getLaneNo());
            score[3] = swimmer.getTime();
            scoreEntry.setTimeDuration(swimmer.getTime());
            scoreEntry.setGender(CompetitionSelection.getSelectedGender());
            scoreEntry.setStroke(CompetitionSelection.getSelectedStroke());
            scoreEntry.setCompetitionNumber(competitionNo);
            HelperService.saveCompetition(scoreEntry);
        }
        return score;

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(List<Observer> observers) {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
