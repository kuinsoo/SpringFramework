package kr.or.ddit.main;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTest;


public class MainControllerTest  extends ControllerTest{


	@Test
	public void mainViewNameTest() throws Throwable {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/main")).andReturn();
		ModelAndView mav = mvcResult.getModelAndView();
		/***When***/

		/***Then***/
		assertEquals("main", mav.getViewName());
	}

}
