package kr.or.ddit.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

	/* @RequestMapping이 붙은 메소드가 실행되기 전에 멀저 실행된다.
	 * 해당 컨트롤러에서 공통적으로 사용될 속성이 있을경우 
	 * 중복을 피하기 위해 @ModelAttribute 어노테이션을 적용한 
	 * 메소드를 통해 코드 중복을 막을 수 있다.
	 */	
	@ModelAttribute
	public void setup(Model model) {
		List<String> rangers = new ArrayList<>();
		rangers.add("brown");
		rangers.add("cony");
		rangers.add("sally");
		
		model.addAttribute("rangers", rangers);
	}
	
	//메서드 단위로 맵핑
	@RequestMapping("/mvc/view")
	// 모델에서 사용된 모델에 새로운 값을 추가 할수 있는 방법
	public String mvcView(@ModelAttribute("rangers")List<String> rangers) {
		rangers.add("edword");
		return "mvc/view";
	}
	
	//메서드 단위로 맵핑
	@RequestMapping("/mvc/view2")
	public String mvcView2() {
		
		return "mvc/view2";
	}
}
