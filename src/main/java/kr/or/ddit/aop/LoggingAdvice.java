package kr.or.ddit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * kr.or.ddit.aop
 * null.java
 * Desc : 공통의 관심사 (메소드 호출 로깅)를 담당하는 Advice
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-09 / 오전 11:08
 * @Version :
 */

public class LoggingAdvice {
    Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);
    /* 우리가 구현하는 비지니스 로직이 싱행되기 전에 실행되는 공통 로직 */
    public void beforeAdvice(JoinPoint joinPoint) {
        //joinPoint : 개발자가 구현한 로직 메소드
        //beforeAdvice 가 먼저 호출되고 joinPoint 호출
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();

        logger.debug("methodName: {}", methodName);
        logger.debug("className: {}", className);
        logger.debug("구인수: {}");
    }

    public void afterAdvice(JoinPoint joinPoint) {

    }
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        //실제 비지니스 메서드 실행전
        long startTime = System.currentTimeMillis();

        //실제 비지니스 메소드 호출
        Object[] args = joinPoint.getArgs(); //비지니스 메서드 메게변수
        Object  object = joinPoint.proceed(args); // 비지니스 메서드 실행
        //실제 비지니스 메소드 실행후
        long endTime = System.currentTimeMillis();

        logger.debug("duration : {} ", endTime-startTime);

        return object;

    }
}
