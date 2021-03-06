package kr.or.ddit.prod.web;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.prodService.ProdServiceInf;
import kr.or.ddit.test.ControllerTest;
import kr.or.ddit.test.ServiceDaoTestConfig;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * kr.or.ddit.prod.web
 * JUnit4 Test Class.java.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오전 9:24
 * @Version :
 */
public class ProdControllerTest extends ServiceDaoTestConfig {

	@Resource(name = "prodService")
	private ProdServiceInf prodService;

	@Test
	public void prodList() {
		/*** Given ***/

		/*** When ***/
		List<ProdVo> prodVoList = prodService.selectProdAll();
		/*** Then ***/
		assertEquals(74,prodVoList.size());
	}


	@Test
	public void prodDetail() {
		/*** Given ***/

		/*** When ***/
		ProdVo prodVo = prodService.selectProd("P101000002");
		/*** Then ***/
		assertEquals("모니터 삼성전자17인치칼라",prodVo.getProd_name());
	}
}