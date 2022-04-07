<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- html 주석 가능 -->
<%-- jsp 주석 가능 --%>
<%
// java 주석은 java 영역 안에서 가능
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // ctrl sapce로 불러서 넣자 쓸거면. 하드코딩 귀찮우
	Date date = new Date();
	out.print(sdf.format(date)); // 매번 <%= 하기 귀찮을 때
%>
<%=sdf.format(date)%>
</body>
</html>