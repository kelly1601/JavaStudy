<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	// 요청 파라미터의 이름을 전부 가져옴
	Enumeration<String> names = request.getParameterNames();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>요청 파라미터의 이름</th>
			<th>요청 파라미터의 값</th>
		</tr>
	</table>
	
	<%
		while(names.hasMoreElements()) {
			out.println("<tr>");
			
			String name = names.nextElement();
			// 요청 파라미터의 이름을 사용해서
			// 요청 파라미터의 값 출력하기
			String value = request.getParameter(name);
			
			out.println("<td>" + name + "</td>");

			out.println("<td>요청 파라미터의 값</td>");
			
			out.println("</tr>");
		}
	%>

</body>
</html>