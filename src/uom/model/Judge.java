package uom.model;

import uom.common.Constant;
import java.util.List;
import uom.controller.HelperService;
import uom.view.frontend.CompetitionSelection;

/**
 *
 * Implements Judge - Responsible of starting the game - Getting the starting
 * time of the game
 *
 */
public class Judge extends People {

    private static int noOfJudges = 0;

    private static long startTime;
    private static String competingGender;

    public Judge(String name) {
        super(name);
        noOfJudges++;
        competingGender = null;
    }

    public void blowTheWhistle() {
        startTime = captureGameStartTime();
        competingGender = CompetitionSelection.getSelectedGender();

        List<Swimmer> swimmers = null;

        if (competingGender.equals(Constant.FEMALE)) {
            swimmers = SwimmingCompetition.getFemaleSwimmers();
        } else {
            swimmers = SwimmingCompetition.getMaleSwimmers();
        }

        if (swimmers != null && !swimmers.isEmpty()) {
            for (Swimmer swimmer : swimmers) {
                Thread th = new Thread(swimmer);
                th.start();

            }
        }
    }

    public static void getResults() {
        List<ScoreEntry> results = HelperService.getScoreEntries();
    }

    private long captureGameStartTime() {
        return System.currentTimeMillis();
    }

    public static long getStartTime() {
        return startTime;
    }

    public static int getNoOfJudges() {
        return noOfJudges;
    }

}
