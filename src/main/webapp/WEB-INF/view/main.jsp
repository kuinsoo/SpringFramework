<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>



<!DOCTYPE html>
<html>
<head>
<!-- head.jsp -->
<%@ include file="/WEB-INF/view/head.jsp" %>
<link rel="stylesheet" href="/css/sb-admin.css">
<link rel="stylesheet" href="/css/main.css">
</head>
<body>
<!-- navbar.jsp -->
<%@ include file="/WEB-INF/view/navbar.jsp" %>


<div id="wrapper">
<!-- side -->
<%@ include file="/WEB-INF/view/sidebar.jsp" %>
 	
	<div id="content-wrapper">
		<div class="container-fluid">
<!-- container -->
			<!-- <div class="container"> -->
			<div class="jumbotron">
			  <h1 class="display-3">Wellcome to The KKu! island</h1>
			  <p class="lead">기회는 준비하고 도전하지 않으면 잡을 수 없다.</p>
			  <hr class="my-4">
			  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
			  <p class="lead">
			    <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
			  </p>
			</div>
			<!-- </div>  --><!-- end container -->
<!-- footer -->
<%@ include file="/WEB-INF/view/footer.jsp" %>
		</div>
	</div> <!-- content-wrapper -->
</div> <!-- wrapper -->
<!-- script src -->
<%@ include file="/WEB-INF/view/scripts.jsp" %>
</body>
</html>