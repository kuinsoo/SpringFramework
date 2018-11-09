package kr.or.ddit.user.userService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.user.dao.UserDaoInf;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

@Service
public class UserService implements UserServiceInf {
	
	public UserService() {}
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate template;

	@Resource(name = "userDao")
	private UserDaoInf ud;

	
	@Override
	public List<UserVo> selectUserAll() {
		return ud.selectUserAll();
	}

	@Override
	public UserVo selectUser(String userId) {
		return ud.selectUser(userId);
	}

	@Override
	public UserVo selectUserByVo(UserVo userVo) {
		return ud.selectUserByVo(userVo);
	}

	
	
	/**  * Method   : selectUserPageList
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @param pageVo
	  * @return
	  * Method 설명 :  사용자 페이징 조회
	*/
	@Override
	public Map<String , Object> selectUserPageList(PageVo pageVo) {
		
		// 페이지에 해당 하는 유저 리스트(1~10건) 
		List<UserVo> pageList = ud.selectUserPageList(pageVo);
		
		// 페이지 내비게이션을 위한 전체 유저 리스트 조회 
		int totalUserCnt = ud.getUserCnt();
		
		//리턴해야 하는게 두건일경우에는 (Map)
		// 결과를 담는 map
		Map<String , Object> resultMap = new HashMap<String , Object>();
		resultMap.put("pageList",pageList);
		//Math.ceil가 올림해주는 부분 
		resultMap.put("pageCnt",
				(int)Math.ceil((double)totalUserCnt / pageVo.getPageSize()));
		
		return resultMap;
		
	}

	/**  * Method   : inserUser
	  * 작성자 : PC 
	  * 변경이력 :  
	  * @param : userVo
	  * @return : 리턴은 없다
	  * Method 설명 :  사용자 등록
	*/
	@Override
	public int insertUser(UserVo userVo) {
		return ud.insertUser(userVo);
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
		
		// commit을 해야 데이터가 확정된다 ( 꼭 해주기 !)
		
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
		
		
		int updateCnt = template.delete("user.updateUser", userVo);
		
		// commit을 해야 데이터가 확정된다 ( 꼭 해주기 !)
		
		return updateCnt;
	}

}
