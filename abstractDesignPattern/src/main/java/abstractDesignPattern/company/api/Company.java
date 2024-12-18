package abstractDesignPattern.company.api;

import abstractDesignPattern.components.api.Monitor;
import abstractDesignPattern.components.api.Printer;
import abstractDesignPattern.components.api.Speaker;

public interface Company {
	
	Monitor buildMonitor();
	
	Printer buildPrinter();
	
	Speaker buildSpeaker();
	
}
