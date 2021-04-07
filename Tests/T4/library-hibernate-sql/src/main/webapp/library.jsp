<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

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
		
		a{
		
		font-size:23px;
		color:brown;
		
		}
		
	
	</style>

</head>
<body background = "image.jpg" style = "text-align:center">

	<form action = "libraryMain">
		
		<div class = "transbox">
		
			<h1>
				Welcome to our library<br>
			</h1>
			
			<!-- <div class = "row">
				<br>
			</div> -->
			
			<h2>
				Please click on the action you would like to perform <br>
			</h2>
			
			<div class = "row">
				<br>
			</div>
			
			<div class = "row">
			
				<div class = "column">
				
					<a href = "insert.jsp" style = "padding-left:50px">
						INSERT
					</a>
					
					<a href = "displayButton.jsp" style = "padding-left:100px">
						DISPLAY
					</a>
				</div>
			
			</div>
			
			<div class = "row">
				<br>
			</div>
		
		</div>
	
	</form>

</body>
</html>