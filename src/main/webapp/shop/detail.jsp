<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 화면</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style>
nav {
	margin-bottom: 10px;
	float: right;
}
</style>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>상품 일람</h3>			
			</div>
			<%@ include file="../menu.jsp" %>
			<table class="w3-table w3-striped w3-centered">
				<tbody>
					<tr>
						<th>이름</th>
						<td>
						${product.p_name}
						</td>
					</tr>
					<tr>
						<th>가격</th>
						<td>
						<fmt:formatNumber value="${product.p_price}" pattern="#,###"/>원
						</td>
					</tr>
					<tr>
						<th>수량</th>
						<c:choose>
								<c:when test="${product.p_stock==0}">
									<td><span style="color:red">품절</span></td>
								</c:when>
								<c:otherwise>
									<td>${product.p_stock}개</td>
								</c:otherwise>
						</c:choose>
						
					</tr>
					<tr>
						<th>설명</th>
						<td>
						${product.p_expl}
						</td>
					</tr>
					<tr>
						<th>소유 쇼핑몰</th>
						<td>
						${product.corp}
						</td>
					</tr>
				</tbody>
			</table>
			<p class="w3-center">
				<button type="button" onclick="history.go(-1);"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
			</p>
			
	</div>			
</div>


</body>
</html>