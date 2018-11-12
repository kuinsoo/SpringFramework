package kr.or.ddit.rangers.dao;

import java.util.List;

import kr.or.ddit.rangers.model.RangersVo;

public interface RangersDaoInf {

	List<RangersVo> selectAllRangers(); 
	
	int insertRanger(RangersVo rangersVo);
}
