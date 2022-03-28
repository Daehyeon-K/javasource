package emp.service;

import static emp.dao.JdbcUtil.close;
import static emp.dao.JdbcUtil.commit;
import static emp.dao.JdbcUtil.getConnection;
import static emp.dao.JdbcUtil.rollback;

import java.sql.Connection;

import emp.dao.EmpDAO;

public class EmpRemoveService {
public boolean removeEmp(int empno) throws Exception{
		
		boolean isRemoveSuccess = false;
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean result = dao.delete(empno);
		
		// 직접적인 커밋과 롤백 관리 = 트랜잭션을 관리하는 것
		if(result) {
			commit(con);
			isRemoveSuccess = true;
		} else {
			rollback(con);
		}
		
		close(con);
		
		return isRemoveSuccess;
	}
}
