<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-11-09
  Time: 오전 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common/basicLib.jsp"%>
<html>
<head>
    <title>ajax view</title>
    <script type="text/javascript">
        $(document).ready(function () {
            var userVo = {userId : "brown", alias : "곰", name : "브라운", pass : "1234"};
            //자바 스크립트 객체를 문자열로 변환 메소드 stringify
            $("#sendData").html(JSON.stringify(userVo));
            $('#send').on('click', function () {

                $.ajax({
                    contentType : "application/json; charset=UTF-8",
                    url : "/ajax/getRangers",
                    method: "post",
                    data: JSON.stringify(userVo), //json
                    success : function (data) {
                        $("#result").html(JSON.stringify(data));
                    }
                });
            });
        });
    </script>
</head>
<body>
<h2>ajax view.jsp</h2>
<button id="send">전송</button> <br/>
전송데이터: <span id="sendData"></span><br/>
응답결과  : <span id="result"></span>
</body>
</html>
