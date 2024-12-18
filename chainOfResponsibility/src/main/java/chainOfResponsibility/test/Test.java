package chainOfResponsibility.test;

import chainOfResponsibility.logHandler.api.LogHandler;
import chainOfResponsibility.logHandler.impl.DebugLogHandler;
import chainOfResponsibility.logHandler.impl.ErrorLogHandler;
import chainOfResponsibility.logHandler.impl.InfoLogHandler;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler logger = new InfoLogHandler(new DebugLogHandler(new ErrorLogHandler(null)));
		
		logger.handleLogRequest(1, "This is info level log");
		logger.handleLogRequest(2, "This is debug level log");
		logger.handleLogRequest(3, "This is error level log");
		logger.handleLogRequest(52, "This is invalid level log");
	}

}
