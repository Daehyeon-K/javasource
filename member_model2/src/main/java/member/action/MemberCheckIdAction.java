package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.service.MemberCheckIdService;

@AllArgsConstructor

public class MemberCheckIdAction implements Action {

	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		String userid = request.getParameter("userid");

		// Service 호출
		MemberCheckIdService service = new MemberCheckIdService();
		
		String result = "";
		
		// 중복이면 false, undefined, null => 
		if (service.dupId(userid)) {
			result = "true";
		} else {
			result = "false";
		}
		
		request.setAttribute("dupId", result);
		
		return new ActionForward(path, false);
	}
}
