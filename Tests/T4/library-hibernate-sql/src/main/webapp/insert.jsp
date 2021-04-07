<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
	
		.transbox {
				
		padding-top:20px;
		padding-bottom:50px;
		padding-right:20px;
		margin-top:45px;
		margin-left:300px;
		margin-right:300px;
		background-color : white;
		opacity : 0.8;
		border-style: dotted;
		border-color:#663300;
		border-width: 5px;
		border-radius: 8px;
		text-align: center;
				
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
<body background = "image.jpg" >

	<script type = "text/javascript">
	
		function validate() {
			
			var status = false; 
			var name = document.lib.name.value;
			var id = document.lib.id.value;
			var pages = document.lib.pages.value;
			
			if (id==null || id==""){  
				  alert("ID must be atleast 3 characters long.");  
				  return false;  
			  }	
			else if (name==null || name==""){  
				  alert("Name cannot be blank");  
				  return false;  
				}
			else if(isNaN(pages)){
				alert("Pages cannot be less than 20");
				return false;
			}
			else {
				return true;
			}
		}

	</script>

	<form name = "lib" action = "insertBook" onsubmit = "return validate()">
	
	<div class = "transbox">
	
	<h1>
		Insert a new Book to our Library
	</h1>
	
	<h2>
		Please enter the following details
	</h2>
	
	<div class = "row">
		<br>
	</div>
	
	<!-- 
		<b>
			ID :
		</b> -->
			<input type = "text" name = "id" placeholder = "Enter ID" id = "id"> <br>
			
		<!-- <b>
			Name :
		</b> -->
			<input type = "text" name = "name" placeholder = "Enter Name" id = "name"> <br>
			
		<!-- <b>
			No. of pages :
		</b> -->
			<input type = "number" name = "pages" placeholder = "Enter No. of Pages" id = "pages"> <br>
			
		<!-- <b>
			Price :
		</b> -->
			<input type = "number" step = "any" name = "price" placeholder = "Enter Price" id = "pages"> <br><br>
			
		<input type = "submit" value = "INSERT">
	
	</div>
		
		 			
		
	</form>



</body>
</html>