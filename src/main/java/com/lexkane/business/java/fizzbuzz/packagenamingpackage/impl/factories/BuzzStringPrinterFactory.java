package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

public class BuzzStringPrinterFactory implements StringPrinterFactory {

	@Override
	public StringPrinter createStringPrinter() {
		StringPrinter myBuzzStringPrinter = new BuzzStringPrinter();
		return myBuzzStringPrinter;
	}

}
