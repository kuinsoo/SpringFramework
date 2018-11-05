package kr.or.ddit.user.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/loginView")
	public String loginView() {
		
		return "login/login";
	}
	
	@RequestMapping("/loginProcess")
	public String loginProcess(HttpServletRequest request, Model model) {
		String userId 	= request.getParameter("userId");
		String pass 	= request.getParameter("pass");
		
		if(userId.equals("brown") && pass.equals("brownpass")) {
			model.addAttribute("resutl", "/main");
			return "main";
		}
		model.addAttribute("resutl", "/login/login");
		return "login/login";
	
	}
}
