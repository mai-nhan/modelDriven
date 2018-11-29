<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="login">
	<s:textfield name="id" label="ID"></s:textfield>
	<s:textfield name="name" label="Name"></s:textfield>
	<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>