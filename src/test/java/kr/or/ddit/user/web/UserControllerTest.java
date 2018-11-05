package kr.or.ddit.user.web;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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

import kr.or.ddit.user.model.UserVo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/servletContext.xml"})
@WebAppConfiguration //spring container 를 web 기반 컨테이너로 생성
public class UserControllerTest {

	private Logger logger = LoggerFactory.getLogger(UserVo.class);
	
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		 mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
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
