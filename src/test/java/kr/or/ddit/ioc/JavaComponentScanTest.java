package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {JavaComponentScanConfig.class})
public class JavaComponentScanTest {
	
	private Logger loggerDao = LoggerFactory.getLogger(BoardDao.class);
	private Logger loggerService = LoggerFactory.getLogger(BoardService.class);
	 
	

	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	
	@Resource(name="boardService")
	private BoardServiceInf boardService;
	
	
	/**
	* Method : componetScanTest
	* 작성자 : Mr.KKu
	* 변경이력 :
	* Method 설명 : spring annotation scan을 통해 
	* 				스프링 빈 생성이 정상적으로 작동되는지 테스트
	*/
	@Test
	public void daoComponetScanTest() {
		/***Given***/
		
		/***When***/
		List<BoardVo> boardList = boardDao.selectBoardList();
		for (BoardVo boardVo : boardList) {
			loggerDao.debug("{}", boardVo);
		}
		/***Then***/
		assertNotNull(boardDao);
	}
	
	@Test
	public void serviceComponetScanTest() {
		/***Given***/
		
		/***When***/
		List<BoardVo> boardList = boardService.selectBoardList();
		for (BoardVo boardVo : boardList) {
			loggerService.debug("{}",boardVo);
		}
		/***Then***/
		assertNotNull(boardList);
	}
	
	@Test
	public void sharedObjects() {
		/***Given***/
		
		/***When***/

		/***Then***/
		assertEquals(true, boardService.getDao().equals(boardDao));
	}

}
