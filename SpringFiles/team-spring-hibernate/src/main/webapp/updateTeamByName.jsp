<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "text-align: center">

	<form action = "updateByName.do">
		<h1>Update Team details by Name</h1>
		<h2>Please enter the following details</h2>
		Name :
		<input type = "text" name = "teamName">
		<br>
		<h3>Please enter the new details to be updated</h3>
		Sport :
		<input type = "text" name = "teamSport">
		<br>
		No. of players :
		<input type = "number" name = "teamPlayers">
		<br><br>
		<input type = "submit" value = "Update">	
	</form>

</body>
</html>