<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>마이페이지</h3>
			</div>
			<div>
				<form id="myForm" action="./update_Memberpage" method="post">
					<p>
						<label>아이디</label> 
						<input class="w3-input" type="text" id="c_id" name="c_id" readOnly value="${ member.c_id }"> 
					</p>			
					<p>
						<label>비밀번호</label> 
						<input class="w3-input" type="text" id="c_pass" name="c_pass" value="${ member.c_pass }"> 
					</p>
					<p>
						<label>성명</label> 
						<input class="w3-input" type="text" id="c_name" name="c_name" value="${ member.c_name }"> 
					</p>
					<p>
						<label>연락처</label> 
						<input class="w3-input" type="text" id="c_phone" name="c_phone" value="${ member.c_phone }"> 
					</p>
					<p class="w3-center">
						<button type="submit" class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">회원정보 변경</button>
					</p>
				</form>
			</div>
		</div>
	</div>
	
	<script>
	$(function(){
		if(${msg ne null}){
			alert('${msg}');
		};
	})
</script>

	
</body>
</html>