import java.awt.*;
import java.awt.event.*;

class ColorDemo extends Frame implements ActionListener {
    Button red, blue;

    ColorDemo() {
        setLayout(new FlowLayout());

        red = new Button("Red");
        blue = new Button("Blue");

        add(red);
        add(blue);

        red.addActionListener(this);
        blue.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == red)
            setBackground(Color.RED);
        else
            setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}
