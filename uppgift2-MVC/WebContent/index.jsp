<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Window</title>
</head>
<body>

	<form action="Controller" method="post">
		Username: <input type="text" placeholder="Enter Username" name="uname" required> 
		Password: <input type="password" placeholder="Enter Password" name="password" required> 
		<input type="submit" value="Submit" />
	</form>

</body>
</html>