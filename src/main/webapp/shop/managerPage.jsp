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
				<form id="myForm" action="./update_managerPage" method="post">
					<p>
						<label>아이디</label> 
						<input class="w3-input" type="text" id="m_id" name="m_id" readOnly value="${ manager.m_id }"> 
					</p>			
					<p>
						<label>비밀번호</label> 
						<input class="w3-input" type="text" id="m_pass" name="m_pass" value="${ manager.m_pass }"> 
					</p>
					<p>
						<label>성명</label> 
						<input class="w3-input" type="text" id="m_name" name="m_name" value="${ manager.m_name }"> 
					</p>
					<p>
						<label>연락처</label> 
						<input class="w3-input" type="text" id="m_phone" name="m_phone" value="${ manager.m_phone }"> 
					</p>
					<p>
						<label>상호</label> 
						<input class="w3-input" type="text" id="m_corp" name="m_corp" value="${ manager.m_corp }"> 
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