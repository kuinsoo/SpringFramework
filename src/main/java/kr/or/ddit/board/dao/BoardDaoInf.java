package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.board.model.BoardVo;

public interface BoardDaoInf {

	/**
	* Method : selectBoardList
	* 작성자 : Mr.KKu
	* 변경이력 :
	* @return
	* Method 설명 : 
	*/
	List<BoardVo> selectBoardList();
}
