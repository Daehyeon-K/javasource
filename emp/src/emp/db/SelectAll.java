package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAll {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				String sql = "SELECT * FROM exam_emp";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					int mgr = rs.getInt(4);
					String hiredate = rs.getString(5);
					int sal =rs.getInt(6);
					int comm =rs.getInt(7);
					int deptno = rs.getInt(8);
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n", empno, ename, job, mgr, hiredate, sal, comm, deptno);
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}
}
