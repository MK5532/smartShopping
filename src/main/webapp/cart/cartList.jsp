<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			
			<p class="w3-center">
				<button type="button" onclick="location.href='../shop/list'"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
			</p>
			
		</div>
	</div>
</body>
</html>