<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a=1, b=0;
%>
<p>a + b = <%=a+b%></p>
<p>a - b = <%=a-b%></p>
<p>a * b = <%=a*b%></p>
<p>a / b = <%=a/b%></p> <!-- 0으로 나누면 500 에러 뜸. 그래서 에러 담당 페이지 만들 수 있음. 페이지 지시어에서 -->
</body>
</html>