package kr.or.ddit.mvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTest;

@SuppressWarnings("unchecked")
public class MvcControllerTest extends ControllerTest {
	private static Logger logger = LoggerFactory.getLogger(MvcController.class);
	
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
