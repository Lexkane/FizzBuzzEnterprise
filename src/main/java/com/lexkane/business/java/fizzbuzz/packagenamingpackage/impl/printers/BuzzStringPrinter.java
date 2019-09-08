package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringPrinter implements StringPrinter {
	public void print() {
		StringStringReturnerFactory myBuzzStringReturnerFactory = new BuzzStringReturnerFactory();
		StringStringReturner myBuzzStringReturner = myBuzzStringReturnerFactory.createStringStringReturner();
		System.out.print(myBuzzStringReturner.getReturnString());
	}
}
