<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 
    form method = 'get' => 한글 처리 가능
    form method = 'post' => 직접 인코딩 처리 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/name2" method="post"> <!-- action이 이걸 서버 어디로 보낼 지 정해주는 그런 개념 -->
	<div>
		<label>이름</label>
		<input type="text" name="username" id="username" required="required"/>
	</div>
	<div>
		<button type="submit">보내기</button>
	</div>
</form>
</body>
</html>