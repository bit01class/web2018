::�������� �����
del "C:/Tomcat 8.5/webapps/mvn02.war"
rmdir /S /Q "C:/Tomcat 8.5/webapps/mvn02"

::war���� ����
xcopy mvn02.war "C:/Tomcat 8.5/webapps"

::���� ����
cd C:\Tomcat 8.5\bin
startup.bat
