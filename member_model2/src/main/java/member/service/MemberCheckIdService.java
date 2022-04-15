package member.service;

import java.sql.Connection;

import member.dao.MemberDAO;

import static member.dao.JdbcUtil.*;

public class MemberCheckIdService {
	public boolean dupId(String userid) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		boolean result = dao.checkId(userid);
		
		close(con);
		
		return result;
		
	}
}
