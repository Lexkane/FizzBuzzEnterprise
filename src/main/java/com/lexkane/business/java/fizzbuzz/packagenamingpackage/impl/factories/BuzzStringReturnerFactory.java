package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class BuzzStringReturnerFactory implements StringStringReturnerFactory {

	@Override
	public StringStringReturner createStringStringReturner() {
		BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner();
		return myBuzzStringReturner;
	}

}
