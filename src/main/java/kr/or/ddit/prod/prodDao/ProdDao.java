package kr.or.ddit.prod.prodDao;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.model.PageVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ProdDao implements ProdDaoInf {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;

	// prod 전체 가지고 오는 쿼리 
	@Override
	public List<ProdVo> selectProdAll() {

		
		List<ProdVo> list = template.selectList("prod.prodList");
		

		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return list;
	}

	@Override
	public List<ProdVo> selectProdPageList(PageVo pageVo) {
		List<ProdVo> prodPageList = template.selectList("prod.selectProdPageList", pageVo);
		
		// 명시적으로 처리해 주기 
		//session.rollback();
		//session.commit();
		
		// 세션을 사용했으니깐 닫아준다

		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return prodPageList;
		
	}

	/**  * Method   : getUserCnt
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @return
	  * Method 설명 :  제품 전체 건수 조회 
	*/
	@Override
	public int getProdCnt() {

		int totalProdCnt = template.selectOne("prod.getProdCnt");

		return totalProdCnt;
	}

	// 상품 상세 정보 나오게 설정하는 방법 
	public ProdVo selectProd(String prodId) {

		ProdVo prodVo = template.selectOne("prod.prodDetail",prodId);

		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return prodVo;
	}

}
