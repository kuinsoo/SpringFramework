package kr.or.ddit.ioc;


import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:kr/or/ddit/ioc/application-context-placeholder.xml")
public class PlaceHolderTest {

	@Resource(name="placeHolder")
	private PlaceHolder placeHoldProperty;
	
	@Test
	public void placeHoldersTest() {
		/***Given***/
		
		/***When***/
		
		String user = placeHoldProperty.getUser();
		/***Then***/
		assertEquals("kuinsoo", user);
		
	}

}
