<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@page isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "text-align: center">

	<h1>List of registered teams</h1>
	
	<div align = "center">
		
		<table style="text-align:center">
	
	<tr>
		<th>Team ID</th>
		<th>Team Name</th>
		<th>Sport</th>
		<th>No. of players</th>
		<th>Actions</th>
	</tr>
	
	<c:forEach var = "team" items = "${teamsList}">
	
		<tr>
			<td> ${team.getTeamID()} </td>
			<td> ${team.getTeamName()} </td>
			<td> ${team.getTeamSport()} </td>
			<td> ${team.getTeamPlayers()} </td>
			<td> <a href = "update.jsp">Update</a> </td>
			<td> <a href = "delete.jsp">Delete</a> </td>
		
		</tr>
	</c:forEach>
	
	</table>
	
	</div>
	
	<a href = "registration.jsp">Go back to Home page</a>
	
</body>
</html>