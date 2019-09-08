package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers.IntegerIntegerPrinter;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerPrinterFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.IntegerPrinter;

public class IntIntegerPrinterFactory implements IntegerPrinterFactory {

	@Override
	public IntegerPrinter createPrinter() {
		IntegerIntegerPrinter myIntIntegerPrinter = new IntegerIntegerPrinter();
		return myIntIntegerPrinter;
	}

}
