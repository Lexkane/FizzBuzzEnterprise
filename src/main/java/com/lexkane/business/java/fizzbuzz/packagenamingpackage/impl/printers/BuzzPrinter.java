package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;

public class BuzzPrinter {
	public void printBuzz() {
		BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner();
		System.out.print(myBuzzStringReturner.getReturnString());
	}
}
