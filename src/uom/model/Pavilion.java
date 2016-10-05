package uom.model;

import java.util.List;

/**
 * gGetting the spectator count
 *
 */
public class Pavilion {

    private List<Spectator> spectators = null;

    public void addSpectator(Spectator spectator) {
        spectators.add(spectator);
    }

    public List<Spectator> getSpectators() {
        return spectators;
    }

}
