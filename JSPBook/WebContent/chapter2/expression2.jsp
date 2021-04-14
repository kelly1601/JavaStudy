<%@page import="java.util.Random"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Set<Integer> lotto = new HashSet<>();
%>
<%
	Random ran = new Random();
	while(lotto.size() < 6) {
		int number = ran.nextInt(45) + 1;
		lotto.add(number);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression2</title>
</head>
<body>
	<!-- HTML 주석 -->
	<%-- JSP 주석 --%>
	<h1>! 로또 번호 생성 프로그램 !</h1>
	
	<p>이번 주 1등 예상 번호</p>
	
	<%
		for (int number : lotto) {
	%>
			<%=number %>
	<% 
		}
	%>
</body>
</html>