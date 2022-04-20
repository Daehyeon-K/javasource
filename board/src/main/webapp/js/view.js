/**
 * qna_board_view.jsp 스크립트
 */
 $(function(){
 	$("#list").click(function(){
 		location.href="/qList.do";
 	})
 	
	let formObj = $("#actionForm");
 	$("#delete").click(function(){
		// Form action 지정
		formObj.attr("action", "/view/qna_board_pwdCheck.jsp");
		
		// submit 걸기
		formObj.submit();
	})
	
	$("#modify").click(function(){
		// Form action 지정
		formObj.attr("action", "/qModify.do");
		
		// submit 걸기
		formObj.submit();
	})
	
	$("#reply").click(function(){
		// Form action 지정
		formObj.attr("action", "/qReplyView.do");
		
		// submit 걸기
		formObj.submit();
	})
 })