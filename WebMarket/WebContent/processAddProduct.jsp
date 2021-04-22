<%@page import="DAO.ProductRepository"%>
<%@page import="DTO.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String productId = request.getParameter("productId");
	String name = request.getParameter("name");
	String unitPrice = request.getParameter("unitPrice");
	String description = request.getParameter("description");
	String manufacturer = request.getParameter("manufacturer");
	String category = request.getParameter("category");
	String unitsInStock = request.getParameter("unitsInStock");
	String condition = request.getParameter("condition");
	int unitPrice_i = Integer.parseInt(unitPrice);
	int unitsInStock_i = Integer.parseInt(unitsInStock);
	
	Product product = new Product(
						productId, name, unitPrice, description, manufacturer, 
						category, unitsInStock, condition
						);
	
	// 상품 정보 저장
	// ProductRepository 객체 생성을 제한 (싱글턴 패턴)
	ProductRepository pr = ProductRepository.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>