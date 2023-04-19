<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 목록</title>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>장바구니 목록</h3>			
			</div>
			<%@ include file="../menu.jsp" %>
			<c:set var = "total" value = "0" />
			<table class="w3-table w3-striped w3-centered">
				<thead>
					<tr>
						<th>이름</th>
						<th>가격</th>
						<th>수량</th>
						<th>금액</th>
						<th>취소</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cartList}" var="list">
						<tr>
							<td><a href="../shop/detail?product_id=${list.product_id}" >${list.p_name}</a></td>
							<td><fmt:formatNumber value="${list.p_price}" pattern="#,###"/>원</td>
							<td>${list.amount}개</td>
							<td><fmt:formatNumber value="${list.cart_money}" pattern="#,###"/>원</td>
							<td>
								<input type="submit" onclick="location.href='./cartDelete?Cart_id=${list.cart_id}'"
									class="btn btn-info tab-button"
									value="장바구니에서 빼기">
							</td>
						</tr>
						<c:set var= "total" value="${total + list.cart_money}"/>
					</c:forEach>
					<tr>
						<td colspan="4">
							결제 예정 금액  :<fmt:formatNumber value="${total}" pattern="#,###"/>원 
						</td>
						<td colspan="1">
							<form method="post" action="./cartPay">
							<input type="hidden" name="c_id" value="${member.c_id}">
							<input type="hidden" name="total" value="${total}">
							<input type="submit" class="btn btn-danger tab-button"
									value="결제하기">
							</form>
						</td>
					</tr>
				</tbody>
			</table>
			<p class="w3-center">
				<button type="button" onclick="location.href='../shop/list'"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
			</p>
			
		</div>
	</div>
</body>
</html>