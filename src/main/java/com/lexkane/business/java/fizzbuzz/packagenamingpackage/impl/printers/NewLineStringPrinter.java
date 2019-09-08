package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories.NewLineStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringPrinter implements StringPrinter {

	public void print() {
		StringStringReturnerFactory myNewLineStringReturnerFactory = new NewLineStringReturnerFactory();
		StringStringReturner myNewLineStringReturner = myNewLineStringReturnerFactory.createStringStringReturner();
		String myNewLineString = myNewLineStringReturner.getReturnString();
		System.out.print(myNewLineString);
	}
	
}
