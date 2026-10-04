import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ColorApplet extends Applet {

    String msg;

    public void init() {
        msg = getParameter("message");

        setBackground(Color.yellow);
        setForeground(Color.blue);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}
