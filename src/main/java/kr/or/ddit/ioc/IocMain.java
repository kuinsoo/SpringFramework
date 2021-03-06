package kr.or.ddit.ioc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardServiceInf;

public class IocMain {
	
	private static Logger logger = LoggerFactory.getLogger(IocMain.class);
	
	public static void main(String[] args) {
		
		//스프링 컨테이너 생성
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath:kr/or/ddit/ioc/application-context.xml"
		});
		
		// 스프링 컨테이너에서 boardDao 스프링 빈을 요청 (DL: Dependency Lookup)
		BoardDaoInf boardDao = (BoardDaoInf)context.getBean("boardDao");
		List<BoardVo> boardList = boardDao.selectBoardList();
		for (BoardVo boardVo : boardList) {
			
			//System.out.println("boardVo : " + boardVo); log4j 로 대체
			logger.debug("dao / boardVo : {}", boardVo); // level이 있어 출력 여부를 결정 *문자열 연산을 막기위한 logback 방법 
			
		}
		
		//스프링 컨테이너에서 boardService 스프링 빈을 요청후 selectBoardList
		BoardServiceInf boardService = context.getBean("boardService", BoardServiceInf.class);
		List<BoardVo> selectBoardList = boardService.selectBoardList();
		for (BoardVo boardVo : selectBoardList) {
			//결과를 logger를 이용해 consle 출력
			logger.debug("service / boardVo : {}", boardVo);
		}
		
		//생성자 주입을 통해 생성된 BoardService 스프링 
		BoardServiceInf boardServiceConst = context.getBean(""
				+ "boardServiceConst", BoardServiceInf.class);
		List<BoardVo> boardServiceConstList = boardServiceConst.selectBoardList();
		for (BoardVo boardVo : boardServiceConstList) {
			logger.debug("serviceConst / boardVo : {}", boardVo);
		}
		
		//spring scope-prototype test
		BoardDaoInf boardDaoPrototype1 = context.getBean("boardDaoPrototype1", BoardDaoInf.class);
		BoardDaoInf boardDaoPrototype2 = context.getBean("boardDaoPrototype1", BoardDaoInf.class);
		logger.debug("Spring prototype bean test : {}", boardDaoPrototype1==boardDaoPrototype2);
		
		//spring scope-singleton tesst
		BoardDaoInf boardDaoSingleton1 = context.getBean("boardDaoSingleton", BoardDaoInf.class);
		BoardDaoInf boardDaoSingleton2 = context.getBean("boardDaoSingleton", BoardDaoInf.class);
		logger.debug("Spring singleton bean test : {}", boardDaoSingleton1==boardDaoSingleton2);
	}
}
