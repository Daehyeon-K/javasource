<%@page import="java.sql.Connection"%>
<%@page import="web2.dao.MemberDAO"%>
<%@page import="web2.dto.MemberDTO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글처리
	request.setCharacterEncoding("utf-8");
	
	// form 에서 입력값 가져오기
	
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	String email = request.getParameter("email");
	int age = Integer.parseInt(request.getParameter("age"));
	
	MemberDTO insertDto = new MemberDTO(name, addr, email, age);
	
	// DB 작업
	
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	// 페이지 이동 => 전체 리스트 보여주기
	String path = "";
	if(dao.insert(insertDto)){// 페이지 이동 => 전체 리스트 보여주기
		// 커밋
		JdbcUtil.commit(con);
		path = "list.jsp";	
	}else{ // 페이지 이동 =>  실패가 발생한 페이지 보여주기
		JdbcUtil.rollback(con);
		//path = "";	
	}
	response.sendRedirect(path);
	JdbcUtil.close(con);
%>
	