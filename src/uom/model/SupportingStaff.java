package uom.model;

import java.util.List;
import uom.controller.HelperService;
import uom.view.frontend.CompetitionSelection;
import uom.view.frontend.SwimmingCompetitionLayout;
import uom.view.frontend.TouchPadLayout;
import uom.view.frontend.TrackLayout;

/**
 * 
 * Implements Supporting Staff
 * 
 * - Cleaning the pool
 * - Positioning the swimmers
 */

public class SupportingStaff extends People {

    private static int staffCounter = 0;

    public SupportingStaff(String name) {
        super(name);
        setpName(name);
        staffCounter++;
    }

    public static int getStaffCounter() {
        return staffCounter;
    }

    public void cleanThePool() {
        for (int i = 0; i < 5; i++) {
            TrackLayout track = (TrackLayout) SwimmingCompetitionLayout.getTracks().get(i);
            track.setDrawSwimmer(false);

            TouchPadLayout touchPad = (TouchPadLayout) SwimmingCompetitionLayout.getTouchPads().get(i);
            touchPad.resetTouchPad();
        }
    }

    public void positionTheSwimmers() {
        List<Swimmer> swimmers = null;

        if (CompetitionSelection.getSelectedGender().equals(uom.common.Constant.FEMALE)) {
            swimmers = SwimmingCompetition.getFemaleSwimmers();
        } else {
            swimmers = SwimmingCompetition.getMaleSwimmers();
        }

        if (swimmers != null && !swimmers.isEmpty()) {
            for (Swimmer swimmer : swimmers) {

                TrackLayout track = (TrackLayout) SwimmingCompetitionLayout.getTracks().get(swimmer.getLaneNo() - 1);
                track.setDrawSwimmer(true);
                track.setxCoordinate(0);

                TouchPadLayout touchPad = (TouchPadLayout) SwimmingCompetitionLayout.getTouchPads().get(swimmer.getLaneNo() - 1);
                touchPad.resetTouchPad();

                track.setTouchPadPanel(touchPad);

                swimmer.setTrack(track);
            }
        } else {
            //  JOptionPane.showMessageDialog(this, "There are no Female swimmers registered");
        }
    }
    
    public static void getResults(){
        List<ScoreEntry> results = HelperService.getScoreEntries();
    }
}
