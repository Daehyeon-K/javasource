package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import book.dto.BookDTO;
import static book.dao.JdbcUtil.*;

public class BookDAO {
	private Connection con;

	public BookDAO(Connection con) {
		super();
		this.con = con;
	}
	
	// CRUD
	
	// Read List
	public List<BookDTO> getList() {
		List<BookDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from bookTBL";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BookDTO dto = new BookDTO(rs.getInt("code"), rs.getInt("price"), rs.getString("title"), rs.getString("writer"));
				list.add(dto);
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
		return list;
	}

	// CREATE
	public boolean insert(BookDTO dto) {
		boolean flag = false;
		PreparedStatement pstmt=null;
		String sql = "insert into bookTBL values(?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCode());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getWriter());
			pstmt.setInt(4, dto.getPrice());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag=true;
			
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
	
	// DELETE
	public boolean delete(int code) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "delete from bookTBL where code = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			int result = pstmt.executeUpdate();
			
			if (result > 0) flag = true;
			
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
	
	// UPDATE
	public boolean update(int code, int price) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update bookTBL set price = ? where code = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setInt(2, code);
			int result = pstmt.executeUpdate();
			
			if (result>0) flag = true;
			
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
	
	// 검색
	// SEARCH : select * from bookTBL where code = ?;
	// 			select * from bookTBL where writer like ?;
	public List<BookDTO> searchList(String criteria, String keyword) {
		List<BookDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		try {
			if (criteria.equals("code")) {
				sql = "select * from bookTBL where code = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(keyword));
			} else {
				sql = "select * from bookTBL where writer like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+keyword+"%");
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BookDTO dto = new BookDTO(rs.getInt("code"), rs.getInt("price"), rs.getString("title"), rs.getString("writer"));
				list.add(dto);
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
		return list;
	}
	
}
