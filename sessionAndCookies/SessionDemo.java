import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session")
public class SessionDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Login Successful</h2>");
        out.println("<p>Welcome, " + username + "</p>");
        out.println("<a href='profile'>View Profile</a>");
        out.println("<br><a href='logout'>Logout</a>");
    }
}