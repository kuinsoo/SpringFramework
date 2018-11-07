package kr.or.ddit.exception.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @ExceptionHandler({ArithmeticException.class})
    public String exceptionHandler() {
        return "error/arithmetic";
    }
}
