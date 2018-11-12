package kr.or.ddit.test;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
//controller의 경우 service 스프링 빈을 주입받기 때문에 service, da에 대해 설정파일도 필요하다.
@ContextConfiguration(locations = {"file:src/main/resources/kr/or/ddit/config/spring/root-context.xml",
		"file:src/main/resources/kr/or/ddit/config/spring/transaction-context.xml",
		"file:src/test/resources/kr/or/ddit/config/spring/datasource-test-context.xml"
})
@WebAppConfiguration //스프링 컨테이너를 웹 기반에서 활용가능 한  WebApplicationContext로 생성 
public class ServiceDaoTestConfig {

	
	@Resource(name = "datasource")
	private DataSource datasource;
	
	@Before
	public void rangerSetup() {
		// 데이터 초기화
		//  delete query 호출 --> sql 스크립트를 실행해주는 녀석
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//		populator.addScripts(scripts);  // 많은 양에 SQL 문서를 작성하기 위해서 
		populator.addScript(new ClassPathResource("kr/or/ddit/config/db/ddInit.sql"));
		populator.setContinueOnError(false); // error 발생시 다음 진행을 막는다.
		DatabasePopulatorUtils.execute(populator, datasource);
	}
	
	@Ignore
	@Test
	public void test() {
		
	}
}
