<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 완료</title>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>결제 완료 ! QR를 저장해주세요 !</h3>			
			</div>
			<%@ include file="../menu.jsp" %>
			<form method="post" action="./qr">
				<input type="hidden" id="total" name="total" value="${param.total}">
				<table class="w3-table w3-striped w3-centered">
					<tr>
						<td>
						총 결제 금액 : <fmt:formatNumber value="${param.total}" pattern="#,###"/>원
						</td>
						<td>
						<input type="submit" class="btn btn-danger tab-button" value="QR 코드 저장하기">
						</td>
					</tr>
				</table>
				
			</form>
			<p class="w3-center">
				<button type="button"  onclick="location.href='../pay/payList'"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">결제 이력 확인</button>
			</p>

			<p class="w3-center">
				<button type="button" onclick="location.href='../main/main'"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">메인으로 돌아가기</button>
			</p>
			
		</div>
	</div>
</body>
</html>