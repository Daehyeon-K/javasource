package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

// CRUD 담당 객체
public class MemberDAO {
	private Connection con;

	public MemberDAO(Connection con) {
		super();
		this.con = con;
	}
	
	
	// C(insert) 담당 메소드
	public boolean insert(MemberDTO insertDto) {
		String sql = "INSERT INTO member(id, name, addr, email, age) Values(member_seq.nextval, ?, ?, ?, ?)"; // 번호 발행 후 에러 뜨면 그 번호는 날아가고 그 다음 번호 계속 감
		PreparedStatement pstmt = null;
		
		try {
			// sql 전송
			pstmt = con.prepareStatement(sql);
			
			// ? 처리
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getAddr());
			pstmt.setString(3, insertDto.getEmail());
			pstmt.setInt(4, insertDto.getAge());
			
			// sql 실행
			int result = pstmt.executeUpdate();
			if (result>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	
	// R(Read = SELECT) 담당 메소드
	// SELECT : 행이 하나만 나오는 경우 - ~DTO
	//			여러 행이 나오는 경우 - List<~DTO>
	public List<MemberDTO> getList(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "SELECT * FROM member";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				// MemberDTO 읽어서 변수 만들어 List에 담기
				// 컬럼 하나씩 가져와서 변수에 담기
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				
				list.add(new MemberDTO(id, name, addr, email, age));
				
				// 이렇게도 함
				// MemberDTO dto = new MemberDTO();
				// dto.setId(rs.getInt("id"));
				// dto.setName(rs.getString("name"));
				// dto.setAddr(rs.getString("addr"));
				// dto.setEmail(rs.getString("email"));
				// dto.setAge(rs.getInt("age"));
				// list.add(dto);
				
				// 이렇게도 함
				// list.add(new MemberDTO(rs.getInt("id"), rs.getString("name"), rs.getString("addr"), rs.getString("email"), rs.getInt("age")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				close(rs);
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	
	// U(Update) 담당 메소드
	// 1:주소 수정, 2:메일 수정
	public boolean update(int no, String input, int id) {
		PreparedStatement pstmt = null;
		String sql ="";
		try {
			if(no==1) {
				sql = "UPDATE member SET addr = ? WHERE id = ?";
			} else if (no==2) {
				sql = "UPDATE member SET email = ? WHERE id = ?";
			} 
			// addr과 email도 ?로 해서 sql 하나로 작성할 수는 없을까?
			// ==> 안됨. 필드명 자체는 ?로 처리 불가.
			// 오라클이 sql문 받아서 실행계획을 세우고 나서 setString이 되는건데 실행계획 자체를 못세움
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, input);
			pstmt.setInt(2, id);
			int result = pstmt.executeUpdate();
			
			if (result >0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	
	// D(Delete) 담당 메소드
	public boolean delete(int id) {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	
}
