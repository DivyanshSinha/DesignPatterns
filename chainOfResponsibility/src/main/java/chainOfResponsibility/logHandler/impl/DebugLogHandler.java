package chainOfResponsibility.logHandler.impl;

import chainOfResponsibility.logHandler.api.LogHandler;

public class DebugLogHandler extends LogHandler{

	public DebugLogHandler(LogHandler logHandler) {
		super(logHandler);
	}
	
	public void handleLogRequest(int logHandlerLevel,String log)
	{
		if(logHandlerLevel==LogHandler.DEBUG)
		{
			System.out.println("DEBUG : "+log);
		}
		else
		{
			super.handleLogRequest(logHandlerLevel, log);
		}
	}

}
