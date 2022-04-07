<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 1~100 합계 구하고 출력
	int sum = 0;
	for(int i = 1 ; i<101 ; i++){
		sum +=i;}
	out.print("<h3>"+sum+"</h3>");
%>
<h3><%=sum %></h3> <!-- 위에나 여기나 어디서 쓰냐는 태그 얼마나 써야하나 따라 편한게 다르다 -->
</body>
</html>