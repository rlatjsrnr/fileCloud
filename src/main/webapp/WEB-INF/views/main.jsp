<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<form action="upload" method="post">
		<input type="file" id="upload" name="upload" style="display:none" multiple />
		<a href="" onclick="document.getElementById('upload').click(); return false">Upload Image</a>
		<button>보내기</button>
	</form>
	<br/>
	<hr/>
	<br/>
	<div id="container">
		<c:forEach var="list" items="${imgList}">
			<c:choose>
				<c:when test="${!empty list}">
					<div class="imgBox">
						<img src="${list}" />
					</div>
				</c:when>
				<c:otherwise>
				
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
</body>
</html>