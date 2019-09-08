package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

public class FizzStringReturner implements StringStringReturner {

	public String getReturnString() {
		StringBuilder myStringBuilder = new StringBuilder("Fizz");
		String myString = myStringBuilder.toString();
		return new String(myString);
	}

}
