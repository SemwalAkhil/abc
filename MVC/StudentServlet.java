
package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import model.Student;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        // Create Model
        Student student = new Student(name, age);

        // Display result
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Student Details</h2>");
        out.println("<p>Name: " + student.getName() + "</p>");
        out.println("<p>Age: " + student.getAge() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
