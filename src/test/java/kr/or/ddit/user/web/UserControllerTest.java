package kr.or.ddit.user.web;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTest;
import kr.or.ddit.user.model.UserVo;



public class UserControllerTest extends ControllerTest {

	private Logger logger = LoggerFactory.getLogger(UserVo.class);
	
	
	@Test
	public void loginView() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/user/loginView")).andReturn();
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		/***Then***/
		assertEquals("login/login", mav.getViewName());
	}
	
	@Test
	public void loginProcess() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(post("/user/loginProcess").param("userId", "brown").param("pass", "brownpass")).andReturn();
		/***When***/
		String userId = (String) mvcResult.getRequest().getParameter("userId");
		logger.debug("userId : {}",userId);
		String pass = (String) mvcResult.getRequest().getParameter("pass");
		ModelAndView mav = mvcResult.getModelAndView();
		String result="";
		if(userId.equals("brown") || pass.equals("brownpass")) {
			result = "main";
		}
		logger.debug("{}",mav.getViewName());
		/***Then***/
		assertEquals(result, mav.getViewName());
	}
	
	@Test
	public void loginProcessFailTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(post("/user/loginProcess").param("userId", "brown").param("pass", "1")).andReturn();
		/***When***/
		String userId = (String) mvcResult.getRequest().getParameter("userId");
		String pass = (String) mvcResult.getRequest().getParameter("pass");
		ModelAndView mav = mvcResult.getModelAndView();
		String result="";
		if(userId.equals("brown") || pass.equals("1")) {
			result = "login/login";
		}
		logger.debug("fail : {}",mav.getViewName());
		/***Then***/
		assertEquals(result, mav.getViewName());
	}

}
