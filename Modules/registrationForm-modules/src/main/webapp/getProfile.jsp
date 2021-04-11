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
	
	.transbox {
		margin-left : 350px;
		margin-right : 350px;
		padding-bottom : 50px;
		margin-top : 200px;
		padding-top: 30px;
		background-color: LightYellow;
		opacity: 0.7;
		border-color: DarkGreen;
		border-style: solid;
		border-radius : 8px;
		box-shadow: 7px 7px 7px black;
		
	}

</style>

<body>

<form name = "loadData" action = "getProfile.do">
	
	<div class = "transbox">
	<h2>Please enter your email</h2>
		<input type = "text" name = "studEmail" placeholder = "abcd@xyz.com">
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type = "submit" value = "NEXT">
	</div>

</form>


</body>
</html>