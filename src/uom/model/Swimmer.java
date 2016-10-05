package uom.model;

import uom.common.Constant;
import uom.view.frontend.TrackLayout;
import java.util.Random;
import uom.view.frontend.CompetitionSelection;
import uom.view.frontend.TouchPadLayout;

/**
 *
 * Implements Swimmer - Swims with a specific style - Swims in a track
 *
 */
public abstract class Swimmer extends People implements Comparable<Swimmer>, Strokes, Runnable {

    private static int noOfSwimmers = 0;

    private int laneNo;
    private double time = 0;

    private TrackLayout track = null;

    public Swimmer(String name, int laneNo) {
        super(name);
        this.laneNo = laneNo;
        noOfSwimmers++;
    }

    @Override
    public void run() {

        Random rand = new Random();

        if (this.track != null) {

            this.track.setxCoordinate(0);
            this.track.setyCoordinate(laneNo);

            int distance = 0;
            while (distance < Constant.TRACK_LENGHT) {
                distance = distance + rand.nextInt(10) + 1;

                if (distance > Constant.TRACK_LENGHT) {
                    distance = Constant.TRACK_LENGHT;
                }

                this.track.setxCoordinate(distance);
                this.track.setyCoordinate(laneNo);

                this.track.repaint();
                try {
                    if (CompetitionSelection.getSelectedGender().equals(Constant.MALE)) {
                        Thread.sleep(MaleSwimmer.getSleepingTime());
                    } else {
                        Thread.sleep(FemaleSwimmer.getSleepingTime());
                    }
                } catch (InterruptedException ex) {
                    System.err.println("Interruption Exception");
                }

            }
            touchesTheTouchPad();
            if (Thread.currentThread().isAlive()) {
                Thread.currentThread().stop();
            }
        }
    }

    private void touchesTheTouchPad() {
        if (track != null) {
            TouchPadLayout touchPadPanel = track.getTouchPadPanel();
            touchPadPanel.markTouchPad();
            time = TouchPad.getTimeDuration();
        }
    }

    public int getLaneNo() {
        return laneNo;
    }

    public static int getNoOfSwimmers() {
        return noOfSwimmers;
    }

    public double getTime() {
        return time;
    }

    public void setTrack(TrackLayout track) {
        this.track = track;
    }

    //Comparing each swimmer from their time duration
    @Override
    public int compareTo(Swimmer other) {
        int diffInMiliseconds = (int) ((this.getTime() - other.getTime()) * 1000);
        return diffInMiliseconds;
    }

}
