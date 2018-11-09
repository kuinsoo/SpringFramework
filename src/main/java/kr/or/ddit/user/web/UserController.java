package kr.or.ddit.user.web;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.userService.UserServiceInf;
import kr.or.ddit.util.model.PageVo;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private UserServiceInf userService;
	
	
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
	
	@RequestMapping("/userAllList")
	public String userAllList(Model model) {
		//userService 사용자 전체 정보조회
		List<UserVo> userList = userService.selectUserAll();
		
		model.addAttribute("userAllList",userList);
		
		return "userAllList";
	}
	
	@RequestMapping("/userPageList")
	public String userPageList(Model model, PageVo pageVo) {
		// spring 컨테이너로부터 bean을 주입 받기 때문에 new 연산자를 통해 생성할 필요 없음
		
/*		Map<String , Object> resultMap = userService.selectUserPageList(pageVo);
		
		// 페이지 리스트 
		List<UserVo> userList = (List<UserVo>)resultMap.get("userList");
		
		// 페이지 건수 
		int pageCnt = (int) resultMap.get("pageCnt");
		
		// request 객체에 저장 
		request.setAttribute("pageList", userList);
		request.setAttribute("pageCnt", pageCnt);*/
//		Map<String , Object> resultMap = userService.selectUserPageList(pageVo);
//		model.addAllAttributes(resultMap);
		
		/*// forward (userAllList.jsp --> userPagingList.jsp)
		RequestDispatcher rd = request.getRequestDispatcher("/user/userPagingList.jsp");
		rd.forward(request, response);*/
		return "userPagingList";
	}
	
	@RequestMapping("/userDetail")
	public String userDetail(@RequestParam("userId")String userId,  Model model) {
		/*
		 * String userId = request.getParameter("userId");
		 * @RequestParam 을 통해 설정 
		 */
		UserVo userInfo = userService.selectUser(userId);
		model.addAttribute("userInfo", userInfo);
		return "userDetail";
	}
	
	@RequestMapping(value="/userForm", method= RequestMethod.GET)
	public String userFormView() {
		return "user/userForm";
	}
	
	@RequestMapping(value="/userForm", method= RequestMethod.POST)
	public String userForm(@RequestPart("profilePic")MultipartFile part, HttpServletRequest request, UserVo userVo) throws IllegalStateException, IOException {
	
		if(part.getSize() > 0) {
			String path = request.getServletContext().getRealPath("/profile");
			String fileName = part.getOriginalFilename();
			userVo.setProfile("/profile/"+ fileName);
			part.transferTo(new File(path + File.separator + fileName));
		} else {
			userVo.setProfile("");
		}
		
		int insertCnt = userService.insertUser(userVo);
		return "redirect:user/userPageList?page=1&pageSize=10";
	}
	
	@RequestMapping(value="/userFormUpdate", method=RequestMethod.GET) 
	public String userFormmUpdate(@RequestParam("userId")String userId, UserVo userVo, Model model) {
		userVo = userService.selectUser(userId);
		model.addAttribute("userVo",userVo);
		return "userFormUpdate";
	}
	
	@RequestMapping(value="/userFormUpdate", method=RequestMethod.POST) 
	public String userFormmUpdate(UserVo userVo, Model model, @RequestPart("profilePic")MultipartFile part, HttpServletRequest request) throws IllegalStateException, IOException {
		if(part.getSize() > 0) {
			String path = request.getServletContext().getRealPath("/profile");
			String fileName = part.getOriginalFilename();
			part.transferTo(new File(path + File.separator + fileName));
			userVo.setProfile("/profile/"+ fileName);
		} else {
			userVo.setProfile("");
		}
		int resultCnt = userService.updateUser(userVo);
		return "redirect:userDetail?userId="+userVo.getUserId();
	}

	@RequestMapping(value = "/userPageListAjax")
	public String userPageListAjax(Model model, PageVo pageVo) {
		Map<String , Object> resultMap = userService.selectUserPageList(pageVo);
		model.addAllAttributes(resultMap);
		return "jsonView";
	}

    @RequestMapping(value = "/userPageListAjaxHtml")
    public String userPageListAjaxHtml(Model model, PageVo pageVo) {
        Map<String , Object> resultMap = userService.selectUserPageList(pageVo);
        model.addAllAttributes(resultMap);
        return "user/pageListHtml";
    }
    @RequestMapping(value = "/userPageListAjaxPagination")
    public String userPageListAjaxPagination(Model model, PageVo pageVo) {
        Map<String , Object> resultMap = userService.selectUserPageList(pageVo);
        model.addAllAttributes(resultMap);
        return "user/pagination";
    }
}
