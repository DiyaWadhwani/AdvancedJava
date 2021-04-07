<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete By Name</title>
<style>
.transbox {
	padding-top: 20px;
	padding-bottom: 50px;
	padding-right: 20px;
	margin-top: 50px;
	margin-left: 250px;
	margin-right: 230px;
	background-color: white;
	opacity: 0.8;
	border-style: dotted;
	border-color: #663300;
	border-width: 5px;
	border-radius: 8px;
}

input[type=text] {
	padding: 10px 20px;
	margin: 8px;
	border-left-color: yellow;
	border-right-color: black;
	border-top-color: black;
	border-bottom-color: black;
	border-style: groove;
	box-sizing: border-box;
	border-width: 5px;
	background-color: #cc6600;
}

input[type=text]::placeholder {
	text-align: center;
	font-size: 15px;
	font-weight: bold;
	color: white;
}

input[type=number] {
	padding: 10px 20px;
	margin: 8px;
	border-left-color: yellow;
	border-right-color: black;
	border-top-color: black;
	border-bottom-color: black;
	border-style: groove;
	box-sizing: border-box;
	border-width: 5px;
	background-color: #cc6600;
}

input[type=number]::placeholder {
	text-align: center;
	font-size: 15px;
	font-weight: bold;
	color: white;
}

input[type=submit] {
	padding: 10px 30px;
	margin: 5px;
	color: black;
	font-size: 15px;
	font-weight: bold;
	box-sizing: border-box;
	border-width: 3px;
}
</style>
</head>
<body background="image.jpg" style="text-align: center">


	<script type="text/javascript">
		function validate() {

			var status = false;
			var name = document.lib.name.value;

			if (name == null || name == "") {
				alert("Name cannot be blank");
				return false;
			} else {
				return true;
			}
		}
	</script>

	<div class="transbox">

		<form name="lib" action="deleteByName" onsubmit="return validate()">

			<h1>Update our existing Library</h1>

			<h2>Please enter the following details</h2>

			<!-- <b>
			Name :
		</b> -->
			<input type="text" name="name" placeholder="Enter Name"> <br>

			<input type="submit" value="DELETE">



		</form>

	</div>


</body>
</html>