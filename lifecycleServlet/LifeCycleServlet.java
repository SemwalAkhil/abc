import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {

    public void init() {
        System.out.println("init() called");
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws IOException {

        System.out.println("doGet() called");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Servlet Lifecycle</h1>");
    }

    public void destroy() {
        System.out.println("destroy() called");
    }
}