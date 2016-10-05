package uom.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Implements Swimming Pool
 */
public class SwimmingPool {

    private List<SwimmingTrack> swimmingTracks = null;

    public SwimmingPool() {
        swimmingTracks = new ArrayList<SwimmingTrack>();
    }

    public List<SwimmingTrack> getSwimmingTracks() {
        return swimmingTracks;
    }
}
