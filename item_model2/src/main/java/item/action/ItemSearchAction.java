package item.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.dto.ItemDTO;
import item.service.ItemSearchService;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ItemSearchAction implements Action {

	private String path="";
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//getParameter
		String category = request.getParameter("category"), name = request.getParameter("name");
		
		// service
		ItemSearchService service = new ItemSearchService();
		List<ItemDTO> list = service.search(category, name);
		
		request.setAttribute("list", list);
		
		return new ActionForward(path, false);
	}

}
