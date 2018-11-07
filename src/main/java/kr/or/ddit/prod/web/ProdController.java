package kr.or.ddit.prod.web;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.prodService.ProdServiceInf;
import kr.or.ddit.util.model.PageVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * kr.or.ddit.prod.web
 * null.java
 * Desc : Prod Controller
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오전 9:12
 * @Version :
 */
@Controller
@RequestMapping("/prod")
public class ProdController {
	private Logger logger = LoggerFactory.getLogger(ProdVo.class);

	@Resource(name = "prodService")
	private ProdServiceInf prodeService;

	@RequestMapping("/prodList")
	public String prodList(@RequestParam("page")String page, @RequestParam("pageSize")String pageSize, Model model) {

		PageVo pageVo = new PageVo();
		pageVo.setPage(Integer.parseInt(page));
		pageVo.setPageSize(Integer.parseInt(pageSize));

		Map<String , Object> resultMap = prodeService.selectProdPageList(pageVo);

		// 페이지 리스트
		List<ProdVo> prodPageList = (List<ProdVo>)resultMap.get("prodPageList");

		// 페이지 건수
		int pageCnt = (int) resultMap.get("prodPageCnt");

		model.addAttribute("prodPageList", prodPageList);
		model.addAttribute("pageCnt",pageCnt);

		return "prod/prodList";
	}

	@RequestMapping("/prodDetail")
	public String prodDetail(@RequestParam("prodId")String prodId, Model model) {
		ProdVo prodVo = prodeService.selectProd(prodId);

		model.addAttribute("prodVo", prodVo);

		return "prod/prodDetail";
	}
}
