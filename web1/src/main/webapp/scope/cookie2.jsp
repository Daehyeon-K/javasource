<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Cookie c = new Cookie("name", "홍길동");
	c.setMaxAge(600); // 브라우저 닫으면 쿠키 날아가는 게 아니라 특정 시간 만큼 있다가 날아가도록 하기 (초 단위)
	response.addCookie(c);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="get_cookie2.jsp">쿠키 값 확인</a>
</body>
</html>