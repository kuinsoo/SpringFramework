package kr.or.ddit.file.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.file.model.FileVo;

@Repository // 아무것도 명시하지 않으면 Class 이름에 앞글자만 소문자로 변경되서 주입된다.
public class FileDao implements FileDaoInf{
	private SqlSessionFactory factory;
	
	public FileDao() {
		factory = SqlFactoryBuilder.getSqlSessionFactory();
	}

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
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("file.insertFile",fileVo);
		session.commit();
		session.close();
		return resultCnt;
	}
}
