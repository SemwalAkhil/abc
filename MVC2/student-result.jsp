<%@ page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>
    <h2>Registration Result</h2>

    <%
        String error = (String) request.getAttribute("error");
        Student student = (Student) request.getAttribute("student");

        if (error != null) {
    %>
        <p style="color:red">
            Registration failed: <%= error %>
        </p>
    <%
        } else if (student != null) {
    %>
        <p>Registration successful!</p>
        <p>Name: <%= student.getName() %></p>
        <p>Age: <%= student.getAge() %></p>
    <%
        }
    %>

    <a href="<%= request.getContextPath() %>/index.html">
        Back to registration
    </a>
</body>
</html>