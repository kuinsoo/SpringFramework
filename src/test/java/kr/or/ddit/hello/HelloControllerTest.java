package kr.or.ddit.hello;

import kr.or.ddit.test.ControllerTest;
import kr.or.ddit.user.model.UserVo;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SuppressWarnings("unchecked")
public class HelloControllerTest extends ControllerTest {
	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	private static Logger loggerVo = LoggerFactory.getLogger(UserVo.class);
		
	@Test
	public void helloTest() throws Throwable {
		/***Given***/
		
		/***When***/
		//dispatcher servlet 으로 요청 전송
		MvcResult mvcResult = mockMvc.perform(get("/hello/hello.do")).andReturn();
		
		ModelAndView mav = mvcResult.getModelAndView();
		/***Then***/
		//viewName
		assertEquals("hello", mav.getViewName());
	}
	
	@Test
	public void modelTest() throws Throwable {
		/***Given***/
		
		/***When***/
		MvcResult mvcResult = mockMvc.perform(get("/hello/model")).andReturn();
		ModelAndView mav = mvcResult.getModelAndView();
		List<String> rangers =   (List<String>) mav.getModel().get("rangers");
//		List<String> rangersMap =   (List<String>) mav.getModelMap().get("rangers");
		/***Then***/
		// 1. view 이름
		for (String string : rangers) {
			logger.debug("{}", string );
		}
		// 2. rangers 속성(model)
		assertEquals(3, rangers.size());
	}
	
	@Test
	public void requestTest() throws Throwable {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/hello/request").param("userId", "brown").param("pass", "brownpass")).andReturn();
		/***When***/
		String user = (String) mvcResult.getRequest().getAttribute("userId");
		ModelAndView mav = mvcResult.getModelAndView();
		logger.debug("user : {}",user);
		//view name 
		
		//userId, pass 속성
		String userId = (String)mav.getModel().get("userId");
		
		/***Then***/
		assertEquals(user, userId);
	}
	
	@Test
	public void voTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/hello/vo").param("userId", "brown").param("pass", "brownpass")).andReturn();
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		UserVo userVo = (UserVo) mav.getModel().get("userVo");
		/*String pass   = (String) mav.getModel().get("pass");*/
		/***Then***/
		loggerVo.debug("userId : {}" , userVo.getUserId());
		assertNotNull(userVo);
	}
	
	@Test
	public void voidTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/hello/modelAndView")).andReturn();
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		List<String> rangers = (List<String>) mav.getModel().get("rangers");
		
		/*String pass   = (String) mav.getModel().get("pass");*/
		/***Then***/
		
		assertEquals(3, rangers.size());
		
	}

}
