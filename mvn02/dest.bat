::기존파일 지우기
del "C:/Tomcat 8.5/webapps/mvn02.war"
rmdir /S /Q "C:/Tomcat 8.5/webapps/mvn02"

::war파일 복사
xcopy mvn02.war "C:/Tomcat 8.5/webapps"

::톰켓 실행
cd C:\Tomcat 8.5\bin
startup.bat
