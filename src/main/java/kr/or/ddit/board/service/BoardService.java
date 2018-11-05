package kr.or.ddit.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;

@Service("boardService")

public class BoardService implements BoardServiceInf {
	
	

	
	public BoardService() {
		super();
	}

	public BoardService(BoardDaoInf boardDao) {
		this.boardDao = boardDao;
	}
	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	
	@Override
	public List<BoardVo> selectBoardList() {

		return boardDao.selectBoardList() ;
	}

	public BoardDaoInf getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDaoInf boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public BoardDaoInf getDao() {
		// TODO Auto-generated method stub
		return boardDao;
	}
	
	

	
}
