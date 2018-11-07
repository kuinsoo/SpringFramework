package kr.or.ddit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

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

    @ModelAttribute
    public void modelAttribute(Model model) {
        List<String> rangers = new ArrayList<>();
        rangers.add("brown");
        rangers.add("cony");
        rangers.add("edword");
        model.addAttribute("rangers", rangers);
    }

    //json 응답을 생성하는 url 요청
    // 레인저스 저옵를 json 으로 응답을 생성
    @RequestMapping("/rangersJsonView")
    public String jsonView() {

        // 만약 String 으로 넘겨줄때 "{rangers : [{name:'cony', id : 'rabbit'}, ...

        //컬렉션 object 정보를 json 문자열로 생성
//        List<String> rangers = new ArrayList<>();
//        rangers.add("brown");
//        rangers.add("cony");
//        rangers.add("edword");
        // "{"rangers":["brown","cony","edword"]}"

//        model.addAttribute("rangers", rangers);

        //json을 생성하는 view
        return "jsonView";

        //<bean id="jsonView" class="org.springframework.web.servlet.view.json.MappingJackson2JsonView"/>

        //controller 에서 리턴하는 viewName(jsonView)를 처리하기 위해
        // 처리해줄 viewResolver를 우선순위에 따라서
        // 1. beanNameViewResolver 를 통해 view를 생성하려고 시도하게 된다.
        // 2. jsonView라고 하는 이름의 빈이 있는지 확인 ==> 존재
        // 3. 해당 viewName 과 동일한 이름의 빈이 있으므로
        // internalResourceViewResolver까지 가지 않고 beanNameViewResolver 에서 처리하게 된다.

        /* 만약 viewName 이 "hello" 인 경우라면
        *   처리해줄 viewResolver를 우선순위에 따라서
        *   1. beanNameViewResolver 를 통해 view를 생성하려고 시도하게된다.
        *   2.jsonView 라고 하는 이름의 빈이 있는지를 확인 ==> 존재하지 않음
        *   3. 다음 우선순위인 internalResourceViewResolver가 처리하게된다
        *   internalResourceViewResolver는 해당 리소스(hello.jsp)가 있는지 여부를 상관하지않고
        *   prefix, suffix를 무조건 반영하여 forward 그렇게 때문에 오타, 혹은 존재하지 않는 파일(jsp) 을
         *   리텅하게 되면서 에러가 발생한다.
         *   그런 이유로 internalResourceViewResolver는 viewResolver설정시 우선순위를 최하위로 둔다.*/
    }

    @RequestMapping("/rangersJsonViewObj")
    public View rangersJsonView() {
        // json생성을 담당하는 view
        return new MappingJackson2JsonView();
    }
}
