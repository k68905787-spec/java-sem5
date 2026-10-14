
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException,
                      ServletException {
        req.setAttribute("msg", "Hello Student");
        RequestDispatcher rd =
            req.getRequestDispatcher("/SecondServlet");
        rd.forward(req, res);
    }
}
