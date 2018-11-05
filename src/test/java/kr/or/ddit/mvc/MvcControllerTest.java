package kr.or.ddit.mvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unchecked")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:kr/or/ddit/config/spring/servletContext.xml","classpath:kr/or/ddit/config/spring/root-context.xml" })
@WebAppConfiguration		//spring IoC 컨테이너 구성을  web 환경에 맞게 구성
public class MvcControllerTest {
	private static Logger logger = LoggerFactory.getLogger(MvcController.class);
	
	@Autowired
	private WebApplicationContext ctx; //spring IoC 컨테이너
	
	private MockMvc mockMvc; 		// dispatcher servlet (front controller)
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	

	@Test
	public void mvcControllerTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/view")).andReturn();
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName(); 
		
		//model 속성 받아오기  
		List<String>rangers = (List<String>) mav.getModel().get("rangers");
		/***Then***/
		for (String string : rangers) {
			logger.debug("rangerName : {}", string);
		}
		assertEquals("mvc/view", viewName);
		assertEquals(4, rangers.size());//
	}
	
	@Test
	public void mvcControllerTest2() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/view2")).andReturn();
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName(); 
		
		//model 속성 받아오기  
		List<String>rangers = (List<String>) mav.getModel().get("rangers");
		/***Then***/
		logger.debug("rangers.size : {}", rangers.size());
		assertEquals("mvc/view2", viewName);
		assertEquals(3, rangers.size());
	}
	
	@Test
	public void fileUploadTest() throws Throwable {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/fileupload")).andReturn();
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		logger.debug("fileupload : {}",mav.getViewName());
		/***Then***/
		assertEquals("mvc/fileuploadView", mav.getViewName());
		
	}

}
