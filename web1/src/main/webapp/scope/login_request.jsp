<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	
	// 로그인 정보 세션 속성에 담기
	/*session.setAttribute("userid", userid);
	session.setAttribute("password", password);*/
	session.setAttribute("loginDto", new LoginDto(userid, password));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>로그인 정보</h3>
	
	<p>userid : <%=request.getParameter("userid") %></p>
	
	<p>password : <%=request.getParameter("password") %></p>
	
	<p>age : <%=request.getAttribute("age") %></p> 
	<%-- request에서 set으로 담으면 getParameter로 못가져옴. getAttribute로 가져와야 함.
		 근데 그래도 못가져옴. form action 등으로 가져온 거 아니라 값이 안넘어감
		 getParameter로 가져오는 애들은 당연히 저기로 리퀘스트가 넘어감
		 근데 getAttribute는 그 자신의 request-response로 안넘어가나봄 얘가 담긴 getAttribute로 넘어가서 가져오는 느낌.
		 getParameter와 다른 동작 방식.
		 request 유효범위 잘 지켜주면 getParameter로도 가져올 수 있는 듯
		 그것보다 set~ 앞에서 했을 때 이미 다른 영역에 들어가서 그런 듯. 원래 속성에 담아둔 거 --%>
	
	
	<p><a href="login_request2.jsp">이동</a></p>
	
</body>
</html>