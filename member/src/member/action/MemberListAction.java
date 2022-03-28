package member.action;

import java.util.List;
import java.util.Scanner;

import member.dto.MemberDTO;
import member.service.MemberListService;
import member.util.ConsoleUtil;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 화면 보여주기, 입력된 데이터 가져오기 -> 여기선 딱히 할 거 없음
		
		// 서비스 호출
		MemberListService service = new MemberListService();
		List<MemberDTO> list = service.list();
		
		// 서비스 호출로 받은 결과를 화면에 출력
		ConsoleUtil util = new ConsoleUtil();
		util.printListMessage(list);
	}
}
