<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>
</head>

<style>

	body {
		margin-top: 20px;
		background-image: url("registerBG.png");
		background-position: -155px -250px;
		background-attachment:fixed;
		text-align: center;
	}
	
	.transbox {
		margin-left : 350px;
		margin-right : 350px;
		margin-bottom : 100px;
		padding-bottom : 50px;
		margin-top : 80px;
		padding-top: 10px;
		background-color: LightYellow;
		opacity: 0.7;
		border-color: DarkGreen;
		border-style: solid;
		border-radius : 8px;
		box-shadow: 7px 7px 7px black;
		
	}

</style>

<body>

<form name = "edit" action = "updateProfile.do">

	<div class = "transbox">
	
		<h1>Edit your profile</h1>
		
		
		<h2>Please enter details</h2>
		
		<br>
		
			
		Name : 
			<input type = "text" name = "studName" placeholder = "${studDetails.getStudName()}"><br><br>
			
		Email :
			<input type = "text" name = "studEmail" placeholder = "${studDetails.getStudEmail()}"><br><br>
  		
  		GPA : 
  			<input type = "text" name = "studGPA" maxlength = "4" size = "5" placeholder ="${studDetails.getStudGPA()}">
  			
  		&nbsp;&nbsp;&nbsp;
  		
  		Backlogs :
  			<input type = "text" name = "studBacks" maxlength = "1" size ="2" placeholder = "${studDetails.getStudBacks()}"> <br><br>
  		 
  		 <br><br>
  		 
  		 <input type = "reset" value = "RESET">
  		 
  		   &nbsp;&nbsp;&nbsp;&nbsp;
  		 
			<input type = "submit" value = "UPDATE">
	
	</div>
	
	
</form>

</body>
</html>