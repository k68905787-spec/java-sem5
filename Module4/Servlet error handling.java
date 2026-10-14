
import java.io.*;
import javax.servlet.http.*;

public class ErrorDemo extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException {
        try {
            int a = 10 / 0;
            res.getWriter().println(a);
        } catch (ArithmeticException e) {
            res.getWriter().println("Error Occurred");
        }
    }
}
