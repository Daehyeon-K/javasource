package emp.util;

import java.util.List;
import java.util.Scanner;

import emp.dto.EmpDTO;

public class ConsoleUtil {
	// 사원추가와 관련한 정보 입력
	public EmpDTO getNewEmp(Scanner sc) {
		System.out.println("\n<<추가할 사원정보 입력>>\n-------------------------------");
		EmpDTO insertDTO = new EmpDTO();
		System.out.print("\n사원 번호 입력 >> ");
		insertDTO.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.print("\n사원 명 입력 >> ");
		insertDTO.setEname(sc.nextLine());
		System.out.print("\n직무 입력 >> ");
		insertDTO.setJob(sc.nextLine());
		System.out.print("\n매니저 번호 입력 >> ");
		insertDTO.setMgr(Integer.parseInt(sc.nextLine()));
		System.out.print("\n급여 입력 >> ");
		insertDTO.setSal(Integer.parseInt(sc.nextLine()));
		System.out.print("\n추가 수당 입력 >> ");
		insertDTO.setComm(Integer.parseInt(sc.nextLine()));
		System.out.print("\n부서 번호 입력 >> ");
		insertDTO.setDeptno(Integer.parseInt(sc.nextLine()));
		
		return insertDTO;
	}
	
	public void printAddSuccessMsg(EmpDTO newEmp) {
		System.out.println(newEmp.getEname()+" 사원정보 추가 성공");
	}
	public void printAddFailMsg(EmpDTO newEmp) {
		System.out.println(newEmp.getEname()+" 사원정보 추가 실패");
	}
	
	// 전체 조회와 관련한 정보 출력
	public void printEmpList(List<EmpDTO> list) {
		System.out.println();
		System.out.println("***** 사원정보 *****");
		System.out.println("----------------------------------------------------");
		System.out.println("사번\t성명\t직무\t매니저번호\t입사일\t급여\t추가수당\t부서번호");
		System.out.println("----------------------------------------------------");
		for (EmpDTO dto : list) {
			System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n", dto.getEmpno(), dto.getEname(), dto.getJob(), dto.getMgr(), dto.getHiredate(), dto.getSal(), dto.getComm(), dto.getDeptno());
		}
	}
	
	// 사원 조회와 관련한 정보 출력
	public int printRowMSG(Scanner sc) {
		System.out.print("\n조회할 사원번호 입력 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		return empno;
	}
	
	public void printEmpMessage(EmpDTO row) {
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("사번\t성명\t직무\t입사일\t부서번호");
		System.out.println("----------------------------------------------------");
		System.out.printf("%d\t%s\t%s\t%s\t%d\n", row.getEmpno(), row.getEname(), row.getJob(), row.getHiredate(), row.getDeptno());
		
	}
	
	// 변경할 사번 입력
	public int printModEmpMSG(Scanner sc) {
		System.out.print("\n변경할 사원번호 입력 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		return empno;
	}
	
	// 변경할 매니저 번호 입력
	public int printModMgrMSG(Scanner sc) {
		System.out.print("\n변경할 매니저번호 입력 >> ");
		int mgr = Integer.parseInt(sc.nextLine());
		return mgr;
	}
	
	// 변경 성공 실패 여부 메시지
	public void printModifySuccessMsg(int empno) {
		System.out.println(empno+" 사원정보 수정 성공");
	}
	public void printModifyFailMsg(int empno) {
		System.out.println(empno+" 사원정보 수정 실패");
	}
	
	// 제거할 사번 입력
	public int printRemoveMSG(Scanner sc) {
		System.out.print("\n제거할 사원번호 입력 >> ");
		int empno = Integer.parseInt(sc.nextLine());
		return empno;
	}
	
	// 제거 성공 실패 여부 메시지
	public void printRemoveSuccessMsg(int empno) {
		System.out.println(empno+" 사원정보 제거 성공");
	}
	public void printRemoveFailMsg(int empno) {
		System.out.println(empno+" 사원정보 제거 실패");
	}
}
