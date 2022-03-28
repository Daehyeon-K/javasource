package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import emp.dto.EmpDTO;

import static emp.dao.JdbcUtil.*;


public class EmpDAO {
	private Connection con;
	
	public EmpDAO(Connection con) {
		super();
		this.con = con;
	}
	
	// 전체조회
	public List<EmpDTO> getList() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM exam_emp";
		try {
			pstmt = con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			// rs에 담긴 sql 실행 결과를 List에 담아서 리턴
			// 그냥 rs 리턴하고 main에서 List 담으면 안됨. DB작업은 DAO에서 끝내는 것으로
			
			while (rs.next()) {
				// 행의 각 칼럼들 가져와서 EmpDTO 객체로 만들어줌
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal =rs.getInt("sal");
				int comm =rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				
				// list에 추가
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	public EmpDTO getRow(int empno) {
		
		EmpDTO dto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT empno, ename, job, hiredate, deptno FROM exam_emp WHERE empno=?"; // 물음표는 때때로 바뀐다는 의미
		
		try {
			
			pstmt = con.prepareStatement(sql);
			
			// ?에 대한 처리
			pstmt.setInt(1, empno); // 먼저 담은 물음표에 이거 담으라는 뜻 1은 첫번째 나오는 물음표 뜻함
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				// empno = rs.getInt("empno");
				// String ename = rs.getString("ename");
				// String job = rs.getString("job");
				// Date hiredate = rs.getDate("hiredate");
				// int deptno = rs.getInt("deptno");
				// dto = new EmpDTO(empno, ename, job, hiredate, deptno); 이렇게 생성자까지 새로 만들어 옮기는 방법도 있지만
				
				// 아래 방법을 더 많이 씀 (디폴트 이용)
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setDeptno(rs.getInt("deptno"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		
		return dto;
	}
	
	// 정보 수정
	public boolean update(int empno, int mgr) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE exam_emp SET mgr=? WHERE empno=?";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mgr);
			pstmt.setInt(2, empno);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	// 정보 삭제
	public boolean delete(int empno) {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM exam_emp WHERE empno=?";
		
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return false;
	}
	
	// 정보 추가 (DTO 생성 없이)
//	public boolean insert(int empno, String ename, String job, int mgr, int sal, int comm, int deptno) {
//		String sql = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, sysdate, ?, ?, ?)";
//		try {
//			con = getConnection();
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, empno);
//			pstmt.setString(2, ename);
//			pstmt.setString(3, job);
//			pstmt.setInt(4, mgr);
//			//pstmt.setString(5, hiredate);
//			pstmt.setInt(5, sal);
//			pstmt.setInt(6, comm);
//			pstmt.setInt(7, deptno);
//			
//			int result = pstmt.executeUpdate();
//			if (result>0) {
//				return true;
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				pstmt.close();
//				con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		
//		return false;
//	}
	
	// 정보 추가 (DTO 생성 해서)
	public boolean insert(EmpDTO insertDTO) {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO exam_emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, sysdate, ?, ?, ?)";
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, insertDTO.getEmpno());
			pstmt.setString(2, insertDTO.getEname());
			pstmt.setString(3, insertDTO.getJob());
			pstmt.setInt(4, insertDTO.getMgr());
			//pstmt.setString(5, insertDTO.gethiredate);
			pstmt.setInt(5, insertDTO.getSal());
			pstmt.setInt(6, insertDTO.getComm());
			pstmt.setInt(7, insertDTO.getDeptno());
			
			int result = pstmt.executeUpdate();
			if (result>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return false;
	}
	
	
}
