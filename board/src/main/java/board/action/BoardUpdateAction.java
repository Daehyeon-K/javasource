package board.action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.service.BoardUpdateService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class BoardUpdateAction implements Action {

	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UploadUtil util = new UploadUtil();
		HashMap<String, String> dataMap = util.uploadFile(request);
		
		// dataMap에서 값 가져오기
		BoardDTO updateDto = new BoardDTO();
		updateDto.setBno(Integer.parseInt(dataMap.get("bno")));
		updateDto.setTitle(dataMap.get("title"));
		updateDto.setContent(dataMap.get("content"));
		updateDto.setPassword(dataMap.get("password"));
		updateDto.setAttach(dataMap.get("attach"));
		
		BoardUpdateService service = new BoardUpdateService();
		
		if(!service.update(updateDto)) {
			path="/qModify.do?bno="+updateDto.getBno();
		} else {
			path += "?bno="+updateDto.getBno();
		}
		
		return new ActionForward(path, true);

	}

}
