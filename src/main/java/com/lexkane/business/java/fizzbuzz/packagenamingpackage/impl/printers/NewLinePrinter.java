package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;

public class NewLinePrinter {

	public void printNewLine() {
		NewLineStringReturner myNewLineStringReturner = new NewLineStringReturner();
		String myNewLineString = myNewLineStringReturner.getReturnString();
		System.out.print(myNewLineString);
	}
	
}
