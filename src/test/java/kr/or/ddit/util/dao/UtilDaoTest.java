package kr.or.ddit.util.dao;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.test.ServiceDaoTestConfig;

public class UtilDaoTest extends ServiceDaoTestConfig {

	private Logger logger = LoggerFactory.getLogger(UtilDaoTest.class);
	
	@Resource(name="utilDao")
	private UtilDaoInf utilDao;
	
	@Test
	public void makMothlyCalenderTest() {
		/***Given***/
		String ym = "20181101";
		/***When***/
		int insertCnt = utilDao.makMothlyCalender(ym);
		/***Then***/
		SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		
		logger.debug("assssssssssssssssssssssssssssssssssssss{} ", smt.format(new Date()));
		
		assertEquals(30, insertCnt);
	}

}
