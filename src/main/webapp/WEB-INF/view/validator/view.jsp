<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-11-07
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validator  view</title>
</head>
<body>
    <h2>view.jsp</h2>
    <form action="/validator/result" method="post">
        <input type="text" name="userId" /> <br />
        <input type="text" name="name" /> <br />
        <input type="password" name="pass" /> <br />
        <input type="submit"value="전송" /> <br />
    </form>
</body>
</html>
