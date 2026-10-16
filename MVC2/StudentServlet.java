package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import model.Student;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String ageText = request.getParameter("age");

        try {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name is required.");
            }

            int age = Integer.parseInt(ageText);

            if (age < 1 || age > 120) {
                throw new IllegalArgumentException(
                    "Age must be between 1 and 120."
                );
            }

            Student student = new Student(name.trim(), age);

            request.setAttribute("student", student);
            request.getRequestDispatcher(
                "/WEB-INF/views/student-result.jsp"
            ).forward(request, response);

        } catch (NumberFormatException |
                 IllegalArgumentException e) {

            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher(
                "/WEB-INF/views/student-result.jsp"
            ).forward(request, response);
        }
    }
}