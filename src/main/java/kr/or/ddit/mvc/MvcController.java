package kr.or.ddit.mvc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.file.service.FileServiceInf;
import kr.or.ddit.file.util.FileUtil;

@Controller
@SessionAttributes("rangers")
public class MvcController {

	@Resource(name="fileService")
	private FileServiceInf fileService; 
	
	private Logger logger = LoggerFactory.getLogger(MvcController.class);
	/* @RequestMapping이 붙은 메소드가 실행되기 전에 멀저 실행된다.
	 * 해당 컨트롤러에서 공통적으로 사용될 속성이 있을경우 
	 * 중복을 피하기 위해 @ModelAttribute 어노테이션을 적용한 
	 * 메소드를 통해 코드 중복을 막을 수 있다.
	 */	
	@ModelAttribute(value="rangers")
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
	
	/*@PathVariable : 요청 url의 일부를 메소드 인자로 쉽게 받을 수 있는 어노테이션
	 *  http://localhost:8081/mvc/central : logger central
	 *  http://localhost:8081/mvc/left : logger left
	 * */
	@RequestMapping("/mvc/{libcd}/test")
	public String pathvariable(@PathVariable("libcd") String libcd) {
		logger.debug("libcd {}", libcd);
		return "mvc/view";
	}
	
	//fileUpLoad 테스트를 위한 view (get)
	@RequestMapping(value="mvc/fileupload", method= {RequestMethod.GET})
	public String fileuploadView() {
		
		return "mvc/fileuploadView";
	}
	
	//fileUpLoad (파일전송)을 처리하기 위한 controller method(post)
	@RequestMapping(value="mvc/fileupload", method= {RequestMethod.POST})
	public String fileupload(@RequestPart("uploadFile") MultipartFile part, @RequestParam("userId") String userId) {
		
		logger.debug("requestParam userId : {}", userId);
		logger.debug("Part getSize : {}", part.getName());
		logger.debug("Part getSize : {}", part.getSize() );
		logger.debug("Part getOriginalFilename : {}", part.getOriginalFilename());
		
		//1. File객체 생성 (경로 + 파일명 ==> 파일명 출돌 방지를 위해 유니크 한 임의의 파일명을 생성)
		String path = "D:\\T_Development\\d_Study\\Spring\\upload";
		String fileName = UUID.randomUUID().toString();
		String fileExt = FileUtil.fileExt(part.getOriginalFilename());
		String originnameFileName = part.getOriginalFilename();
		File file = new File(path+File.separator + fileName + fileExt);
		FileVo fileVo = new FileVo();
		fileVo.setFile_name(fileName);
		fileVo.setFile_path(path);
		fileVo.setOrg_file_name(originnameFileName);
		fileVo.setFile_ext(fileExt);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("fileUtil",fileVo);
		//FileUtil.getFileExt(String fileName);
		//확장자가 있을 경우 .을 포함한 확장자 값을 리턴
		//확장자가 없을 경우 "" whitespace를 리턴
		// 테스트값 : sally.png ==> .png
		// 테스트값 : sallu ==> ""
//		fileVo.setFile_ext();
		
		try {
			//null  값이 들어올때 처리 
			if(part.getSize() > 0)
				part.transferTo(file);
			
			
			//데이터 베이스에 첨부파일 정보 저장
			//1. fileServe
			//2. 로직호출
			int resultCnt = fileService.insertFile(fileVo);
			logger.debug("{}", resultCnt);
			
		} catch (Exception e) {
		}
		
		return "mvc/fileuploadView";
	}
}
