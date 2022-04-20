package board.service;

import java.sql.Connection;
import java.util.List;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import board.dto.SearchDTO;

import static board.dao.JdbcUtil.*;

public class BoardSearchService {
	public List<BoardDTO> search(SearchDTO searchDto){
		
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		
		List<BoardDTO> list = dao.searchList(searchDto);
		
		close(con);
		
		return list;
	}
}
