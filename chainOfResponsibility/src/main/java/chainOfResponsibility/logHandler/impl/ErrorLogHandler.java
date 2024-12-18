package chainOfResponsibility.logHandler.impl;

import chainOfResponsibility.logHandler.api.LogHandler;

public class ErrorLogHandler extends LogHandler{

	public ErrorLogHandler(LogHandler logHandler) {
		super(logHandler);
	}
	
	
	public void handleLogRequest(int logHandlerLevel,String log)
	{
		if(logHandlerLevel==LogHandler.ERROR)
		{
			System.out.println("ERROR : "+log);
		}
		else
		{
			super.handleLogRequest(logHandlerLevel, log);
		}
	}
}
