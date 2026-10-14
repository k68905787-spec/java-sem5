
import java.io.*;
import javax.servlet.http.*;

public class RequestDemo extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException {
        String name = req.getParameter("name");
        res.setContentType("text/html");
        res.getWriter().println("Name: " + name);
    }
}
