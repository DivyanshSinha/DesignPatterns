package chainOfResponsibility.logHandler.api;

public class LogHandler {
	
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	
	private LogHandler nextLogHandler;
	
	public LogHandler(LogHandler logHandler)
	{
		this.nextLogHandler=logHandler;
	}
	
	public void handleLogRequest(int logHandlerLevel,String log)
	{
		if(nextLogHandler!=null)
			nextLogHandler.handleLogRequest(logHandlerLevel, log);
		else
			System.out.println("Invalid log level !!!");
	}

}
