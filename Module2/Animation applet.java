import java.applet.*;
import java.awt.*;

public class AnimationApplet extends Applet implements Runnable {
    int x = 0;

    public void start() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            x = x + 5;
            if (x > 300) x = 0;
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawOval(x, 50, 40, 40);
    }
}
