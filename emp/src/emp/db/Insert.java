package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		// SELECT가 아니면 ResultSet 필요 없음
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				String sql = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (7209, 'Test_USER9', 'MANAGER', 7201, '2016-03-10', 1400, NULL, 80)";
				// 자바에서 DML 쓰면 자동으로 커밋됨. 오토커밋. 그래서 바로 반영되어 보여짐
				pstmt = con.prepareStatement(sql);
				int result = pstmt.executeUpdate(); // 몇 개 성공되었는 지 반환되는 거 담음
				
				if(result > 0) {
					System.out.println(result+"개 삽입 성공");
				}
				
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
