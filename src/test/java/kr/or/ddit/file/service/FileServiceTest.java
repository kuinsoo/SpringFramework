package kr.or.ddit.file.service;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.test.ServiceDaoTestConfig;

public class FileServiceTest extends ServiceDaoTestConfig {


	@Resource(name="fileService")
	private FileServiceInf fileService;
	
	@Test
	public void insertFileTest() {
		/***Given***/
		FileVo fileVo = new FileVo();
		fileVo.setFile_name("8743fe98-ba2a-423b-ab2b-8dac4fabeb07.zip");
		fileVo.setOrg_file_name("sally.png");
		fileVo.setFile_path("D:\\T_Development\\d_Study\\Spring\\upload");
		fileVo.setFile_ext(".png");
		/***When***/
		int resultCont =  fileService.insertFile(fileVo);
		/***Then***/
		assertEquals(1, resultCont);
	}

}
