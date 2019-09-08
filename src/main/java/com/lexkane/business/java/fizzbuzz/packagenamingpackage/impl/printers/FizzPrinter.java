package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;

public class FizzPrinter {

	public void printFizz() {
		FizzStringReturner myFizzStringReturner = new FizzStringReturner();
		System.out.print(myFizzStringReturner.getReturnString());
	}

}
