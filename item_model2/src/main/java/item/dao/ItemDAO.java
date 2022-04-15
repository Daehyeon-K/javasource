package item.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import item.dto.ItemDTO;

import static item.dao.JdbcUtil.*;

public class ItemDAO {
	private Connection con;

	public ItemDAO(Connection con) {
		super();
		this.con = con;
	}
	
	// CRUD
	
	// CREATE
	public boolean insert(ItemDTO dto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into item(num, category, name, content, psize, price) values(item_seq.nextval, ?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);;
			pstmt.setString(1, dto.getCategory());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPsize());
			pstmt.setInt(5, dto.getPrice());
			
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
	
	
	// READ List
	public List<ItemDTO> getList(){
		List<ItemDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select num, category, name, psize, price, register_at from item";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setCategory(rs.getString("category"));
				dto.setName(rs.getString("name"));
				dto.setPsize(rs.getString("psize"));
				dto.setPrice(rs.getInt("price"));
				dto.setRegisterAt(rs.getDate("register_at"));
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
	
	
	// UPDATE
	
	
	// DELETE
}
