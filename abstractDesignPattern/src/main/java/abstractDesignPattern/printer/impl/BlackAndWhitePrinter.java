package abstractDesignPattern.printer.impl;

import abstractDesignPattern.components.api.Printer;

public class BlackAndWhitePrinter implements Printer{

	@Override
	public void build() {
		System.out.println("This is a black and white printer");
	}

}
