package member.service;

import java.sql.Connection;

import member.dao.JdbcUtil;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberAddService {
	public boolean insertMember(MemberDTO insertDto) {
		boolean isAddSuccess = false;
		
		// 비즈니스 로직 처리
		Connection con = JdbcUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		if(dao.insert(insertDto)) {
			isAddSuccess = true;
			JdbcUtil.commit(con);
		} else {
			JdbcUtil.rollback(con);
		}
		
		JdbcUtil.close(con);
		
		return isAddSuccess;
		
	}
}
