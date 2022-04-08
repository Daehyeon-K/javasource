<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
    form method = 'get' => 한글 처리 가능
    form method = 'post' => 직접 인코딩 처리
    
	jsp 내장객체
	
	1) HttpServletRequest request : 사용자의 요청을 가져올 수 있음 (리퀘스트 객체)
	2) 
	3)
--%>

<%
	//request.getParameter(arg0) : form 안에 들어있는 정보들 가져올 수 있음
	// 							   ?num=1&age=10 처럼 get 넘어오는 이런 정보들도 가져올 수있음
	
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter(/*여기엔 가져올 것에 대한 이름*/"username");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=name%></h3>
</body>
</html>