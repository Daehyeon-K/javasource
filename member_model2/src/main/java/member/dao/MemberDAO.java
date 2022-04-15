package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

@AllArgsConstructor

public class MemberDAO {
	private Connection con;
	
	// CRUD
	
	// CREATE (회원가입)
	// insert into memberTBL values(?, ?, ?, ?, ?)
	public boolean register(MemberDTO registerDto) {
		Boolean flag = null;
		PreparedStatement pstmt = null;
		String sql = "insert into memberTBL values(?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, registerDto.getUserid());
			pstmt.setString(2, registerDto.getPassword());
			pstmt.setString(3, registerDto.getName());
			pstmt.setString(4, registerDto.getGender());
			pstmt.setString(5, registerDto.getEmail());

			int result = pstmt.executeUpdate();
			
			if (result>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return flag;
	}
	
	// READ (로그인)
	// 사용자가 입력한 ID와 비밀번호가 존재하는 지 확인
	// select userid,name from memberTBL where userid=? and password=?;
	public MemberDTO isLogin(String userid, String password) {
		MemberDTO loginDto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select userid,name from memberTBL where userid=? and password=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginDto = new MemberDTO();
				loginDto.setUserid(rs.getString(1)); // 이름 문자열로 "userid" 로 하는 거 대신 인덱스 넘버로
				loginDto.setName(rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(rs);
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return loginDto;
	}
	
	// UPDATE (비밀번호 변경)
	// update memberTBL set password=? where userid = ?;
	// update memberTBL set password=? where userid = ? and password= ?;
	public boolean changePassword(String userid, String confirmPassword) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update memberTBL set password=? where userid = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, confirmPassword);
			pstmt.setString(2, userid);
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return flag;
	}
	
	// DELETE (회원탈퇴)
	// delete from memberTBL where userid = ? and password = ?;
	public boolean leave(String userid, String password) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "delete from memberTBL where userid = ? and password = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			int result = pstmt.executeUpdate();
			
			if (result>0) flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return flag;
	}
	
	// 중복 아이디 검사
	// select userid from memberTBL where userid = ?
	public boolean checkId(String userid) {
		boolean flag = true;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select userid from memberTBL where userid = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				flag = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
				close(rs);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return flag;
	}
}
