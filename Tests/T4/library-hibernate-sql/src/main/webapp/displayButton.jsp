<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

	<style>
		
		.transbox {
		
		padding-top:20px;
		padding-bottom:50px;
		padding-right:20px;
		margin-top:100px;
		margin-left:250px;
		margin-right:230px;
		background-color : white;
		opacity : 0.8;
		border-style: dotted;
		border-color:#663300;
		border-width: 5px;
		border-radius: 8px;
				
		}
		
		input[type=submit] {
			padding : 10px 30px;
			margin : 5px;
			color: black;
			font-size:15px;
			font-weight: bold;
			box-sizing:border-box;
			border-width: 3px;
		}
	
	</style>

<body background = "image.jpg" style = "text-align:center">

	<form action="displayBooks">
	
	<div class = "transbox">
	
		<h1>
			Click on the button to view all Books in our Library
		</h1>
			<input type = "submit" value = "DISPLAY">
	
	</div>
	</form>
	
</body>
</html>