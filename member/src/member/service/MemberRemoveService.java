package member.service;

import java.sql.Connection;
import static member.dao.JdbcUtil.*;

import member.dao.MemberDAO;

public class MemberRemoveService {
	
	public boolean deleteMember(int id) {
		boolean isRemoveSuccess = false;
		
		// 비즈니스 로직 -> dao
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		if (dao.delete(id)) {
			commit(con);
			isRemoveSuccess=true;
		} else {
			rollback(con);
		}
		
		close(con);
		
		return isRemoveSuccess;
	}
}
