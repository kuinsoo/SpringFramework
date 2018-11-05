<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- css/js 연결 uri  -->
<c:set var="uri" value="https://bootswatch.com" scope="session" />

<!-- head.jsp -->
<%@ include file="/WEB-INF/view/head.jsp" %>
<link rel="stylesheet" href="/css/login.css">

<div class="container">

	<!-- 로그인 폼 -->
	<div class ="centerContainer" >
	<!-- 이미지 -->
	<img style="height: 200px; width: 399px; display: block;" src="https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/2UUt/image/9U7iIO4GDVEqe2-H6368Pj12XLY.jpg" alt="Card image">
		<form action="/user/loginProcess" method="POST"  >
		    <div class="form-group loginInput">
		      <br />
		      <label for="exampleInputEmail1">Email address</label>
		      <input type="text" name="userId"  value="brown" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required="required">
		      <small id="emailHelp" class="form-text text-muted">Email : email@example.com</small>
		    </div>
		    <div class="form-group loginInput">
		      <label for="exampleInputPassword1">Password</label>
		      <input type="password" name="pass" value="brownpass" class="form-control" id="exampleInputPassword1" placeholder="Password" required="required">
		    </div>
		     <br />
		    <button type="submit" class="btn btn-primary loginInput">로그인</button>
		</form>
    </div>
    
</div>

<!-- script src -->
<%@ include file="/WEB-INF/view/scripts.jsp" %>
