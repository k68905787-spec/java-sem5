import java.applet.Applet;
import java.awt.Graphics;

public class StudentInfo extends Applet {

    String name, regno, course, semester;

    public void init() {
        name = getParameter("name");
        regno = getParameter("regno");
        course = getParameter("course");
        semester = getParameter("semester");
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name, 50, 50);
        g.drawString("Register No: " + regno, 50, 70);
        g.drawString("Course: " + course, 50, 90);
        g.drawString("Semester: " + semester, 50, 110);
    }
}
