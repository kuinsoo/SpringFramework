package kr.or.ddit.util.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UtilDao implements UtilDaoInf {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	
	@Override
	public int makMothlyCalender(String ym) {
		return template.insert("util.makMothlyCalender",ym);
	}

	
}
