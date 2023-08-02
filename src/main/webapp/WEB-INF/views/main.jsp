<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
</body>
</html>