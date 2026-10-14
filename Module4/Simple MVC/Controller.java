
import javax.servlet.http.*;

public class StudentController extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws java.io.IOException,
                      javax.servlet.ServletException {
        Student s = new Student();
        req.setAttribute("student", s.getName());
        req.getRequestDispatcher("view.jsp")
           .forward(req, res);
    }
}
