import java.applet.*;
import java.awt.*;

public class ParameterApplet extends Applet {
    String msg;

    public void init() {
        msg = getParameter("message");
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}
