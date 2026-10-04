import javax.swing.*;
import java.awt.*;

class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField a = new JTextField(10);
        JTextField b = new JTextField(10);
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        f.setLayout(new FlowLayout());
        f.add(a); f.add(b);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        add.addActionListener(e -> a.setText(
            ""+(Double.parseDouble(a.getText())+
            Double.parseDouble(b.getText()))));

        sub.addActionListener(e -> a.setText(
            ""+(Double.parseDouble(a.getText())-
            Double.parseDouble(b.getText()))));

        mul.addActionListener(e -> a.setText(
            ""+(Double.parseDouble(a.getText())*
            Double.parseDouble(b.getText()))));

        div.addActionListener(e -> a.setText(
            ""+(Double.parseDouble(a.getText())/
            Double.parseDouble(b.getText()))));

        f.setSize(300,150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
