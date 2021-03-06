package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.dto.BoardDTO;
import board.dto.SearchDTO;

import static board.dao.JdbcUtil.*;

public class BoardDAO {
	private Connection con;

	public BoardDAO(Connection con) {
		super();
		this.con = con;
	}
	
	// CRUD
	// 게시글 삽입, 삭제, 수정(게시글 수정, 조회수 수정), 조회, 전체조회
	
	// 게시글 삽입
	public boolean insertArticle(BoardDTO insertDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into board(bno, name, password, title, content, attach, re_ref, re_lev, re_seq) values(board_seq.nextval, ?, ?, ?, ?, ?, board_seq.currval, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getPassword());
			pstmt.setString(3, insertDto.getTitle());
			pstmt.setString(4, insertDto.getContent());
			pstmt.setString(5, insertDto.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			if(pstmt.executeQuery()!=null) {
				commit(con);
				flag = true;
			} else {
				rollback(con);
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
		return flag;
	}
	
	
	// 게시글 삭제
	public boolean delete(int bno, String password) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "delete from board where bno = ? and password = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, password);
			
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
	
	
	// 게시글 수정
	public boolean updateArticle(BoardDTO updateDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			if(updateDto.getAttach()!=null) {
				sql = "update board set title=?, content=?, attach=? where bno = ? and password = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setString(3, updateDto.getAttach());
				pstmt.setInt(4, updateDto.getBno());
				pstmt.setString(5, updateDto.getPassword());
			} else {
				sql = "update board set title=?, content=? where bno = ? and password = ?";
				pstmt = con.prepareStatement(sql);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setInt(3, updateDto.getBno());
				pstmt.setString(4, updateDto.getPassword());
			}
			
			
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
	
	
	// 게시글 전체 조회
	public List<BoardDTO> listArticle(SearchDTO searchDto){
		List<BoardDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//String sql = "select bno, title, name, regdate, readcount, re_ref, re_seq, re_lev from board order by re_ref desc, re_seq asc";
		String sql = "select * from (select rownum as rnum, A.* ";
		sql += " from (select bno, title, name, regdate, readcount, re_ref, re_lev, re_seq ";
		sql += " from board ";
		sql += " where bno > 0 order by re_ref desc, re_seq asc) A ";
		sql += " where rownum <= ?) ";
		sql += " where rnum > ?";
		
		int start = searchDto.getPage() * searchDto.getAmount();
		int end = (searchDto.getPage()-1) * searchDto.getAmount();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setReadCount(rs.getInt("readcount"));
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReSeq(rs.getInt("re_seq"));
				// list.jsp에서 사용하는 칼럼
				dto.setReLev(rs.getInt("re_lev"));
				
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
	
	// 전체 게시물 개수
	public int totalRows() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;;
		String sql = "select count(*) from board";
		int total = 0;
		try {
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
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
		return total;
	}
	
	// 게시글 보기
	public BoardDTO getRow(int bno) {
		BoardDTO dto = new BoardDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select bno, name, title, content, attach, re_ref, re_seq, re_lev from board where bno = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			rs = pstmt.executeQuery();			
			if(rs.next()) {
				dto.setBno(rs.getInt("bno"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setAttach(rs.getString("attach"));
				// 댓글 작업 시 필요한 부분
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReSeq(rs.getInt("re_seq"));
				dto.setReLev(rs.getInt("re_lev"));
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
		return dto;
	}
	
	// 조회수 업데이트
	public boolean hitUpdate(int bno) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "update board set readcount = readcount+1 where bno = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
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
	
	
	// 댓글
	public boolean reply(BoardDTO replyDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			int re_ref = replyDto.getReRef();
			int re_seq = replyDto.getReSeq();
			int re_lev = replyDto.getReLev();
			
			//기존 댓글 업데이트			
			sql = "update board set re_seq = re_seq+1 where re_ref = ? and re_seq > ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
			
			int updateCnt = pstmt.executeUpdate();
			
			close(pstmt);
			
			// 댓글 삽입
			// 댓글 작성 (re_ref: 원본글의 re_ref값과 동일하게 삽입
			//  	    re_lev: 원본글의 re_lev + 1 삽입
			//		    re_seq: 원본글의 re_seq + 1 삽입)
			
			re_lev = re_lev+1;
			re_seq = re_seq+1;
			
			sql = "insert into board(bno, name, password, title, content, attach, re_ref, re_lev, re_seq)";
			sql += "values(board_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, replyDto.getName());
			pstmt.setString(2, replyDto.getPassword());
			pstmt.setString(3, replyDto.getTitle());
			pstmt.setString(4, replyDto.getContent());
			pstmt.setString(5, replyDto.getAttach());
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			
			int insertCnt = pstmt.executeUpdate();
			
			if(insertCnt>0) flag = true;
			
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
	// criteria=title&keyword=게시판
	// criteria=content&keyword=게시판
	// criteria=name&keyword=게시판
	public List<BoardDTO> searchList(SearchDTO searchDto){
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select bno,title,name,regdate,readcount,re_ref,re_lev,re_seq from board where "+searchDto.getCriteria()+" like ? order by re_ref desc, re_seq asc";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+searchDto.getKeyword()+"%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setReadCount(rs.getInt("readcount"));
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReSeq(rs.getInt("re_seq"));
				dto.setReLev(rs.getInt("re_lev"));
				list.add(dto);
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
		return list;
	}
	
}
