package emp.service;

import java.sql.Connection;
import java.util.List;

import static emp.dao.JdbcUtil.*;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

//~~Service : 실질적인 비즈니스 로직(간단하게 설명하면 사용자 요청에 의한 CRUD)을 처리

public class EmpListServie {
	public List<EmpDTO> getEmpList(){
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		List<EmpDTO> list = dao.getList(); // 이 dao.getList라는 비즈니스 로직을 하고 싶은 것. service에선. 그 위 아래는 그걸 위해 필요한 것들
		
		// 커밋, 롤백은 없음. 당연함. SELECT이 아니기 떄문
		close(con);
		
		return list;
	}
}
