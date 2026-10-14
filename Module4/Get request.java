
import java.io.*;
import javax.servlet.http.*;

public class GetDemo extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException {
        String name = req.getParameter("name");
        res.getWriter().println("Hello " + name);
    }
}
