<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


	
<style type="text/css">
	.userClick{
		cursor : pointer;
		
		
	}
</style>
<script type="text/javascript">
	// getUserList(1);
	getUserListHtml(1);
	$(document).ready(function(){
		// 개발자 도구에 나오는지 확인하는 방법
		console.log("document.ready");
		
		// tr에 select(class="userClick")
		$("#userList").on("click", ".userClick", function(){
			console.log("userClick");
			var userId = $(this).children()[1].innerHTML;
			
			$("#userId").val(userId);
			
			//  .summit();
			$("#frm").submit();
		});
		
	});


	function getUserListHtml(page) {
		var pageSize = 10;
		$.ajax({
            type 	: "GET",
            url		: "/user/userPageListAjaxHtml",
            data	: "page="+page+"&pageSize="+pageSize,
			success : function(dt) {
                $('#userList').html("");
                $('#userList').html(dt);
            }

		});

        $.ajax({
            type 	: "GET",
            url		: "/user/userPageListAjaxPagination",
            data	: "page="+page+"&pageSize="+pageSize,
            success : function(dt) {
                $('#pagination').html("");
                $('#pagination').html(dt);
            }

        });
    }


	//page 인자를 받아서
	// 해당페이지에 속하는 사용자 리스트 정보를 가져온다.
	function getUserList(page) {
	    var pageSize = 10;



		//ajax call
		//사용자 리스트 데이터만 가져오기
		// html(as-is) --> json(to-be) 데이터를 받는 형태로 변경
		$.ajax({
			type 	: "GET",
			url		: "/user/userPageListAjax",
			data	: "page="+page+"&pageSize="+pageSize,
			success : function (data) {
			    var html = "";
			    var pageHtml = "";
                var pageCnt = data.pageCnt;
                // data(사용자 json 데이터)를 바탕으로 사용자 리스트를 갱신
                // 1.
                // $('#userList').childNodes.remove(); // 모든 내용을 삭제한다. userList도 삭제 된다.
                // $('#userList').html(""); // 안에 내용 삭제
                $.each(data.pageList, function (idx, user) {
                    html += "<tr class='userClick'>";
					html += "<td>"+user.rnum+"</td>";
					html += "<td>"+user.userId+"</td>";
					html += "<td>"+user.name+"</td>";
					html += "<td>"+user.formattedBirth+"</td>";
					html += "</tr>";
    			});

                $('#userList').html("");
                $('#userList').html(html);


                pageHtml += "<ul class='pagination'>";
                pageHtml += "<li>";
                pageHtml += "<a href='javascript:getUserList(1);' aria-label='Previous'>";
                pageHtml += "<span aria-hidden='true'>&laquo;</span>";
                pageHtml += "</a>";
                pageHtml += "</li>";

                for(var i = 1; i<= pageCnt ; i++) {
                    pageHtml += "<tr>";
                    pageHtml += "<li><a href='javascript:getUserList(" + i + ");'>"+i+"</a></li>";
                    pageHtml += "</tr>";
                }
                pageHtml += "<li>";
                pageHtml += "<a href='javascript:getUserList("+pageCnt+");' aria-label='Next'>";
                pageHtml += "<span aria-hidden='true'>&raquo;</span>";
                pageHtml += "</a>";
                pageHtml += "</li>";
                pageHtml += "</ul>";


				$('#pagination').html("");
                $('#pagination').html(pageHtml);

            }
		});
    }
</script>

<form id="frm" action="/user/userDetail" method="get">
	<input type="hidden" id="userId" name="userId"/>
</form>

   
   <div class="container-fluid">
      <div class="row">
      

         
         <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" style="background-color: white;">
            <div class="row" style="background-color: white;">
				<div class="col-sm-8 blog-main">
					<h2 class="sub-header">사용자</h2>
					<div class="table-responsive">
						<table class="table table-striped table-hover" >
							<thead>
							<tr>
								<th>번호</th>
								<th>사용자 아이디</th>
								<th>사용자 이름</th>
								<th>사용자 생일</th>
							</tr>
							</thead>
<%--             <% List<UserVo> userList = (List)request.getAttribute("pageList"); --%>
<!-- //                SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); -->
<!-- //                for(int i=0;i<userList.size();i++){  -->
<%--                   UserVo userVo2 = userList.get(i); %> --%>
<!--             <tr class="userClick"> -->
<%--                <td><%=userVo2.getRnum() %></td> --%>
<%--                <td><%=userVo2.getUserId() %></td> --%>
<%--                <td><%=userVo2.getName() %></td> --%>
<%--                <td><%=sdf.format(userVo2.getBirth()) %></td> --%>
<!--             </tr> -->
<%--             <%} %> --%>

							<!-- userList loop 이용하여 출력  -->
							<tbody id="userList">
							<%--<c:forEach items="${pageList }" var="vo"  >
								<tr class="userClick">
									<td>${vo.rnum}</td>
									<td>${vo.userId}</td>
									<td>${vo.name}</td>
									<td><fmt:formatDate value="${vo.birth }" pattern="yyyy-MM-dd"/>
								</tr>
							</c:forEach>--%>
							</tbody>
						</table>
					</div>
			
					<a class="btn btn-default pull-right" href="/user/userForm">사용자 등록</a>
					
					<div class="text-center">
						<ul id="pagination" class="pagination">
						
<!-- 							   <li> -->
<!-- 							      <a href="/userPageList?page=1&pageSize=10" aria-label="Previous"> -->
<!-- 							        <span aria-hidden="true">&laquo;</span> -->
<!-- 							      </a> -->
<!-- 							    </li> -->
<%-- 						<% int pageCnt = (Integer)request.getAttribute("pageCnt");  --%>
<!-- //					for(int p = 1; p <= pageCnt; p++){ -->
<%-- 						%> --%>
<%-- 							<li><a href="/userPageList?page=<%=p %>&pageSize=10"><%=p %></a></li> --%>
							
<%-- 						<%} %> --%>
<!-- 						    <li> -->
<%-- 						      <a href="/userPageList?page=<%=pageCnt %>&pageSize=10" aria-label="Next"> --%>
<!-- 						        <span aria-hidden="true">&raquo;</span> -->
<!-- 						      </a> -->
<!-- 						    </li> -->

	<%--						   <li>
							      &lt;%&ndash;<a href="/user/userPageList?page=1&pageSize=10" aria-label="Previous">&ndash;%&gt;
							      <a href="javascript:getUserList(1);" aria-label="Previous">
							        <span aria-hidden="true">&laquo;</span>
							      </a>
							    </li>

							<c:set var="pageCnt" value="${pageCnt }"></c:set>
						
							<c:forEach begin="1" end="${pageCnt }" var="page" >
								<tr>
									&lt;%&ndash;<li><a href="/user/userPageList?page=${page}&pageSize=10">${page}</a></li>&ndash;%&gt;
									<li><a href="javascript:getUserList(${page});">${page}</a></li>
								</tr>
							</c:forEach>
						
						
						    <li>
						    
						      &lt;%&ndash;<a href="/user/userPageList?page=${pageCnt}&pageSize=10" aria-label="Next">&ndash;%&gt;
						      <a href="javascript:getUserList(${pageCnt});" aria-label="Next">
						        <span aria-hidden="true">&raquo;</span>
						      </a>
						    </li>
						    --%>
						</ul>
						
					</div>
				</div>
			</div>
         </div>
      </div>
   </div>