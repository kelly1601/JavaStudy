<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i = 2; i <= 9; i++) {
			out.println("<h3>" + i + "단" + "<br>" + "</h3>");
			for(int a = 1; a <= 9; a++) {
				out.println(i + " * " + a + " = " + (a*i) + "<br>");
			}
		}
	%>
</body>
</html>