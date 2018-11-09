package kr.or.ddit.file.util;

import static org.junit.Assert.assertEquals;

import kr.or.ddit.test.ServiceDaoTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration //spring container 를 web 기반 컨테이너로 생성
public class FileUtilTest extends ServiceDaoTestConfig {
	
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
