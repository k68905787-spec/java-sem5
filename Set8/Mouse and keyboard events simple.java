import java.awt.*;
import java.awt.event.*;

class MouseKey extends Frame {

    MouseKey() {
        setSize(400,300);
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                System.out.println("X = " + e.getX() +
                                   " Y = " + e.getY());
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key = " + e.getKeyChar());
            }
        });
    }

    public static void main(String[] args) {
        new MouseKey();
    }
}
