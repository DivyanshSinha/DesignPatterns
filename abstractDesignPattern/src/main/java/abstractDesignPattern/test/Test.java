package abstractDesignPattern.test;

import abstractDesignPattern.company.api.Company;
import abstractDesignPattern.company.impl.ZenithCorporation;
import abstractDesignPattern.monitor.impl.FifteenInch;
import abstractDesignPattern.printer.impl.BlackAndWhitePrinter;
import abstractDesignPattern.speaker.impl.TowerSpeaker;

public class Test {

	public static void main(String[] args) {
		
		Company zenith = new ZenithCorporation(new FifteenInch(), new BlackAndWhitePrinter() ,new TowerSpeaker());
		
		zenith.buildMonitor().build();;
		zenith.buildPrinter().build();;
		zenith.buildSpeaker().build();;
	}

}
