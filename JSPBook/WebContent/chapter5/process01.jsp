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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String host = request.getHeader("host");
		String acceptLanguage = request.getHeader("accept-language");
		
		int contentLength = request.getContentLength();
		String method = request.getMethod();
		String URI = request.getRequestURI();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		
		String clientIP = request.getRemoteAddr();
		String myIP = "192.168.2.33";
	%>
	
	<%
	method = method.toLowerCase();
	if (method.equals("get")) {
	%>
		<strong>POST 방식으로 호출해 주세요</strong>
	<%
	} else {
		if (clientIP.equals(myIP)) {
	%>
			<p>아이디: <%= id %></p>
			<p>비밀번호: <%= pw %></p>
			<p>호스트: <%=host %></p>
			<p>설정된 언어: <%=acceptLanguage %></p>
			<p>요청 정보 길이: <%=contentLength %></p>
			<p>클라이언트 전송 방식: <%=method %></p>
			<p>URI: <%=URI %></p>
			<p>서버 이름: <%=serverName %></p>
			<p>서버 포트: <%=serverPort %></p>
			<p>클라이언트 IP: <%=clientIP %></p>
	<%
		} else {
	%>
			<strong>권한이 없는 사용자입니다.</strong>
	<%
		}
	}
	%>
	
	
</body>
</html>