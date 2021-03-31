<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update your database</title>

	<style>
	
	body {
		text-align : center;
		font-weight : bold;
		font-size : 20px;
	
	}
	
		div.transbox {
      margin: 10px;
      margin-top: 100px;
      margin-left: 250px;
      margin-right: 250px;
      background-color: #ffffff;
      border-style: double;
      border-color: black;
      border-width: 2px;
      border-radius: 8px;
      opacity: 0.75;
    }
    div.transbox p {
      margin: 2%;
      padding-top: 3px;
      font-weight: bold;
      color: #000000;
    }
    
    input[type=text] {
      padding: 10px 10px;
      margin: 8px;
      box-sizing: border-box;
      border-width: 3px;
    }
    
    input[type=number] {
      padding: 10px 5px;
      margin: 8px;
      box-sizing: border-box;
      border-width: 3px;
    }
    
    input[type=submit] {
            font-size: 15px;
            background-color: black;
            color: white;
            font-size: 15px;
            font-weight: bold;
            padding: 12px 40px;
            text-decoration: none;
            margin: 2px 2px;
            cursor: pointer;
            border-style: solid;
            border-color: black;
            border-width: 2px;
            border-radius: 8px;
        }
	
	</style>

</head>
<body background = "images.jpg">

<form action = "updateByName">

	<div class = "transbox">
	<p>
	
	<h1>
		Update a Fruit in your existing database
	</h1>
		
	<h3>
		Please enter the following details
	</h3>
	
	Name :
		<input type = "text" name = "name"> <br><br>
		
		Enter details to be updated : <br>
		
	Color : 
		<input type = "text" name = "color"> <br>
	Price :
		<input type = "number" step = "any" name = "price"><br><br>
		
		<input type = "submit" value = "UPDATE">
		
		
	
	</p>
	</div>

	
</form>

</body>
</html>