package kr.or.ddit.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * kr.or.ddit.intercepter
 * null.java
 * Desc : 퍼포먼스 시간을 체크해주는 클래스
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오후 2:58
 * @Version :
 */
public class PerformanceCheckInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(PerformanceCheckInterceptor.class);
    /* 전처리 */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("start_time", System.currentTimeMillis());

        // 다음 인터셉터로 이동
        return true;
    }

    /* 후처리 */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


        // controll 메소드의 로직이 종료되고 실행
        long end_time = System.currentTimeMillis();
        long start_time = (Long) request.getAttribute("start_time");

        logger.debug("duration {} : {}",request.getRequestURI(), (end_time-start_time));

    }
}
