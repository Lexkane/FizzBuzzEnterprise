package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringPrinter implements StringPrinter {

	public void print() {
		StringStringReturnerFactory myFizzStringReturnerFactory = new FizzStringReturnerFactory();
		StringStringReturner myFizzStringReturner = myFizzStringReturnerFactory.createStringStringReturner();
		System.out.print(myFizzStringReturner.getReturnString());
	}

}
