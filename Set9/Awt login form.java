import javax.swing.*;
import java.awt.*;

class Login {
    public static void main(String[] args) {
        JFrame f=new JFrame("Login");
        JTextField u=new JTextField(15);
        JPasswordField p=new JPasswordField(15);
        JButton b=new JButton("Login");

        f.setLayout(new FlowLayout());
        f.add(new JLabel("Username"));
        f.add(u);
        f.add(new JLabel("Password"));
        f.add(p);
        f.add(b);

        b.addActionListener(e -> {
            if(u.getText().equals("admin") &&
               new String(p.getPassword()).equals("1234"))
                JOptionPane.showMessageDialog(f,"Login Success");
            else
                JOptionPane.showMessageDialog(f,"Invalid Login");
        });

        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
                                              }
