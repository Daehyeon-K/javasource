package book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dto.BookDTO;
import book.service.BookSearchService;

public class BookSearchAction implements Action {
	
	private String path;
	
	public BookSearchAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter
		String criteria=request.getParameter("criteria"), keyword=request.getParameter("keyword");
		
		// service 호출
		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.search(criteria, keyword);
		
		request.setAttribute("list", list);
		
		// 이동 경로 및 방식
		
		return new ActionForward(path, false);
	}

}
