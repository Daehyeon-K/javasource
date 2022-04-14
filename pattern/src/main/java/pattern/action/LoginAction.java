package pattern.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.service.LoginService;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("LoginAction");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		// DB작업 => Service
		LoginService service = new LoginService();
		//String path = "";
		if(service.login(userid, password)) {
			// 페이지 이동
			//path = "index.jsp";
		}else {
			//path = "loginForm.jsp";
		}	
		// 각 액션에서 일이 끝난 후 path값과 어떤 방식(forward, sendRedirect)으로 움직일 것인 지 리턴 필요
		return new ActionForward("path", true);
	}
}
