package uom.model;

/**
 *
 * Implements TouchPad calculating the time duration in seconds
 */
public class TouchPad {

    private static volatile double timeDuration;

    public synchronized static double getTimeDuration() {
        timeDuration = (1000 + System.currentTimeMillis() - Judge.getStartTime()) / 1000d;
        return timeDuration;
    }

}
