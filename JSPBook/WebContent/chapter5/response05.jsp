<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setIntHeader("Refresh", 5);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>현재 시간은 <%= java.time.LocalDateTime.now() %></p>
<!-- 	<a href ></a> -->
</body>
</html>