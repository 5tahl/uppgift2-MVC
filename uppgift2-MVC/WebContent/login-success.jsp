<%@ page import="mvc.ModelBean" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged in</title>
</head>
<body>

	<p>You are logged in</p>

	<%
	ModelBean bean = (ModelBean)request.getAttribute("bean");
	
	out.print("Welcome " + bean.getUsername());	
	%>


	<form action="LogoutServlet" method="post">
		<input type="submit" value="Logout">
	</form>


</body>
</html>