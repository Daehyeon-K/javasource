<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public void jspInit(){
		System.out.println("jspInit()");	
	}
	public void jspDestroy(){
		System.out.println("jspDestroy()");
	}
%>
<%
	System.out.println("_jspService1()");
	// jspInit()가 나오고 _jspService1()만 나온 이유는?
			
	int i=15; // 이거 하면 맨 먼저 jspDestroy()도 나옴
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=i %></h3>
</body>
</html>