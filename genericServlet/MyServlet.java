import jakarta.servlet.*;
import java.io.*;

public class MyServlet extends GenericServlet {

    public void service(ServletRequest req,
                        ServletResponse res)
                        throws ServletException, IOException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<h1>Hello from GenericServlet</h1>");
    }
}