package kr.or.ddit.user.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.swing.*;

/**
 * kr.or.ddit.user.model
 * null.java
 * Desc : 객체검증과 에러 메세지
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오전 10:45
 * @Version :
 */
public class UserVoValidator implements Validator {

	private Logger logger = LoggerFactory.getLogger(UserVoValidator.class);

	// 메소드 인자로 들어온 clazz 객체가 userVo로 부터 생성 가능한지 여부를 판단
	@Override
	public boolean supports(Class<?> clazz) {
		return UserVo.class.isAssignableFrom(clazz);
	}

	// 실제로 검증로직( 값이 비어 있는지 , 글자수 제한, 정규식, 핸드폰번호 포맷팅적용?)
	@Override
	public void validate(Object target, Errors errors) {
		//validation 대상 객체
		//target --> userVo
		UserVo userVo = (UserVo)target;
		if (userVo.getUserId() == null || userVo.getUserId().equals(""))
			errors.rejectValue("userId","required");
		else if (userVo.getName() == null || userVo.getName().equals(""))
			errors.rejectValue("name","noName");
		//pass 길이가 5보다 작으면 error:lengthNotEnough
		else if (userVo.getPass() == null || userVo.getPass().length()<5)
			errors.rejectValue("pass","lengthNotEnough");
	}

}
