<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<style>
nav {
	margin-bottom: 10px;
	float: right;
}
</style>

</head>
<body>
	<c:choose>
	      <c:when test="${not empty member.c_id}" >
			<nav id="tab-button-nav">
				<div class="btn-group" id="member">
					<div class="btn btn-info tab-button"><a href="../main/memberPage">마이페이지(${member.c_id})</a></div>
					<div class="btn btn-info tab-button"><a href="../cart/cartList">장바구니 확인</a></div>
					<button type="button" class="btn btn-info tab-button"
						 onclick="location.href='../join/logout'">로그아웃</button>
				</div>
			</nav>
	      </c:when> 
	      <c:when test="${not empty manager.m_id}">
			<nav id="tab-button-nav">
				<div class="btn-group" id="manager">
					<div class="btn btn-info tab-button"><a href="../main/managerPage">마이페이지(${manager.m_id})</a></div>
					<button type="button" class="btn btn-info tab-button"
						 onclick="location.href='../join/logout_M'">로그아웃</button>
				</div>
			</nav>
	      </c:when> 
	</c:choose> 

	<br />
	<br />
	<br />
</body>
</html>