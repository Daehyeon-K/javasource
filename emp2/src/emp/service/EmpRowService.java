package emp.service;

import java.sql.Connection;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

import static emp.dao.JdbcUtil.*;

public class EmpRowService {
	public EmpDTO getRow(int empno) {
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		EmpDTO dto = dao.getRow(empno);
		
		close(con);
		
		return dto;
	}
}
