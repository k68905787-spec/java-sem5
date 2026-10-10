import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseApplet extends Applet implements MouseListener {
    String msg = "Click the mouse";

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "X = " + e.getX() + ", Y = " + e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 30);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
