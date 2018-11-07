package kr.or.ddit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * kr.or.ddit.exception.web
 * null.java
 * Desc : 예외가 발생했을때 위치를 지정해줄 수 있다.
 *
 * @Author : Mr.KKu
 * @Date : 2018-11-07 / 오후 2:35
 * @Version :
 */
// NoFileException이 발생할 경우 HTTP 응답모드를 서버 내부에러인 500이 아니라
    // 404 (not found) 응답코드로 대체
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoFileException  extends  Exception{

}
