Create a separate source directory:
C:\StudentMVC-src\
├── model\Student.java
└── controller\StudentServlet.java


Compile the Java files from Windows CMD:
set "TOMCAT=C:\apache-tomcat-11"

javac -cp "%TOMCAT%\lib\servlet-api.jar" -d "%TOMCAT%\webapps\StudentMVC\WEB-INF\classes" model\Student.java controller\StudentServlet.java


Start Tomcat:
"%TOMCAT%\bin\startup.bat"


Open the application:
http://localhost:8080/StudentMVC/index.html