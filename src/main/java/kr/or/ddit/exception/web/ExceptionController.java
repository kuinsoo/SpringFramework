package kr.or.ddit.exception.web;

import kr.or.ddit.exception.NoFileException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * kr.or.ddit.exception.web
 * null.java
 * Desc : 예외처리 컨트롤러
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오후 1:54
 * @Version :
 */
@Controller
public class ExceptionController {

    /**
     * View string.
     *  예외를 강제로 방생시키는 url
     *  http://localhost:8081/exception
     * @return the string
     */
    @RequestMapping("/exception")
    public String view() {
        throw new ArithmeticException();
    }


    // response status 테스트를 위한 url
    @RequestMapping("/responseStatus")
    public String responseStatus() throws NoFileException {
        ClassPathResource resource = new ClassPathResource("kr/or/ddit/config/db/mybatis-config.xnl");
        try {
            resource.getInputStream();
        } catch (IOException e) {
            throw new NoFileException();
        }
        return "error/arithmetic";
    }


}
