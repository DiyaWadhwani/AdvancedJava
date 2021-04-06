<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel = "stylesheet" href = "design.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>

<style>

	body {
		margin-top: 20px;
		background-image: url("registerBG.png");
		background-position: -155px -250px;
		color : linen;
	} 
	
	.transbox {
		color: white;
		opacity: 0.7;
	}
		
</style>

<body style = "text-align: center">

<div class = "header"><!--  style = "color: black"> -->
		<h1>Welcome to AMH Portal</h1>
</div>

	<form action = "register.do">
	
		<div class = "align">
	
		<h2>Please enter the following details to register</h2> <br>
		
		USN :
			<input type = "text" name = "studUSN" placeholder = "Enter USN"> <br><br>
		Name : 
			<input type = "text" name = "studName" placeholder = "Enter Name"> <br><br>
		Email : 
			<input type = "email" name = "studEmail" placeholder = "Enter Email"> <br><br>
		Branch : 
			<select name="studBranch" style = "color: black;">
    		<option value="Information Science and Engineering">Information Science and Engineering</option>
    		<option value="Computer Science and Engineering">Computer Science and Engineering</option>
    		<option value="Industrial and Engineering Management">Industrial and Engineering Management</option>
    		<option value="Electronics and Electrical Engineering">Electronics and Electrical Engineering</option>
  			</select> <br><br>
  		
  		GPA : 
  			<input type = "text" name = "studGPA" maxlength = "4" size = "5" placeholder = "Enter GPA">
  			
  		&nbsp;&nbsp;&nbsp;
  		
  		Backlogs :
  			<input type = "text" name = "studBacks" maxlength = "1" size ="2"> <br><br>
  		
  		Year :
  			<select name ="studGrad" style = "color: black;">
  			<option value = "2000">2000</option>
  			<option value = "2001">2001</option>
  			<option value = "2002">2002</option>
  			<option value = "2003">2003</option>
  			<option value = "2004">2004</option>
  			<option value = "2005">2005</option>
  			<option value = "2006">2006</option>
  			<option value = "2007">2007</option>
  			<option value = "2008">2008</option>
  			<option value = "2009">2009</option>
  			</select> <br><br>
  		
  		<input type = "reset" value = "CANCEL" style = "color : black">
  		
  		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  			
  		<input type = "submit" value = "REGISTER" style = "color : black">
  		
  		</div>
  		
	</form>
	
</body>
</html>