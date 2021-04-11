<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>

	body {
		margin-top: 20px;
		background-image: url("registerBG.png");
		background-position: -155px -250px;
		background-attachment:fixed;
		text-align: center;
	}
	
	.header {
		position:fixed;
		height : 20px;
		width : 40%;
		margin-top: 45px;
		margin-left: 400px;
		text-align : center;
		font-size: 30px;
		color: black;
		padding-top: 20px;
		padding-bottom: 40px;	
		background-color: LightYellow;
		opacity: 0.7;
		border-color: DarkGreen;
		border-style: solid;
		border-radius : 8px;
		box-shadow: 7px 7px 7px black;
	}
	
	.transbox {
		margin-left : 350px;
		margin-right : 350px;
		margin-bottom : 150px;
		padding-bottom : 50px;
		margin-top : 100px;
		padding-top : 30px;
		background-color: LightYellow;
		opacity: 0.7;
		border-color: DarkGreen;
		border-style: solid;
		border-radius : 8px;
		box-shadow: 7px 7px 7px black;
		
	}
	
	table.center {
		margin-left: auto;
		margin-right: auto;
		text-align: center;
	}

</style>

<body background = "registerBG.png">

<form name = "home" action = "showSubjects.do">

	<div class = "header">
		WELCOME
	</div>
	
	<div class = "row">
		<br><br><br>
	</div>
	
	<div class = "transbox">
	
	<br>
		${message}
		<br><br><br>
		
<!-- 		//add input box with drop-down to display according to some type -->

		Enter Subject Type<br><br>
		<input type = "text" name = "subType" size = "8">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type = "submit" value = "GET"><br><br>
		
		
		
		<input type = "submit" value = "ADD SUBJECT" formaction = "addSubject.jsp">
				
		<br><br>
		
<!-- 		//add table details to display -->

		 <table class = "center" border = 3px>
			<c:forEach var = "subject" items = "${subjectList}">
			
			<tr>
			
				<td> ${subject.getSubType()} </td>
				<td> ${subject.getSubCode()} </td>
				<td> ${subject.getSubName()} </td>
				<td> ${subject.getSubSeats()} </td>
				
			</tr>
			
			</c:forEach>
				
		</table>
		<br><br>
		
		<a href = "getProfile.jsp" style = "color: green">EDIT PROFILE</a>
		
	</div>

</form>

</body>
</html>