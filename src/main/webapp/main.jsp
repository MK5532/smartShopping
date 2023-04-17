<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>스마트 쇼핑몰</title>
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
				<h3>스마트 쇼핑몰 메인화면</h3>
			</div>
			<nav id="tab-button-nav">
				<div class="btn-group">
					<button type="button" class="btn btn-info tab-button"
						>마이페이지</button>
					<button type="button" class="btn btn-info tab-button"
						 onclick="location.href='./logout'">로그아웃</button>
				</div>
			</nav>
		</div>
	</div>
</body>
</html>