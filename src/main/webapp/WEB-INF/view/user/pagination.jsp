<%--
  Created by IntelliJ IDEA.
  User: Mr.KKu
  Date: 2018-11-08
  Time: 오후 4:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul id="pagination" class="pagination">

    <li>
        <%--<a href="/user/userPageList?page=1&pageSize=10" aria-label="Previous">--%>
        <a href="javascript:getUserList(1);" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
        </a>
    </li>

    <c:set var="pageCnt" value="${pageCnt }" />

    <c:forEach begin="1" end="${pageCnt }" var="page" >
        <tr>
                <%--<li><a href="/user/userPageList?page=${page}&pageSize=10">${page}</a></li>--%>
            <li><a href="javascript:getUserList(${page});">${page}</a></li>
        </tr>
    </c:forEach>


    <li>

        <%--<a href="/user/userPageList?page=${pageCnt}&pageSize=10" aria-label="Next">--%>
        <a href="javascript:getUserList(${pageCnt});" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
        </a>
    </li>

</ul>