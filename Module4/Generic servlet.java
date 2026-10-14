
import java.io.*;
import javax.servlet.*;

public class MyServlet extends GenericServlet {
    public void service(ServletRequest req,
                        ServletResponse res)
                        throws IOException {
        res.getWriter().println("Generic Servlet");
    }
}
