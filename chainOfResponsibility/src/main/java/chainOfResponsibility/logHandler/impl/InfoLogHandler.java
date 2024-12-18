package chainOfResponsibility.logHandler.impl;

import chainOfResponsibility.logHandler.api.LogHandler;

public class InfoLogHandler extends LogHandler{

	public InfoLogHandler(LogHandler logHandler) {
		super(logHandler);
	}
	
	public void handleLogRequest(int logHandlerLevel,String log)
	{
		if(logHandlerLevel==LogHandler.INFO)
		{
			System.out.println("INFO : "+log);
		}
		else
		{
			super.handleLogRequest(logHandlerLevel, log);
		}
	}
	
}
