<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

</style>

<body background = "registerBG.png">

	<form name = "newSubject" action = "addNewSubject.do">

		<div class = "transbox">
	
		<h1>Add a New Subject</h1>
		
		
		<h2>Please enter details</h2>
		
		<br>
		
			
		Subject Name :
			<input type = "text" name = "subName"><br><br>
  		
  		Subject Type : 
  		
  		<input type = "radio" name = "subType" value = "mandatory">
			Mandatory
		&nbsp;&nbsp;
  		<input type="radio" name="subType" value = "elective">
			Elective
		
  			<!-- <select name = "subType" style = "color:black">
  			<option value = "Mandatory">Mandatory</option>
  			<option value = "Elective">Elective</option>
  			</select> -->
  			<br><br>
  			
  		Subject Code : 
			<input type = "text" name = "subCode" size = "5">
			
		&nbsp;&nbsp;&nbsp;&nbsp;
  			
  		No. of Seats :
  			<input type = "text" name = "subSeats" size = "3"> <br><br>
  		 
  		 <br><br>
  		 
  		 <input type = "reset" value = "RESET">
  		 
  		   &nbsp;&nbsp;&nbsp;&nbsp;
  		 
			<input type = "submit" value = "ADD">
	
	</div>


	</form>


</body>
</html>