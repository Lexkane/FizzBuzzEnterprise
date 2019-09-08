package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.IntegerIntegerStringReturner;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IntegerStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.IntegerStringReturner;

public class IntegerIntegerStringReturnerFactory implements
		IntegerStringReturnerFactory {

	@Override
	public IntegerStringReturner createIntegerStringReturner() {
		IntegerIntegerStringReturner myIntegerIntegerStringReturner = new IntegerIntegerStringReturner();
		return myIntegerIntegerStringReturner;
	}

}
