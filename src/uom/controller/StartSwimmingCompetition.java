package uom.controller;

import uom.model.SwimmingCompetition;
import uom.view.frontend.BaseGUI;

/**
 *
 * Controller responsible of starting up the application
 */
public class StartSwimmingCompetition {

    public static void main(String[] args) {
        startUp();
    }

    private static void startUp() {
        SwimmingCompetition competition = new SwimmingCompetition();
        competition.initialize();

        BaseGUI baseUI = new BaseGUI();
        baseUI.setVisible(true);
    }

}
