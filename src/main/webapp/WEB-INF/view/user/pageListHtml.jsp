<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach items="${pageList }" var="user">
    <tr class="userClick">
        <td>${user.rnum}</td>
        <td>${user.userId}</td>
        <td>${user.name}</td>
        <td><fmt:formatDate value="${user.birth }" pattern="yyyy-MM-dd"/>
    </tr>
</c:forEach>
