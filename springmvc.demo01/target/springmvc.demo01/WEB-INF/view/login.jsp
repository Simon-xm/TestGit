<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/view/share/basepath.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/WEB-INF/view/share/common.jsp" %>
<title>login</title>
</head>
<body>
	<input type="hidden" id="msgHide" value="${msg }"/>
	<div>
		<form:form modelAttribute="userDto" action="doLogin.do" id="form" method="post">
			<table>
				<tr>
					<td>NAME:</td>
					<td><input type="text" name="name" value="${userDto.name }"/></td>
				</tr>
				<tr>
					<td>PASS:</td>
					<td><input type="text" name="pass" value="${userDto.pass }"/></td>
				</tr>
				<tr>
					<td>COMPANY:</td>
					<td><input type="text" name="jobDto.company" value="${userDto.jobDto.company }"/></td>
				</tr>
			</table>
		</form:form>
		<table>
			<tr><td><input type="button" id="login" value="Login" onclick="doLogin();"></td></tr>
		</table>
	</div>
</body>
<script type="text/javascript">
	alertMsg();
	function doLogin(){
		document.getElementById("form").submit();
	}
</script>
</html>