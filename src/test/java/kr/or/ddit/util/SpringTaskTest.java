package kr.or.ddit.util;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.test.ServiceDaoTestConfig;

public class SpringTaskTest extends ServiceDaoTestConfig {

	private Logger logger = LoggerFactory.getLogger(SpringTaskTest.class);
	
	@Resource(name="springTask")
	private SpringTask springTask;
	
	
	@Test
	public void makMothlyCalenderTest() {
		/***Given***/
		
		/***When***/
		springTask.makMothlyCalender();
		/***Then***/
	}

}
