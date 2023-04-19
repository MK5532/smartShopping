<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="UTF-8">
<title>상품 추가하기</title>
<style>
input[type="number"]::-webkit-outer-spin-button,
input[type="number"]::-webkit-inner-spin-button {
    -webkit-appearance: none;
    margin: 0;
}
</style>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>상품 추가하기</h3>
			</div>
			<div>
				<form action="./product_Insert" method="post">
					<p>
						<label>이름</label> <input name="P_name" id="P_name" class="w3-input"
							required> <span id="id_check" class="w3-text-red"></span>
					</p>
					<p>
						<label>가격</label> <input name="P_price" id="P_price"
							class="w3-input" type="number" required>
					</p>
					<p>
						<label>수량</label> <input name="P_stock" id="P_stock"
							class="w3-input" type="number" required>
					</p>
					<p>
						<label>설명</label> <input name="P_expl" id="P_expl"
							class="w3-input" required>
					</p>
					<p>
						<input type="hidden" name="M_id" value="${ manager.m_id }">
					</p>
					<p>
						<label>쇼핑몰 상호</label> <input name="P_corp" id="P_corp"
							class="w3-input" value="${ manager.m_corp }" readOnly>
					</p>
					<p class="w3-center">
						<button type="submit" id="product_insert"
							class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">상품 추가</button>
					</p>
					<p class="w3-center">
						<button type="button" onclick="history.go(-1);"
							class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">돌아가기</button>
					</p>
				</form>
			</div>
		</div>
	</div>
</body>
</html>