package emp.action;

import java.util.Scanner;

import emp.service.EmpRemoveService;
import emp.util.ConsoleUtil;

public class EmpRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.printRemoveMSG(sc);
		
		EmpRemoveService service = new EmpRemoveService();
		
		boolean removeResult = service.removeEmp(empno);
		
		if(removeResult) {
			util.printRemoveSuccessMsg(empno);
		}else {
			util.printRemoveFailMsg(empno);
		}
	}

}
