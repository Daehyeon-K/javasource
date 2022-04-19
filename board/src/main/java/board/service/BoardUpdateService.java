package board.service;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

import static board.dao.JdbcUtil.*;

public class BoardUpdateService {
	public boolean update(BoardDTO updateDto) {
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		boolean result = false;
		
		if (dao.updateArticle(updateDto)) {
			commit(con);
			result = true;
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}
}
