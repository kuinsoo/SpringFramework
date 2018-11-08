<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

   <%-- @은 지시자 --%>

   <div class="container-fluid">
      <div class="row">
      

         <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="row">
				<div class="col-sm-8 blog-main">
					<h2 class="sub-header">사용자</h2>
					<div class="table-responsive">
						<table class="table table-striped">
							<tr>
								<th>번호</th>
								<th>사용자 아이디</th>
								<th>사용자 이름</th>
								<th>사용자 생일</th>
							</tr>
							<!-- userList loop 이용하여 출력  -->
							<c:forEach items="${userAllList }" var="vo" varStatus="status" >
								<tr>
									<td>${status.index + 1 }</td>
									<td>${vo.userId}</td>
									<td>${vo.name}</td>
									<td><fmt:formatDate value="${vo.birth }" pattern="yyyy-MM-dd"/>
								</tr>
							</c:forEach>
						</table>
					</div>
			
					<a class="btn btn-default pull-right">사용자 등록</a>

					<div class="text-center">
						<ul class="pagination">
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
						</ul>
					</div>
				</div>
			</div>
         </div>
      </div>
   </div>