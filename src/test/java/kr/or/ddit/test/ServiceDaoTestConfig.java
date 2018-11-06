package kr.or.ddit.test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
//controller의 경우 service 스프링 빈을 주입받기 때문에 service, da에 대해 설정파일도 필요하다.
@ContextConfiguration(locations = {"file:src/main/resources/kr/or/ddit/config/spring/root-context.xml"})
@WebAppConfiguration //스프링 컨테이너를 웹 기반에서 활용가능 한  WebApplicationContext로 생성 
public class ServiceDaoTestConfig {
	
	@Ignore
	@Test
	public void test() {
		
	}

}
