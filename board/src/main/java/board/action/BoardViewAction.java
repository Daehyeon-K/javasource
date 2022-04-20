package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardViewService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class BoardViewAction implements Action {

	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// bno 가져오기
		int bno =Integer.parseInt(request.getParameter("bno"));
		
		// service 작업
		BoardViewService service = new BoardViewService();
		BoardDTO dto = new BoardDTO();
		
		dto = service.read(bno);
		
		// 페이지 이동
		
		request.setAttribute("dto", dto);
		
		return new ActionForward(path, false);
	}

}
