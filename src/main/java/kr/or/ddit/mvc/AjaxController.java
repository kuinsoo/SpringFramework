package kr.or.ddit.mvc;


import kr.or.ddit.user.model.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * kr.or.ddit.mvc
 * null.java
 * Desc : Ajax Controller
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-09 / 오전 9:34
 * @Version :
 */
@RequestMapping("/ajax")
@Controller
public class AjaxController {

    private Logger logger = LoggerFactory.getLogger(AjaxController.class);

    @RequestMapping("/view")
    public String view() {
        return "ajax/view";
    }

    @ResponseBody
    @RequestMapping(value = "/getRangers", produces= {"application/json"})
    public List<UserVo> getRangers(@RequestBody UserVo userVo) {
        logger.debug("json {}",userVo);

        List<UserVo> rangers = new ArrayList<>();
        rangers.add(new UserVo("brown","브라운"));
        rangers.add(new UserVo("cony","코니"));
        rangers.add(new UserVo("sally","샐리"));
        return rangers;
    }
}
