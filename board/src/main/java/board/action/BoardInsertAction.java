package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardInsertService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class BoardInsertAction implements Action {

	private String path="";
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		BoardDTO insertDto = new BoardDTO();
		insertDto.setName(request.getParameter("name"));
		insertDto.setTitle(request.getParameter("title"));
		insertDto.setContent(request.getParameter("content"));
		insertDto.setPassword(request.getParameter("password"));
		
		// service
		BoardInsertService service = new BoardInsertService();
		if(!service.insert(insertDto)) {
			path = "/view/qna_board_write.jsp";
		}
				
		// 페이지 이동
		
		return new ActionForward(path, true);
	}

}
