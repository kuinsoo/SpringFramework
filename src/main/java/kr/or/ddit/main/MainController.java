package kr.or.ddit.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String main() {

		/* viewName "main"
		*  우선순위에 따라 viewResolver를 검색
		*  1. beanName ViewResolver
		*  1-1. bean id(name)가 "main"인 bean이 있는지 확인 -- 없음
		*  2. tilesViewResolver
		*  2-1. tiles-config.xml 에서 main 이라는 이름의 definition 이 있는지 확인
		*  2-2. 해당 defination 에 맞는 layout 이 적용된 jsp 를 결합하여 응답 생성
		*  */
		return "main";
	}
}
