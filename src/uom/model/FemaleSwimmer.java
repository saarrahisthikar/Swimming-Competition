package uom.model;

import java.awt.Image;
import javax.swing.ImageIcon;

/*
 *Implements male swimmer
 * 1. Sets different time durations for each stroke.
 * 2. Sets different swimming styles for each stroke.
 */
public class FemaleSwimmer extends Swimmer implements Strokes {

    private static int femaleSwimmerCounter = 0;
    private static int sleepingTime = 0;

    private Image strokeStyle = null;

    public FemaleSwimmer(String name, int laneNo) {
        super(name, laneNo);
        femaleSwimmerCounter++;
    }

    @Override
    public Image butterflyStroke() {
        Image imageButterflyStroke = new ImageIcon(this.getClass().getResource("/uom/view/images/ButterflyStrokeFemale.jpg")).getImage();
        sleepingTime = 175;
        return imageButterflyStroke;
    }

    @Override
    public Image backStroke() {
        sleepingTime = 165;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/BackStrokeFemale.jpg")).getImage();
        return strokeStyle;
    }

    @Override
    public Image breastStroke() {
        sleepingTime = 155;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/BreastStrokeFemale.jpg")).getImage();
        return strokeStyle;
    }

    @Override
    public Image freeStyle() {
        sleepingTime = 145;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/FreeStyleFemale.jpg")).getImage();
        return strokeStyle;
    }

    public static int getSleepingTime() {
        return sleepingTime;
    }

    public static int getFemaleSwimmerCounter() {
        return femaleSwimmerCounter;
    }

}
