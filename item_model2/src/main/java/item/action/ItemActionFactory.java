package item.action;

public class ItemActionFactory {
	private static ItemActionFactory baf;
	
	private ItemActionFactory() {}
	
	public static ItemActionFactory getInstance() {
		if(baf==null) {
			baf = new ItemActionFactory();
		}
		return baf;
		
	}
	
	Action action = null;
	public Action action(String cmd) {
		// Action 생성 시 path 지정(작업 성공 시 움직일 페이지)
		if(cmd.equals("/list.do")) {
			action = new ItemListAction("/list.jsp");
		} else if(cmd.equals("/insert.do")) {
			action = new ItemInsertAction("/list.do");
		}

		
		return action;
	}
	
}
