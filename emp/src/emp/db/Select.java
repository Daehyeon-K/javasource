package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		// DB 서버와 연결
		
		Connection con = null;
		PreparedStatement pstmt = null; // SQL 쿼리문 전송용 객체
		ResultSet rs = null; // SELECT 쿼리문 결과 담는 객체
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			// DB 연결을 위한 문자열
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			// 드라이버매니저를 통해 연결 시도
			con = DriverManager.getConnection(url, user, password);
			
			if (con!=null){
				String sql = "SELECT * FROM emp WHERE empno=7369"; // 쿼리문 to 문자열
				pstmt = con.prepareStatement(sql); // 쿼리문 전송
				rs = pstmt.executeQuery(); // 쿼리문 실행, rs에 받기
				
				// rs에 담긴 결과 화면 출력
				if(rs.next()) { // ResultSet에 결과 담겨 있는 지 확인
					// 컬럼 하나씩 가져오기
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					int mgr = rs.getInt("mgr");
					String hiredate = rs.getString("hiredate"); // 날짜는 일단 간단히 문자열로 가져오기 (날짜형도 되긴 하는데 복잡)
					int sal =rs.getInt("sal");
					int comm =rs.getInt("comm");
					int deptno = rs.getInt("deptno");
					
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
