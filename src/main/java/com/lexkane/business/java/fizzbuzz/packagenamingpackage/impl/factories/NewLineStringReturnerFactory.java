package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.NewLineStringReturner;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class NewLineStringReturnerFactory implements
		StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		StringStringReturner myNewLineStringReturner = new NewLineStringReturner();
		return myNewLineStringReturner;
	}

}
