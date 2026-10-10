import java.applet.*;
import java.awt.*;

public class StudentApplet extends Applet {
    String name, roll, course, sem;

    public void init() {
        name = getParameter("name");
        roll = getParameter("roll");
        course = getParameter("course");
        sem = getParameter("sem");
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name, 20, 30);
        g.drawString("Roll No: " + roll, 20, 50);
        g.drawString("Course: " + course, 20, 70);
        g.drawString("Semester: " + sem, 20, 90);
    }
}
