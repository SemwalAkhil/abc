1. Create a web application folder named SessionDemo under Tomcat's webapps directory.
2. Place session.html in SessionDemo/.
3. Put all three Java source files in a working folder.
4. Compile them into SessionDemo/WEB-INF/classes/:
set "TOMCAT=C:\apache-tomcat-11"
javac -cp "%TOMCAT%\lib\servlet-api.jar" -d "%TOMCAT%\webapps\SessionDemo\WEB-INF\classes" SessionDemo.java ProfileServlet.java LogoutServlet.java


5. Start Tomcat and open:
http://localhost:8080/SessionDemo/session.html
6. Enter a username, click Login, then try View Profile and Logout.