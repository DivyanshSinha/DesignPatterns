package abstractDesignPattern.company.impl;

import abstractDesignPattern.company.api.Company;
import abstractDesignPattern.components.api.Monitor;
import abstractDesignPattern.components.api.Printer;
import abstractDesignPattern.components.api.Speaker;

public class ZenithCorporation implements Company{
	
	
	private Monitor monitor;
	private Printer printer;
	private Speaker speaker;
	
	public ZenithCorporation(Monitor monitor, Printer printer, Speaker speaker) {
		super();
		this.monitor = monitor;
		this.printer = printer;
		this.speaker = speaker;
	}

	@Override
	public Monitor buildMonitor() {
		return monitor;
	}

	@Override
	public Printer buildPrinter() {
		return printer;
	}

	@Override
	public Speaker buildSpeaker() {
		return speaker;
	}

}
