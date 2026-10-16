import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (session != null &&
            session.getAttribute("username") != null) {

            out.println("<h2>User Profile</h2>");
            out.println("<p>Username: " +
                session.getAttribute("username") + "</p>");
        } else {
            out.println("<p>No active session. Please log in.</p>");
        }
    }
}