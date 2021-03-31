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
        
        a{
        font-size:23px;
        color : blue;
        }
	
	</style>

</head>
<body background = "images.jpg">

<form action = "updateFruit">

	<div class = "transbox">
	<p>
	
	<h1>
		Update a Fruit in your existing database
	</h1>
	
	<b>
			Click on the update you would like to perform
		</b><br><br>
		
		<div class = "row">
		<br>
		</div>
		
		<div class = "row">
		
				<a href = "updateByID.jsp" style = "margin-left:10px">
					Update By ID
				</a>
		
		
				<a href = "updateByName.jsp" style = "margin-left:80px">
					Update By Name
				</a>
		
		</div>
		
		<div class = "row">
		<br><br>
		</div>
		
		<div class = "row">
		
				<a href = "updateByColor.jsp">
				Update By Color
		</a>
		
		<a href = "updateByPrice.jsp" style = "margin-left : 50px">
			Update By Price
		</a>
		
		</div>
		
		<div class = "row"><br></div>
		
		
	
	</p>
	</div>

	
</form>

</body>
</html>