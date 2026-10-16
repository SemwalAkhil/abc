Step 1: Create the folder structure
For example, on Windows:
C:\apache-tomcat-11\webapps\StudentMVC\
├── student.html
└── WEB-INF\
    └── classes\
        ├── model\
        │   └── Student.class
        └── controller\
            └── StudentServlet.class


Step 2: Compile the Java files

set "TOMCAT=C:\apache-tomcat-11"
cd /d C:\StudentMVC\src
javac -cp "%TOMCAT%\lib\servlet-api.jar" -d "%TOMCAT%\webapps\StudentMVC\WEB-INF\classes" model\Student.java controller\StudentServlet.java

Step 3: Start Tomcat
C:\apache-tomcat-11\bin\startup.bat


Step 4: Run in the browser
Open:
http://localhost:8080/StudentMVC/student.html