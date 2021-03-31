<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display from database</title>

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
      padding-left : 3px;
      padding-right : 3px;
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
        
        table, th, td {
  border: 1px solid black;
}

a{
	color : blue;
}
	
	</style>

</head>
<body background = "images.jpg">

<form action = "call">

<div class = "transbox">
	<p>
	
	<h1>
		All items in your existing database
	</h1>
	
	<table style = "width:80%" >
		<tr>
			<th> <b> Fruit ID </b> </th>
			<th> <b> Fruit Name </b> </th>
			<th> <b> Fruit Color </b> </th>
			<th> <b> Fruit Price </b> </th>
						
		</tr>
		
			<c:forEach var = "fruit" items = "${fruitsList}">
				
		<tr>
			
			<td> ${fruit.getFruitID()} </td>
			<td> ${fruit.getFruitName()} </td>
			<td> ${fruit.getFruitColor()} </td>
			<td> ${fruit.getFruitPrice()} </td>
			<td> <a href = 'update.jsp'>Update</a> </td>
			<td> <a href = 'deleteByID.jsp'>Delete</a> </td>
			
		</tr>
		
		</c:forEach>
		
	</table>
	
		<!-- <input type = "submit" value = "DISPLAY"> -->
	
	</p>
	</div>

</form>

	

</body>
</html>