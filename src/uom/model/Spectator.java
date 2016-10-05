package uom.model;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import uom.view.frontend.BaseGUI;
import uom.view.frontend.PavilionLayout;

/*
 * Impements Spectators
 * - Getting notifications from the Scoreboard 
 * - Cheering the Competitors
 */
public class Spectator extends People implements Observer {

    private static int noOfSpectators = 0;

    public Spectator(String name) {
        super(name);
        noOfSpectators++;
    }

    public static int getNoOfSpectators() {
        return noOfSpectators;
    }

    @Override
    public void update() {
        Image image = new ImageIcon(this.getClass().getResource("/uom/view/images/SpectatorAfter.jpg")).getImage();
        PavilionLayout pavilion = (PavilionLayout) BaseGUI.getSwimmingCompetitionLayout().getPanelPavilion();
        pavilion.changeLayout(image);
        
        JLabel commentsFeed =    BaseGUI.getSwimmingCompetitionLayout().getLabelSepectatorComments();
        commentsFeed.setToolTipText("Hurray, great performance!!");

    }

}
