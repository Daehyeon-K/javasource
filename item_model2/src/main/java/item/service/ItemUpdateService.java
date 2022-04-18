package item.service;

import java.sql.Connection;

import item.dao.ItemDAO;

import static item.dao.JdbcUtil.*;

public class ItemUpdateService {
	public boolean modify(int num, String psize, int price) {
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);
		boolean result = dao.update(num, psize, price);
		
		if(result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return result;
		
	}
}
