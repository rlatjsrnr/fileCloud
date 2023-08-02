<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileCloud</title>
</head>
<body>
	<div id="loginContainer">
		<form action="login" method="post">
			<table>
				<tr>
					<th colspan="2"><h2>Login</h2></th>
				</tr>
				<tr>
					<td><span>id : </span></td>
					<td><input type="text" name="id" required/></td>
				</tr>
				<tr>
					<td><span>password :</span></td>
					<td><input type="password" name="password" required/></td>
				</tr>
				<tr>
					<th colspan="2"><button>login</button> | <input type="button" value="join" onclick="join();" /></th>
				</tr>
			</table>
		</form>
	</div>
</body>
<script>
	function join(){
		location.href='join';		
	}
	
</script>
</html>

