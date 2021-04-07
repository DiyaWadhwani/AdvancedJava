<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Options</title>

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
		
		<div class = "transbox">
		
			<h1>
				Delete from our Library<br>
			</h1>
			
			<h2>
				Please click on the action you would like to perform <br>
			</h2>
			
			<div class = "row">
				<br>
			</div>
			
			<div class = "row">
			
				<div class = "column">
				
					<a href = "deleteByID.jsp" style = "padding-left:50px">
						Delete By ID
					</a>
					
					<a href = "deleteByName.jsp" style = "padding-left:100px">
						Delete By Name
					</a>
				</div>
			
			</div>
			
			<div class = "row">
				<br>
			</div>
		
		</div>


</body>
</html>