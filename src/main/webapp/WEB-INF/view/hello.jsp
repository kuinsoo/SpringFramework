<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
	<h2>rangers</h2>
	<c:forEach items="${rangers}" var="name" varStatus="i">
		ranger ${i.index +1 }호 : ${name } <br />
	</c:forEach>

	<h2>/hello/request</h2>
	<form action="/hello/request" method="post">
		userId 	 :<input type="text" name="userId" value="edword" /> 
		password :<input type="password" name="pass" value="1234" />
		 		  <input type="submit" value="전송" />
	</form>
	
	
	<h2>/hello/vo</h2>
	<form action="/hello/vo" method="post">
		userId 	 :<input type="text" name="userId" value="에드워드" /> 
		password :<input type="password" name="pass" value="1234" />
		 		  <input type="submit" value="전송" />
	</form>

</body>
</html>