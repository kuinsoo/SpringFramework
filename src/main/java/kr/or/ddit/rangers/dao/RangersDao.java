package kr.or.ddit.rangers.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.rangers.model.RangersVo;



@Repository
public class RangersDao implements RangersDaoInf {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public List<RangersVo> selectAllRangers() {
		return template.selectList("rangers.selectAllRangers");
	}

	@Override
	public int insertRanger(RangersVo rangersVo) {
		
		return template.insert("rangers.insertRanger",rangersVo);
	}

	
}
