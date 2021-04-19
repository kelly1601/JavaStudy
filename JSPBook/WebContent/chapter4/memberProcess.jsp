<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="chapter4.MemberBean" />
<jsp:setProperty property="name" name="member" param="name"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>ex3.jsp 페이지에서 전달받은 name 요청 프로퍼티의 값 = <%=member.getName() %></p>
</body>
</html>