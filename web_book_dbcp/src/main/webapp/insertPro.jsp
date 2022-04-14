<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	// insert.jsp에서 넘어오는 값 가져오기 (BookDTO에 넣기)
	BookDTO dto = new BookDTO(Integer.parseInt(request.getParameter("code")), Integer.parseInt(request.getParameter("price")), request.getParameter("title"), request.getParameter("writer"));
	
	// DB 작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	boolean result = dao.insert(dto);
	
	// 페이지 이동
	String path = "";
	if(result){
		// 커밋
		JdbcUtil.commit(con);
		path = "listPro.jsp";
	} else{
		JdbcUtil.rollback(con);
		path = "insert.jsp";
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
	
%>