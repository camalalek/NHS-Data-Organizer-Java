//Project location is defined here
package NHS;

//ALL NEEDED IMPORTS
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class graphics extends JPanel {

    double probD;

    public graphics(double probD) {
        this.probD = probD;
    }

    public void drawing() {
        repaint();
    }

    public void paintComponment(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        double barHeightDouble;
        barHeightDouble = probD + 300;
        int probInt = (int) barHeightDouble;

        g.fillRect(0, (300 - probInt), 80, probInt);

    }

}
