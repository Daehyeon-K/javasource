<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	// joinForm에서 값 가져오기
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	String confirm_password = request.getParameter("confirm_password");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	MemberDTO registerDto = new MemberDTO(userid, password, name, gender, email);
	
	// DB 작업 (register)
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	String path = "";
	
	if (password.equals(confirm_password)){
		// 페이지 이동: 성공-loginForm.jsp, 실패-joinForm.jsp
		if (dao.register(registerDto)){
			JdbcUtil.commit(con);
			path = "loginForm.jsp";
		}else{
			JdbcUtil.rollback(con);
			path = "joinForm.jsp";
		}
	}
	
	JdbcUtil.close(con);
	response.sendRedirect(path);
	


%>