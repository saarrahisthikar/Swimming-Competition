package uom.view.frontend;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 * 
 *Used to represent the spectator in the pavilion
 */
public class PavilionLayout extends JPanel {

    private Image image;

    private Image getImage() {
        return image;
    }

    public void changeLayout(Image image) {
        this.image = image;
        this.repaint();
        this.revalidate();
        
    }

    public void paintComponent(Graphics g) {
        g.drawImage(getImage(), 0, 0, this);
     }

}
