package book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;
import book.service.BookInsertService;

public class BookInsertAction implements Action {

	private String path;
	
	public BookInsertAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		BookDTO dto = new BookDTO(Integer.parseInt(request.getParameter("code")), Integer.parseInt(request.getParameter("price")), request.getParameter("title"), request.getParameter("writer"));
		
		// service 호출
		BookInsertService service = new BookInsertService();
		if(!service.insertBook(dto)) {
			path = "/insert.jsp";
		}
		
		// ActionForward 객체 생성 후 리턴
		
		return new ActionForward(path, true);
	}

}
