package uom.model;

import java.awt.Image;
import javax.swing.ImageIcon;

/*
 *Implements male swimmer
 * 1. Sets different time durations for each stroke.
 * 2. Sets differen swimming styles for each stroke.
 */
public class MaleSwimmer extends Swimmer implements Strokes {

    private static int countMaleSwimmer = 0;
    private static int sleepingTime = 0;

    private Image strokeStyle = null;

    public MaleSwimmer(String name, int laneNo) {
        super(name, laneNo);
        countMaleSwimmer++;
    }

    @Override
    public Image butterflyStroke() {
        sleepingTime = 180;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/ButterflyStrokeMale.jpg")).getImage();
        return strokeStyle;
    }

    @Override
    public Image backStroke() {
        sleepingTime = 170;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/BackStrokeMale.jpg")).getImage();
        return strokeStyle;
    }

    @Override
    public Image breastStroke() {
        sleepingTime = 160;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/BreastStrokeMale.jpg")).getImage();
        return strokeStyle;
    }

    @Override
    public Image freeStyle() {
        sleepingTime = 150;
        strokeStyle = new ImageIcon(this.getClass().getResource("/uom/view/images/FreeStyleMale.jpg")).getImage();
        return strokeStyle;
    }

    public static int getSleepingTime() {
        return sleepingTime;
    }

    public static int getCountMaleSwimmer() {
        return countMaleSwimmer;
    }

}
