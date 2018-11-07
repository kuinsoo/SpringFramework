package kr.or.ddit.mvc;

import kr.or.ddit.mvc.view.TimesTablesView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

/**
 * kr.or.ddit.mvc
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오후 4:55
 * @Version :
 */
@Controller
public class CustomViewController {
    @RequestMapping("/customView")
    public View customView() {
        return new TimesTablesView();
    }

    @RequestMapping("/customViewBeanName")
    public String customViewbean(@RequestParam("tables")String tables, Model model) {
        model.addAttribute("tables",tables);
        return "timesTablesView";

    }
}
