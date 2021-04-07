<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>


 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Details</title>

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
	
		table, th, td {
  border: 1px solid black;
}

th, td{
	padding: 10px;
}

a{
	font-size:20px;
	color:brown;
}

	</style>
</head>
<body background = "image.jpg" style = "text-align:center">
	
	<div class = "transbox">
	
		<h1>
			Listing of all the books in our Library
		</h1>
		
		<div align = "center">
		
			<table style="text-align:center">
			
			<tr>
			
				<th>ID</th>
				<th>Name</th>
				<th>No. of Pages</th>
				<th>Price</th>
				<th>Actions</th>
				
			</tr>
			
			<c:forEach var = "book" items = "${booksList}">
			
			<tr>
			
				<td> ${book.getBookID()} </td>
				<td> <c:out value = "${book.getBookName()}"/> </td>
				<td> <c:out value = "${book.getBookPages()}"/> </td>
				<td> <c:out value = "${book.getBookPrice()}"/> </td>
				<td> 
					<a href = "update.jsp">UPDATE</a> 
					&nbsp;&nbsp;&nbsp;
					<a href = "delete.jsp">DELETE</a>
				</td>
				
			</tr>
			
			</c:forEach>
			
		</table>	
		
		</div>
		
		<br><br>
		<a href = "library.jsp">Go Back to Home Page</a>
		
	</div>
	

</body>
</html>