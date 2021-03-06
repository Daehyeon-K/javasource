package web2.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		// JDBC(자바와 데이터베이스 연결 규칙)
		// 	1) 드라이버 로드
		// 	2) 드라이버를 통해 DB서버와 연결
		// 	3) SQL문 전송 => 서버에서 SQL문 parsing, 실행 계획 세움
		// 	4) SQL문 실행
		// 	5) 실행 결과 받기
		
		Connection con = null;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javadb";
			String password = "12345";
			con = DriverManager.getConnection(url, user, password);
			
			if (con!=null) {
				System.out.println("연결되었습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
