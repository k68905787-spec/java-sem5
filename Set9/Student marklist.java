import javax.swing.*;
import java.awt.*;

class Marks {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mark List");
        JTextField a=new JTextField(5);
        JTextField b=new JTextField(5);
        JTextField c=new JTextField(5);
        JButton btn=new JButton("Calculate");

        f.setLayout(new FlowLayout());
        f.add(new JLabel("Mark 1")); f.add(a);
        f.add(new JLabel("Mark 2")); f.add(b);
        f.add(new JLabel("Mark 3")); f.add(c);
        f.add(btn);

        btn.addActionListener(e -> {
            int x=Integer.parseInt(a.getText());
            int y=Integer.parseInt(b.getText());
            int z=Integer.parseInt(c.getText());
            int total=x+y+z;
            double avg=total/3.0;

            JOptionPane.showMessageDialog(f,
                "Total: "+total+"\nAverage: "+avg);
        });

        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
