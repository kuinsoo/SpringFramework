package kr.or.ddit.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

import javax.annotation.Resource;

@Repository
public class UserDao implements UserDaoInf {
	
	public UserDao () {}
	
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	// jspuser 테이블 테이터 전체 조회 쿼리 
	// select query id : selectUserAll
	public List<UserVo> selectUserAll(){
		
		
		List<UserVo> list = template.selectList("user.selectUserAll");
		
		
		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return list;
	}
	
	// jspuser 테이블 테이터 전체 조회 쿼리 
	// select query id : selectUserAll
	public UserVo selectUser(String userId){
		
		
		
		UserVo user = template.selectOne("user.selectUser",userId);
		
		
		
		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return user;
	}
	
	
	public UserVo selectUserByVo(UserVo userVo){

		UserVo user = template.selectOne("user.selectUserByVo", userVo);
		

		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return user;
		
	}


	// 페이징 처리 
	@Override
	public List<UserVo> selectUserPageList(PageVo pageVo) {

		List<UserVo> userList = template.selectList("user.selectUserPageList", pageVo);
		
		// 명시적으로 처리해 주기 
		//template.rollback();
		//template.commit();
		
		// 세션을 사용했으니깐 닫아준다

		// 매개변수가 없어서 값을 주지 않아도 된다 
		// 여러건을 조회할때에는 selectList를 사용한다
		// selectOne : 데이터가 한건 일 떄 
		// 메소드 인자 : 문자열 = 네임스페이스(일반적으로 모듈명을 이용) .쿼리아이디 
		return userList;
		
		
	}

	/**  * Method   : getUserCnt
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @return
	  * Method 설명 :  사용자 전체 건수 조회 
	*/
	@Override
	public int getUserCnt() {

		int totalUserCnt = template.selectOne("user.getUserCnt");

		return totalUserCnt;
	}
	
	
	/**  * Method   : inserUser
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @param : userVo
	  * @return : 리턴은 없다
	  * Method 설명 :  사용자 등록
	*/
	@Override
	public int insertUser(UserVo userVo){
		

		int insertCnt = template.insert("user.insertUser", userVo);
		

		return insertCnt;
	}


	/**  * Method   : deleteUser
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @param userID
	  * @return
	  * Method 설명 :  사용자 삭제 
	*/
	@Override
	public int deleteUser(String userId) {

		int deleteCnt = template.delete("user.deleteUser", userId);
		

		return deleteCnt;
	}


	/**  * Method   : updateUser
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @param userId
	  * @return
	  * Method 설명 :  사용자 정보 수정
	*/
	@Override
	public int updateUser(UserVo userVo) {
		
		int updateCnt = template.update("user.updateUser", userVo);
		
		// commit을 해야 데이터가 확정된다 ( 꼭 해주기 !)

		return updateCnt;
	}


}
