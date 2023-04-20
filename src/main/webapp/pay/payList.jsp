<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 이력</title>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>결제 이력</h3>			
			</div>
			<%@ include file="../menu.jsp" %>
		<c:choose>
	      <c:when test="${not empty member.c_id}" >
			<table class="w3-table w3-striped w3-centered">
				<thead>
					<tr>
						<th>결제일자</th>
						<th>결제금액</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${paylist}" var="list">
						<tr>
							<fmt:parseDate value="${list.pay_date}" pattern="yyyy-MM-dd'T'HH:mm:ss" var="parseTime" type="both"/>
							<td><fmt:formatDate value="${parseTime}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
							<td><fmt:formatNumber value="${list.total}" pattern="#,###"/>원</td>
						</tr>
					</c:forEach>
				</tbody>
				</table>
				</c:when>
				</c:choose>
		<c:choose>
	      <c:when test="${not empty manager.m_id}" >
			<table class="w3-table w3-striped w3-centered">
				<thead>
					<tr>
						<th>번호</th>
						<th>결제 유저</th>
						<th>결제일자</th>
						<th>결제금액</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${paylistM}" var="list">
						<tr>
							<td>${list.pay_id}</td>
							<td>${list.c_id}</td>
							<fmt:parseDate value="${list.pay_date}" pattern="yyyy-MM-dd'T'HH:mm:ss" var="parseTime" type="both"/>
							<td><fmt:formatDate value="${parseTime}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
							<td><fmt:formatNumber value="${list.total}" pattern="#,###"/>원</td>
						</tr>
					</c:forEach>
				</tbody>
				</table>
				</c:when>
				</c:choose>
			<p class="w3-center">
				<button type="button" onclick="location.href='../main/main'"
					class="w3-button w3-block w3-blue w3-ripple w3-margin-top w3-margin-bottom w3-round">메인으로 돌아가기</button>
			</p>
		
		</div>
	</div>
	
</body>
</html>