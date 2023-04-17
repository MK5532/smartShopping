<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="UTF-8">
<title>일반 회원가입</title>
</head>
<body>

	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>회원가입</h3>
			</div>
			<div>
				<form id="joinForm" action="./memberjoin" method="post">
					<p>
						<label>아이디</label> <input name="C_id" id="C_id" class="w3-input"
							required> <span id="id_check" class="w3-text-red"></span>
					</p>
					<p>
						<label>패스워드</label> <input name="C_pass" id="C_pass"
							class="w3-input" type="password" required>
					</p>
					<p>
						<label>이름</label> <input name="C_name" id="C_name"
							class="w3-input" required>
					</p>
					<p>
						<label>연락처</label> <input name="C_phone" id="C_phone"
							class="w3-input" required>
					</p>
					<p class="w3-center">
						<button type="submit" id="join_button"
							class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">가입하기</button>
					</p>
					<p class="w3-center">
						<button type="button" onclick="history.go(-1);"
							class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
					</p>
				</form>
			</div>

		</div>
	</div>

	<script>
		$(function() {
			$("#C_id").keyup(function() {
				$.ajax({
					url : "./memeber/check_id.do",
					type : "POST",
					data : {
						C_id : $("#C_id").val()
					},
					success : function(result) {
						if (result == 1) {
							$("#id_check").html("중복된 아이디가 있습니다.");
							$("#join_button").attr("disabled", "disabled");
						} else {
							$("#id_check").html("");
							$("#join_button").removeAttr("disabled");
						}
					},
				})
			});

		})
	</script>
</body>

</html>