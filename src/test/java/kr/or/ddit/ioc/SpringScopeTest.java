package kr.or.ddit.ioc;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDaoInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context.xml"})
public class SpringScopeTest {

	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	
	@Resource(name="boardDaoSingleton")
	private BoardDaoInf boardDaoSingleton;
	@Resource(name="boardDaoSingleton")
	private BoardDaoInf boardDaoSingleton2;
	
	
	@Test
	public void springBeanSingletonTest() {
		/***Given***/
		
		/***When***/

		/***Then***/
		assertEquals(boardDaoSingleton, boardDaoSingleton2);
	}

}
