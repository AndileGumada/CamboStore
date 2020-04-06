<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th>Description</th>
				<th>Status</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${products}" var="product">
				<tr>
				<td>${product.productName}</td>
				<td>${product.productCategory}</td>
				<td>${product.productPrice}</td>
				<td>${product.productDescription}</td>
				<td>${product.productStatus}</td>
			</tr>
			
			
			</c:forEach>
		
		</tbody>
	</table>
</body>
</html>