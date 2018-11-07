package kr.or.ddit.mvc;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.model.UserVoValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * kr.or.ddit.mvc
 * null.java
 * Desc : 객체 검증과 에러 메세지
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오전 10:32
 * @Version :
 */

@RequestMapping("/validator")
@Controller
public class ValidatorController {
	//validator 를 테스트할 view ( /WEB-INF/view/validator/result.jsp)
	// httpMethod : get
	@RequestMapping(value = "/view" , method = RequestMethod.GET)
	public String view() {
		return "validator/view";
	}
	//view에서 입력한 값을 처리할 method

	// 검증절차에서 문제가 있을경우 최초 테스트 view로 가서 메세지 출력
	// 검증절찰에 문제가 없을경우 result.jsp( /WEB-INF/view/validator/result.jsp) 이동
	// httpMethod : post

	// BindingResult 객체는 검증하고자 하는 vo 객체 뒤에 메소드 인자로 넣어야한다.
	// @@@ 메서드 인자 순서 주의
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String validate(UserVo userVo, BindingResult bindingResult, Model model) {
		new UserVoValidator().validate(userVo, bindingResult);

		if(bindingResult.hasErrors())
			return "validator/view";

		model.addAttribute("userVo", userVo);
		return "validator/result";
	}

}
