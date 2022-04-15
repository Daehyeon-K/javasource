package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberJoinService;

@AllArgsConstructor

public class MemberJoinAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirm_password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		MemberDTO registerDto = new MemberDTO(userid, password, name, gender, email);
		
		// Service 호출
		MemberJoinService service = new MemberJoinService();
		if (password.equals(confirm_password)) {
			if(!service.join(registerDto)) {
				path = "/view/joinForm.jsp";
			}
		}
		
		return new ActionForward(path, true);
	}
}
