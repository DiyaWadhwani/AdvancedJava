
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>

	body {
		margin-top: 20px;
		background-image: url("registerBG.png");
		background-position: -155px -250px;
		background-attachment:fixed;
		text-align: center;
	} 
	
	.header {
		position:fixed;
		height : 20px;
		width : 40%;
		margin-top: 45px;
		margin-left: 400px;
		text-align : center;
		font-size: 30px;
		color: black;
		padding-top: 20px;
		padding-bottom: 40px;	
		background-color: LightYellow;
		opacity: 0.7;
		border-color: DarkGreen;
		border-style: solid;
		border-radius : 8px;
		box-shadow: 7px 7px 7px black;
	}
	
	.transbox {
		margin-left : 350px;
		margin-right : 350px;
		margin-bottom : 150px;
		padding-bottom : 50px;
		margin-top : 100px;
		padding-top : 30px;
		background-color: LightYellow;
		opacity: 0.7;
		border-color: DarkGreen;
		border-style: solid;
		border-radius : 8px;
		box-shadow: 7px 7px 7px black;
		
	}
	
	input, select, textarea{
    color: #000000;
}

textarea:focus, input:focus {
    color: #000000;
}

</style>


<body>


<script type="text/javascript">

function validate() {
	
	if(document.getElementById('register').clicked == true) {
		return true;
	}
	
	var usn = document.login.studUSN;
	var dob = document.login.studDOB;
	
	if(usn_validate(usn)) {
		if(dob_validate(dob)) {
			return true;
		}
		
		return false;
	}
}
	function usn_validate(usn) {
		
		var usnLength = usn.value.length;
		/* var usnFormat = ^\d[a-zA-Z]\w{1}\d{2}[a-zA-Z]\w{1}\d{3}$; */
		
		if(usnLength == 0 || usnLength < 10 || usnLength > 10) {
			alert("USN MUST BE 10 CHARACTERS");
			return false;
		}
		else {
			/* if(usn.value.match(usnFormat)) {
				return true;
			}
			else {
				alert("FORMAT FOR USN IS INVALID");
				return false;
			} */
			return true;
			
		}
	}
	
	function dob_validate(dob) {
		if(dob.value != "") {
			return true;
		}
		else {
			alert("PLEASE ENTER DOB");
			return false;
		}
	}

</script>

<form name = "login" action = "log.do" onsubmit = "return validate();">
	
		<div class = "header">
			Welcome to AMH Portal
		</div>
		
		<div class = "row">
			<br><br><br><br><br>
		</div>
		
	<div class = "transbox">
	
		<h2>Please enter the following details to login</h2><br><br>
		
			USN : 
				<input type = "text" name = "studUSN"> <br><br>
			DOB :
				<input type = "date" name = "studDOB"> <br><br>
				
			<input type = "submit" value = "LOGIN">
			
			&nbsp;&nbsp;&nbsp;

			<input type = "submit" id = "register" formaction="registration.jsp" value = "REGISTER">
	</div>
	
</form>

</body>
</html>