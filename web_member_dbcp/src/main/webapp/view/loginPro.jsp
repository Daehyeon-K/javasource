<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dao.JdbcUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// loginFomr에서 넘긴 값 가져오기
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");
	
	// DB 작업
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	MemberDTO loginDto = dao.isLogin(userid, password);
	
	JdbcUtil.close(con);
	
	// 페이지 이동
	String path = "loginForm.jsp";
	if (loginDto!=null){
		session.setAttribute("loginDto", loginDto); // 로그인은 계속 유지되어야 하니, 세션에 담아줘야 함
	} 
// 	else{ // 로그인 실패
// 		path="loginForm.jsp";
// 	}
	response.sendRedirect(path);
	
%>