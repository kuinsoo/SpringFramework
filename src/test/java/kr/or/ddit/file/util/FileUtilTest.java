package kr.or.ddit.file.util;

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

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.user.model.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/servletContext.xml","classpath:kr/or/ddit/config/spring/root-context.xml"})
@WebAppConfiguration //spring container 를 web 기반 컨테이너로 생성
public class FileUtilTest {

	private Logger logger = LoggerFactory.getLogger(UserVo.class);
	
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		 mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
	@Test
	public void getFileExtExists() throws Throwable {
		/***Given***/
		String fileName = "sally.png";
		/***When***/
		String ext = FileUtil.fileExt(fileName);
		/***Then***/
		assertEquals(".png",ext);
	}
	
	@Test
	public void getFileNotExtExists() {
		/***Given***/
		String fileName = "sally";
		/***When***/
		String ext = FileUtil.fileExt(fileName);
		/***Then***/
		assertEquals("",ext);
	}
	
	@Test
	public void getFileExtExistsMultiDot() throws Throwable {
		/***Given***/
		String fileName = ".png";
		/***When***/
		String ext = FileUtil.fileExt(fileName);
		/***Then***/
		assertEquals(".png",ext);
	}

}
