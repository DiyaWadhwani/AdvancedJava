<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete by ID</title>

	<style>
		
		.transbox {
		
		padding-top:20px;
		padding-bottom:50px;
		padding-right:20px;
		margin-top:50px;
		margin-left:250px;
		margin-right:230px;
		background-color : white;
		opacity : 0.8;
		border-style: dotted;
		border-color:#663300;
		border-width: 5px;
		border-radius: 8px;
				
		}
		
		input[type=text] {
			
			padding : 10px 20px;
			margin : 8px;
			border-left-color: yellow;
			border-right-color: black;
			border-top-color: black;
			border-bottom-color: black;
			border-style:groove;
			box-sizing:border-box;
			border-width: 5px;
			background-color : #cc6600;
		}
		
		input[type=text]::placeholder {
			text-align:center;
			font-size:15px;
			font-weight:bold;
			color: white;
		}
		
		input[type=number] {
			
			padding : 10px 20px;
			margin : 8px;
			border-left-color: yellow;
			border-right-color: black;
			border-top-color: black;
			border-bottom-color: black;
			border-style:groove;
			box-sizing:border-box;
			border-width: 5px;
			background-color : #cc6600;
		}
		
		input[type=number]::placeholder {
			text-align:center;
			font-size:15px;
			font-weight:bold;
			color: white;
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
</head>
<body background="image.jpg" style = "text-align:center">

	<script type = "text/javascript">
	
		function validate() {
		
		var status = false; 
		var id = document.lib.id.value;

		if(id==null || id==""){  
			  alert("ID must be atleast 3 characters long.");  
			  return false;  
		  }				
		else {
			return true;
		}
	}
	
	</script>

	<div class = "transbox">
	
		<form name ="lib" action = "deleteByID" onsubmit = "return validate()">
	
		<h1>
			Delete from our existing Library		
		</h1>
		
		<h2>
			Please enter the following details
		</h2>
		
		<!-- 
		<b>
			ID :
		</b> -->
			<input type = "text" name = "id" placeholder = "Enter ID"> <br>
			
		<input type = "submit" value = "DELETE">
		
		</form>

	</div>
	

</body>
</html>