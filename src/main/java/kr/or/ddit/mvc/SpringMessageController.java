package kr.or.ddit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * kr.or.ddit.mvc
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-08 / 오전 11:35
 * @Version :
 */
@Controller
public class SpringMessageController {

    @RequestMapping("/messageView")
    public String messageView() {

        return "msg/view";
    }
}
