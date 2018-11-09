<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-11-08
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>국제화</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" ></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#locale').val($('#locale'));
           $('#locale').on('change',function () {
                 $('#frm').submit();
           }) ;
        });
    </script>
</head>
<body>
<form method="post" action="/messageView" id="frm">
    hello   : <spring:message code="visitor" /> <br/>
    visitor : <spring:message code="hello" />  <br/>
<select id="locale"  name="lang">
    <option value="kr">한국어</option>
    <option value="en">English</option>
    <option value="ja">日本語</option>
</select>
</form>
</body>
</html>
