
import java.io.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException {
        res.getWriter().println("HTTP Servlet");
    }
}
