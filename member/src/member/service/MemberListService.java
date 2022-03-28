package member.service;

import java.sql.Connection;
import java.util.List;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

public class MemberListService {
	
	// 비즈니스 로직 호출 -> DAO 호출
	public List<MemberDTO> list(){
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		List<MemberDTO> memberList = dao.getList();
		
		// 비즈니스 로직이 SELECT면 커밋, 롤백 안함.
		close(con);
		
		return memberList;
	}
	
}
