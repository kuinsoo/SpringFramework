package kr.or.ddit.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTask {
	private Logger logger = LoggerFactory.getLogger(LogTask.class);
	
	public void logging() {
		logger.debug("LogTask.logging() ");
	}
}
