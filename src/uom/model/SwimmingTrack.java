package uom.model;

public class SwimmingTrack {

    private TouchPad touchPad = null;

    public SwimmingTrack() {
        touchPad = new TouchPad();
    }

    public TouchPad getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(TouchPad touchPad) {
        this.touchPad = touchPad;
    }

}
