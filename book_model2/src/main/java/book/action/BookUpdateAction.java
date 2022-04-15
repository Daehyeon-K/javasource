package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.service.BookUpdateService;

public class BookUpdateAction implements Action {
	
	private String path;

	public BookUpdateAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		int code = Integer.parseInt(request.getParameter("code"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		// service 호출
		BookUpdateService service = new BookUpdateService();
		
		if(!service.modify(code, price)){
			path = "/update.jsp";
		}
				
		// 이동 경로, 방식 설정
		
		return new ActionForward(path, true);
	}

}
