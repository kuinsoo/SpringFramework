package kr.or.ddit.ioc;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:kr/or/ddit/ioc/application-context-collection.xml")
public class CollectionInjectTest {
	
	private static Logger logger = LoggerFactory.getLogger(IocMain.class);
	
	@Resource(name="collectionBean")
	private CollectionBean collectionBean;
	
	@Test
	public void collectionBeanTest() {
		/***Given***/
		
		/***When***/
		List<String> collectionList = collectionBean.getList();
		Set<String> collectionSet = collectionBean.getSet();
		Map<String, String> collectionMap = collectionBean.getMap();
		Properties collectionProperty = collectionBean.getProperty();
		
		/***Then***/
		logger.debug("collectionBean : {}",collectionBean.toString());
		logger.debug("collectionBean : {}",collectionBean.getList());
		logger.debug("collectionBean : {}",collectionBean.getMap());
		logger.debug("collectionBean : {}",collectionBean.getProperty());
		
		assertNotNull(collectionBean);
		
		assertEquals(3, collectionList.size());
		assertEquals(3, collectionSet.size());
		assertEquals(2, collectionMap.size());
		assertEquals(2, collectionProperty.size());
	}

}
