
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        String address = request.getParameter("address");
        String website = request.getParameter("website");
        String color = request.getParameter("color");
        String skill = request.getParameter("skill");

        String[] subjects = request.getParameterValues("subject");

        out.println("<html><body>");
        out.println("<h1>Student Registration Successful</h1>");

        out.println("<p>Name: " + escape(name) + "</p>");
        out.println("<p>Email: " + escape(email) + "</p>");
        out.println("<p>Phone: " + escape(phone) + "</p>");
        out.println("<p>Age: " + escape(age) + "</p>");
        out.println("<p>Date of Birth: " + escape(dob) + "</p>");
        out.println("<p>Gender: " + escape(gender) + "</p>");
        out.println("<p>Course: " + escape(course) + "</p>");
        out.println("<p>Address: " + escape(address) + "</p>");
        out.println("<p>Website: " + escape(website) + "</p>");
        out.println("<p>Favorite Color: " + escape(color) + "</p>");
        out.println("<p>Skill Level: " + escape(skill) + "</p>");

        out.println("<p>Subjects: ");

        if (subjects != null) {
            for (String subject : subjects) {
                out.println(escape(subject) + " ");
            }
        } else {
            out.println("None selected");
        }

        out.println("</p>");
        out.println("</body></html>");
    }

    private String escape(String value) {
        if (value == null) {
            return "Not provided";
        }

        return value.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
