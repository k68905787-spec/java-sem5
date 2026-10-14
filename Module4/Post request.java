
import java.io.*;
import javax.servlet.http.*;

public class PostDemo extends HttpServlet {
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res)
                       throws IOException {
        String name = req.getParameter("name");
        res.getWriter().println("Welcome " + name);
    }
}
