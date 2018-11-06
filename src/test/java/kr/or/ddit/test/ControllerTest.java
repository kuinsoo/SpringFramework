package kr.or.ddit.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
//controller의 경우 service 스프링 빈을 주입받기 때문에 service, da에 대해 설정파일도 필요하다.
@ContextConfiguration(locations = {"file:src/main/resources/kr/or/ddit/config/spring/root-context.xml" ,
									"file:src/main/resources/kr/or/ddit/config/spring/servlet-context.xml"})
@WebAppConfiguration //스프링 컨테이너를 웹 기반에서 활용가능 한  WebApplicationContext로 생성 
public class ControllerTest {
	//webApplicationContext => mockMvc(dispatcherServlet) 생성을 위해 필요

	@Autowired //type 기반 주입 
	protected WebApplicationContext context; //spring IoC 컨테이너
	
	protected MockMvc mockMvc; // dispatcher servlet (front controller)
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Ignore
	@Test
	public void test() {
		
	}

}
