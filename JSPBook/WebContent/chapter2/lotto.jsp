<%@page import="java.util.Random"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 로또 번호 저장할 변수 선언 -->
<%! Set<Integer> lotto = new HashSet<>(); %>

<!-- 로또 번호 저장할 자바 소스 코드 -->
<%
	Random rad = new Random();
	while (lotto.size() < 6) {
		int number = rad.nextInt(45) + 1;
		lotto.add(number);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로또 번호 생성 프로그램!</h1>
	<p>이번 주 1등 예상 번호</p>
	
	<!-- 당첨 번호 출력 -->
	<%
		for (int number : lotto) {
	%>
		<%=number %>
	<%
		}
	%>
	
</body>
</html>