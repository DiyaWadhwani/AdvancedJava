<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New registration</title>
</head>
<body style = "text-align: center">

	<form action="add.do"> 
		<h1>Register a new team</h1>
		
		<h2>Please enter the following details</h2>
		
		ID : 
		<input type = "number" name = "teamID">
		<br>
		Name : 
		<input type = "text" name = "teamName">
		<br>
		Sport :
		<input type = "text" name = "teamSport">
		<br>
		No. of players :
		<input type = "number" name = "teamPlayers">
		<br><br>
		<input type = "submit" value = "REGISTER">
	</form>
</body>
</html>