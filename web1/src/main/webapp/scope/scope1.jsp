<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
LoginDto loginDto = (LoginDto)session.getAttribute("loginDto");
%>
    
<%--
	jsp에서 제공하는 내장 객체들 중 page, request, session, application 객체들은 해당
	객체에 유효한 범위 안에서 필요한 객체(데이터)들을 저장하고 읽어 들여 서로 공유할 수 있는 특정 영역을 가지고 있음
	
	1) page : 현재 서비스 되고 있는 페이지의 유효범위를 가짐 (X)
	
	2) request : request 유효 범위를 가짐
				 form action에 써준 페이지, a href에 써준 페이지
				 
	3) session : session 유효 범위를 가짐
				 HttpSession session => 유지시간만큼 유효범위
				 브라우저 열고 닫기 전까지 유효범위
				 로그인, 장바구니를 세션에 담음 => 서버에 저장
				 
	4) application : 서버의 시작과 끝의 유효범위를 가짐 (X 개발 과정에선 잘 안씀)
 --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>userid : <%=loginDto.getUserid() %></p>
	<p>password : <%=loginDto.getPassword() %></p>
</body>
</html>