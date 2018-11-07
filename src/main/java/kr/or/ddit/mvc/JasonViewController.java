package kr.or.ddit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * kr.or.ddit.mvc
 * null.java
 * Desc : 제이슨 뷰
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오후 4:14
 * @Version :
 */
@Controller
public class JasonViewController {

    //json 응답을 생성하는 url 요청
    // 레인저스 저옵를 json 으로 응답을 생성
    @RequestMapping("/rangersJasonView")
    public String jasonView(Model model) {

        // 만약 String 으로 넘겨줄때 "{rangers : [{name:'cony', id : 'rabbit'}, ...

        //컬렉션 object 정보를 json 문자열로 생성
        List<String> rangers = new ArrayList<>();
        rangers.add("brown");
        rangers.add("cony");
        rangers.add("edword");

        model.addAttribute("rangers", rangers);

        //json을 생성하는 view
        return "";
    }
}
