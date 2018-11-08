<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
    <!-- head.jsp -->
    <link rel="stylesheet" href="/css/sb-admin.css">
    <link rel="stylesheet" href="/css/main.css">
    <%@ include file="/WEB-INF/view/common/basicLib.jsp" %>
    <tiles:insertAttribute name="header"/>
</head>
<body>
<!-- navbar.jsp -->
<%@ include file="/WEB-INF/view/navbar.jsp" %>

<tiles:insertAttribute name="left"/>

<tiles:insertAttribute name="content" />

<!-- script src -->
<%@ include file="/WEB-INF/view/scripts.jsp" %>
</body>
</html>