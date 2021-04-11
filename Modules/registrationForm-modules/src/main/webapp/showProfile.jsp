<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Updated Details :

${newDetails.getStudName()} <br>
${newDetails.getStudEmail()} <br>
${newDetails.getStudGPA()} <br>
${newDetails.getStudBacks()} <br>

<a href = "homePage.jsp">Go Back to Home Page</a>

</body>
</html>