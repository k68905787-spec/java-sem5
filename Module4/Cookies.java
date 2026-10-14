
import java.io.*;
import javax.servlet.http.*;

public class CookieDemo extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException {
        Cookie c = new Cookie("user", "Rahul");
        res.addCookie(c);

        res.getWriter().println("Cookie Created");
    }
}
