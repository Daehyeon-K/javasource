<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// delete.jsp에서 넘긴 code 가져오기
	int code = Integer.parseInt(request.getParameter("code"));
	
	// DB 작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	
	boolean result = dao.delete(code);
	
	// 페이지 이동
	String path = "";
	if(result){
		JdbcUtil.commit(con);
		path = "listPro.jsp";
		
	}else{
		JdbcUtil.rollback(con);
		path = "delete.jsp";
		
	}
	response.sendRedirect(path);
	
	JdbcUtil.close(con);

%>