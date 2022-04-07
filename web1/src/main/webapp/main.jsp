<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- include : 여러 개 페이지 하나로 만든 후 컴파일 -->

<%-- 잘못하면 age 중복 오류 뜸. 가져오는 두 페이지 모두 갖고 있으니. 각 페이지에서 변수 가져와서 같은 블럭에 넣어서 빼주는 거니까 --%>

<%@ include file="./header.jsp" %>
<div>
	<h1>main</h1>
</div>

<% int num = 10; %>

<%@ include file="./footer.jsp" %>

