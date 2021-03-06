package book.service;

import java.sql.Connection;

import book.dao.BookDAO;

import static book.dao.JdbcUtil.*;

public class BookUpdateService {
	public boolean modify(int code, int price) {
		// DB 작업
		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);
		boolean result = dao.update(code, price);
		
		if(result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return result;
	}
}
