package kr.or.ddit.exception.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * kr.or.ddit.exception.web
 * null.java
 * Desc : ExceptionAdvice
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오후 2:04
 * @Version :
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler({ArithmeticException.class})
    public String exceptionHandler() {
        return "error/arithmetic";
    }


}
