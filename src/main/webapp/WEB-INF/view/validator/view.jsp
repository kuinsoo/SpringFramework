<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-11-07
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>validator  view</title>
</head>
<body>
    <h2>view.jsp-SpringValidator</h2>
    <form action="/validator/validate" method="post">
        <input type="text" name="userId" value="${param.userId}" />     <form:errors path="userVo.userId" /> <br />
        <input type="text" name="name" value="${param.name}" />       <form:errors path="userVo.name" /> <br />
        <input type="password" name="pass" value="${param.pass}" />   <form:errors path="userVo.pass" /> <br />
        <input type="submit"value="전송" />
    </form>

    <h2>view.jsp-jsr303</h2>
    <form action="/validator/validateJsr" method="post">
        <input type="text" name="userId" value="${param.userId}" />     <form:errors path="userVo.userId" /> <br />
        <input type="text" name="name" value="${param.name}" />       <form:errors path="userVo.name" /> <br />
        <input type="password" name="pass" value="${param.pass}" />   <form:errors path="userVo.pass" /> <br />
        <input type="submit"value="전송" />
    </form>
</body>
</html>
