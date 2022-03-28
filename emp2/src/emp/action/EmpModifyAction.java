package emp.action;

import java.util.Scanner;

import emp.service.EmpModifyService;
import emp.util.ConsoleUtil;



public class EmpModifyAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.printModEmpMSG(sc);
		int mgr = util.printModMgrMSG(sc);
		
		EmpModifyService service = new EmpModifyService();
		
		boolean modifyResult = service.modifyEmp(empno, mgr);
		
		if(modifyResult) {
			util.printModifySuccessMsg(empno);
		}else {
			util.printModifyFailMsg(empno);
		}
		
	}

}
