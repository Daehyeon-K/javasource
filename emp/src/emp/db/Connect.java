package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		// 1. 데이터베이스 서버와 연결
		
		try {
			// 드라이버 로드 
			Class.forName("oracle.jdbc.OracleDriver"); // => 못찾아서 에러 남. (=> 예전엔 oracle.jdbc.driver.OracleDriver)
			
			// 데이터베이스 연결을 위한 문자열 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			// 드라이버매니저를 통해 연결 시도
			Connection con = DriverManager.getConnection(url, user, password);
			
			if (con!=null) {
				System.out.println("연결 성공");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
