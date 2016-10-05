package uom.view.frontend;

import java.awt.Color;
import javax.swing.JPanel;

public class TouchPadLayout extends JPanel {

    public void markTouchPad() {
        System.out.println("touched the touchPad");
        setBackground(Color.red);
    }

    public void resetTouchPad() {
        setBackground(Color.green);
    }
}
