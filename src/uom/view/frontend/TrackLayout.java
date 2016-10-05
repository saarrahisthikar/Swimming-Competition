package uom.view.frontend;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import uom.common.Constant;
import uom.model.Swimmer;
import uom.model.SwimmingCompetition;

/**
 * Plotting swimmer locations to the track
 * 
 */
public class TrackLayout extends JPanel {

    private int trackNo;

    private int xCoordinate;
    private int yCoordinate;

    private boolean drawSwimmer = false;

    private TouchPadLayout touchPadPanel = null;

    public TrackLayout(int trackNo) {
        this.trackNo = trackNo;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (drawSwimmer && CompetitionSelection.getSelectedGender() != null) {
            //    System.out.println("selected gender is " + CompetitionSelection.getSelectedGender());

            Graphics2D g2d = (Graphics2D) g;

            Dimension size = getSize();
            int containerWidth = size.width;

            int w = getxCoordinate();

            int h = getyCoordinate();
            //      System.out.println("[w=" + w + ", h=" + h + "]");

            if (w == 100) {
                System.out.println("Swimmer completed");
                w = 95; // display in the panel
            }

            switch (CompetitionSelection.getSelectedGender()) {
                case Constant.FEMALE:
                    Swimmer femaleSwimmer = SwimmingCompetition.getFemaleSwimmers().get(trackNo - 1);

                    if (CompetitionSelection.getSelectedStroke().equals(Constant.BACK_STROKE)) {
                        g.drawImage(femaleSwimmer.backStroke(), containerWidth * w / 100, 1, this);
                    } else if (CompetitionSelection.getSelectedStroke().equals(Constant.BREAST_STROKE)) {
                        g.drawImage(femaleSwimmer.breastStroke(), containerWidth * w / 100, 1, this);
                    } else if (CompetitionSelection.getSelectedStroke().equals(Constant.BUTTERFLY_STROKE)) {
                        g.drawImage(femaleSwimmer.butterflyStroke(), containerWidth * w / 100, 1, this);
                    } else if (CompetitionSelection.getSelectedStroke().equals(Constant.FREE_STYLE)) {
                        g.drawImage(femaleSwimmer.freeStyle(), containerWidth * w / 100, 1, this);
                    }
                    break;
                case Constant.MALE:
                    Swimmer maleSwimmer = SwimmingCompetition.getMaleSwimmers().get(trackNo - 1);

                    if (CompetitionSelection.getSelectedStroke().equals(Constant.BACK_STROKE)) {
                        g.drawImage(maleSwimmer.backStroke(), containerWidth * w / 100, 1, this);
                    } else if (CompetitionSelection.getSelectedStroke().equals(Constant.BREAST_STROKE)) {
                        g.drawImage(maleSwimmer.breastStroke(), containerWidth * w / 100, 1, this);
                    } else if (CompetitionSelection.getSelectedStroke().equals(Constant.BUTTERFLY_STROKE)) {
                        g.drawImage(maleSwimmer.butterflyStroke(), containerWidth * w / 100, 1, this);
                    } else if (CompetitionSelection.getSelectedStroke().equals(Constant.FREE_STYLE)) {
                        g.drawImage(maleSwimmer.freeStyle(), containerWidth * w / 100, 1, this);
                    }
                    break;
            }
        }

    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setDrawSwimmer(boolean drawSwimmer) {
        this.drawSwimmer = drawSwimmer;
    }

    public TouchPadLayout getTouchPadPanel() {
        return touchPadPanel;
    }

    public void setTouchPadPanel(TouchPadLayout touchPadPanel) {
        this.touchPadPanel = touchPadPanel;
    }

  }
