package kr.or.ddit.rangers.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.rangers.model.RangersVo;
import kr.or.ddit.test.ServiceDaoTestConfig;

	
public class RangersDaoTest extends ServiceDaoTestConfig {

	@Resource(name = "rangersDao")
	private RangersDaoInf rangersDao;
	
	@Test
	public void selectAllRangersTest() {
		/***Given***/
		
		/***When***/
		List<RangersVo> listRangerVos = rangersDao.selectAllRangers();
		/***Then***/
		assertEquals(3, listRangerVos.size());
	}
	
	@Test
	public void insertRangerTest() {
		/***Given***/
		RangersVo ranger = new RangersVo();
		ranger.setRagersId("sally");
		ranger.setName("셀리");
		/***When***/
		int insertCnt = rangersDao.insertRanger(ranger);
		/***Then***/
		assertEquals(1, insertCnt);
	}

}
