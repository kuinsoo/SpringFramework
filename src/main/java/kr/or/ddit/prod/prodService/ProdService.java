package kr.or.ddit.prod.prodService;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.prodDao.ProdDaoInf;
import kr.or.ddit.util.model.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProdService implements ProdServiceInf {


	@Resource(name = "prodDao")
	private ProdDaoInf prod;


	@Override
	public List<ProdVo> selectProdAll() {
		return prod.selectProdAll();
	}


	@Override
	public Map<String, Object> selectProdPageList(PageVo pageVo) {
		// 페이지에 해당 하는 유저 리스트(1~10건) 
		List<ProdVo> prodPageList = prod.selectProdPageList(pageVo);
		
		// 페이지 내비게이션을 위한 전체 유저 리스트 조회 
		int totalProdCnt = prod.getProdCnt();
		
		//리턴해야 하는게 두건일경우에는 (Map)
		// 결과를 담는 map
		Map<String , Object> resultMap = new HashMap<String , Object>();
		resultMap.put("prodPageList",prodPageList);
		//Math.ceil가 올림해주는 부분 
		resultMap.put("prodPageCnt",
				(int)Math.ceil((double)totalProdCnt / pageVo.getPageSize()));
		
		return resultMap;
	}


	@Override
	public ProdVo selectProd(String prodId) {
		return prod.selectProd(prodId);
	}

}
