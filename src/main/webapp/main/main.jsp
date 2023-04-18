<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<style>
nav {
	margin-bottom: 10px;
	float: right;
}
</style>
<title>스마트 쇼핑몰</title>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>스마트 쇼핑몰</h3>
			</div>
			<%@ include file="../menu.jsp" %>
			<button type="submit" onclick="location.href='../shop/list'"
				class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">상품	보기</button>
		</div>
	</div>
</body>
</html>