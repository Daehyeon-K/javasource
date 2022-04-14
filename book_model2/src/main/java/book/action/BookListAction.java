package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;

public class BookListAction implements Action {

	private String path;
	
	public BookListAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter 작업 (가져올 거 없으면 패스)
		
		// Service 작업 호출
		BookListService service = new BookListService();
		List<BookDTO> list = service.listAll();
		
		// 이동 방식 관련
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);

	}

}
