package item.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.dto.ItemDTO;
import item.service.ItemListService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ItemListAction implements Action {

	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 읽는거는 가져올 거 없으니 패스
		
		// Service 작업 호출
		ItemListService service = new ItemListService();
		List<ItemDTO> list = service.listAll();
		
		// 이동 방식 관련
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}
}
