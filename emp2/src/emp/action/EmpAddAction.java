package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpAddService;
import emp.util.ConsoleUtil;

public class EmpAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		EmpDTO insertDTO = util.getNewEmp(sc);
		
		EmpAddService service = new EmpAddService();
		boolean insertResult = service.addEmp(insertDTO);
		
		if(insertResult) {
			util.printAddSuccessMsg(insertDTO);
		}else {
			util.printAddFailMsg(insertDTO);
		}
		
	}

}
