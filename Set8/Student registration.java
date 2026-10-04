import java.awt.*;
import java.awt.event.*;

class Student extends Frame implements ActionListener {
    TextField name;
    Button submit;

    Student() {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        name = new TextField(15);
        add(name);

        submit = new Button("Submit");
        add(submit);

        submit.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Name: " + name.getText());
    }

    public static void main(String[] args) {
        new Student();
    }
}
