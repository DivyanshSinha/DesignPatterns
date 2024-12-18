package abstractDesignPattern.printer.impl;

import abstractDesignPattern.components.api.Printer;

public class ColouredPrinter implements Printer{

	@Override
	public void build() {
		System.out.println("This is a coloured printer");
	}

}
