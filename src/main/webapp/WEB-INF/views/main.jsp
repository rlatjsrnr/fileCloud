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
	<form method="post" action="upload" enctype="multipart/form-data">
            <ul>
                <li>이미지 파일
                    <input type="file" multiple="multiple" name="image">
                    <input type="submit" id="submit" value="전송" />
                </li>
            </ul>
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