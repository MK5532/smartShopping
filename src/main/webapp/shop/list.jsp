<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 리스트</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
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
	<c:choose>
	      <c:when test="${not empty member.c_id}" >
			<table class="w3-table w3-striped w3-centered">
				<thead>
					<tr>
						<th>번호</th>
						<th>이름</th>
						<th>가격</th>
						<th>수량</th>
						<th>장바구니</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${Productlist}" var="list">
						<tr>
							<td>${list.product_id}</td>
							<td><a href="./detail?product_id=${list.product_id}" >${list.p_name}</a></td>
							<td><fmt:formatNumber value="${list.p_price}" pattern="#,###"/>원</td>
							<c:choose>
								<c:when test="${list.p_stock==0}">
									<td><span style="color:red">품절</span></td>
								</c:when>
								<c:otherwise>
									<td>${list.p_stock}개</td>
								</c:otherwise>
							</c:choose>
							<td>
							<form method="post" action="../cart/insert">
								<input type="hidden" name="product_id" value="${list.product_id}">
								<input type="hidden" name="c_id" value="${member.c_id}">
								<c:choose>
								<c:when test="${list.p_stock==0}">
									<input disabled
									class="btn btn-danger tab-button"
									value="장바구니에 담을 수 없습니다">
								</c:when>
								<c:otherwise>
								<select name="amount">
									<c:forEach begin="1" end="10" var="i">
										<option value="${i}">${i}</option>
									</c:forEach>
								</select>&nbsp;개
								<input type="submit"
									class="btn btn-info tab-button"
									value="장바구니에 담기">
								</c:otherwise>
								</c:choose>
							</form>								
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	      </c:when> 
	      <c:when test="${not empty manager.m_id}">
			<table class="w3-table w3-striped w3-centered">
				<thead>
					<tr>
						<th>번호</th>
						<th>이름</th>
						<th>가격</th>
						<th>수량</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${Productlist}" var="list">
						<tr>
							<td><a href="./detail?product_id=${list.product_id}" >${list.product_id}</a></td>
							<td>${list.p_name}</td>
							<td><fmt:formatNumber value="${list.p_price}" pattern="#,###"/>원</td>
							<c:choose>
								<c:when test="${list.p_stock==0}">
									<td><span style="color:red">품절</span></td>
								</c:when>
								<c:otherwise>
									<td>${list.p_stock}개</td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<p class="w3-center">
				<button type="submit" onclick="location.href='../shop/product_InsertForm'"
					class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">상품 추가</button>
			</p>
	      </c:when> 
	</c:choose> 

			<p class="w3-center">
				<button type="button" onclick="location.href='../main/main'"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
			</p>
		</div>
	</div>
</body>
</html>