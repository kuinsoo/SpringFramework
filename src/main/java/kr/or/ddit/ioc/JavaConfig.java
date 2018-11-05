package kr.or.ddit.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceInf;

@Configuration
public class JavaConfig {
	
	/*board Spring bean 등록
	 * <bean id="boardDao" class="kr.or.ddi.board.dao.BoardDao">
	 */
	@Bean(name="boardDao")
	public BoardDaoInf getBoardDao() {
		return new BoardDao();
	}
	
	/*boardService spring Bean 등록*/
	@Bean(name="boardService")
	public BoardServiceInf boardservice() {
		
		BoardServiceInf boardService = new BoardService();
		boardService.setBoardDao(getBoardDao());
		return boardService;
	}
}
