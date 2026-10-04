import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {
    TextField a, b;
    Button add;

    Calculator() {
        setLayout(new FlowLayout());

        a = new TextField(5);
        b = new TextField(5);
        add = new Button("Add");

        add(a);
        add(b);
        add(add);

        add.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(a.getText());
        int y = Integer.parseInt(b.getText());

        System.out.println("Sum = " + (x + y));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
