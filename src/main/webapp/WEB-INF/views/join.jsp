<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
</head>
<body>
	<div id="joinContainer">
		<form action="joinSubmit" method="post">
			<table>
				<tr>
					<th colspan="2"><h2>Join</h2></th>				
				</tr>
				<tr>
					<td>id : </td>
					<td><input type="text" name="id" required/></td>
				</tr>
				<tr>
					<td>password : </td>
					<td><input type="password" name="password" required/></td>
				</tr>
				<tr>
					<td>password Check : </td>
					<td><input type="password" name="passowrdCheck" required/> </td>
				</tr>
				<tr>
					<td>name : </td>
					<td><input type="text" name="name" required/></td>
				</tr>
				<tr>
					<th colspan="2"><button>회원가입</button></th>
				</tr>	
			</table>
			
			
		</form>
	</div>
</body>
</html>