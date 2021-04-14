<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tag</title>
</head>
<body>
	<%!
		int variable = 50;
	%>
	
	<%
		out.println("Value of the variable is: " + variable);
	%>
</body>
</html>