<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>회원가입</h3>
			</div>

			<button type="button" onclick="location.href='./memberjoin'"
				class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-margin-bottom w3-round">
				일반 회원 가입</button>
			<button type="button" onclick="location.href='./managerjoin'"
				class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-margin-bottom w3-round">
				기업 회원 가입</button>
			<button type="button" onclick="history.go(-1);"
				class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
		</div>
	</div>
</body>
</html>