<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	LoginDto loginDto = (LoginDto)session.getAttribute("loginDto");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- login.jsp 사용자 입력 값을 여기서 출력 가능한가? --%>
	<p>userid : <%=request.getParameter("userid") %></p> <%-- 출력 불가. null. request 객체의 유효범위 문제 --%>
	<br />
	<hr />
	
<%-- 	<p>userid : <%=session.getAttribute("userid") %></p> --%>
<%-- 	<p>password : <%=session.getAttribute("password") %></p> --%>
	<p>userid : <%=loginDto.getUserid() %></p>
	<p>password : <%=loginDto.getPassword() %></p>
	

	<br />
	<a href="scope1.jsp">이동하기</a>
</body>
</html>