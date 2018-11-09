package kr.or.ddit.file.dao;

import kr.or.ddit.file.model.FileVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository // 아무것도 명시하지 않으면 Class 이름에 앞글자만 소문자로 변경되서 주입된다.
public class FileDao implements FileDaoInf{


	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
//	public FileDao() {
//		factory = SqlFactoryBuilder.getSqlSessionFactory();
//	}

	/**
	* Method : insertFile
	* 작성자 : Mr.KKu
	* 변경이력 :
	* @param fileVo
	* @return
	* Method 설명 : 파일 정보 저장
	*/
	@Override
	public int insertFile(FileVo fileVo) {
		return template.insert("file.insertFile",fileVo);
	}
}
