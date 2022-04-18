package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.service.ItemUpdateService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ItemUpdateAction implements Action {
	
	private String path="";

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		int num = Integer.parseInt(request.getParameter("num"));
		String psize = request.getParameter("psize");
		int price = Integer.parseInt(request.getParameter("price"));
		
		// service
		ItemUpdateService service = new ItemUpdateService();
		
		if (!service.modify(num, psize, price)) {
			path="/udpate.jsp";
		}
		
		return new ActionForward(path, true);
	}

}
