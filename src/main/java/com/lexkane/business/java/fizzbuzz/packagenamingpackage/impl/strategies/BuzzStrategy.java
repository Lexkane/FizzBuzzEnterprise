package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.BuzzStrategyConstants;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

public class BuzzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int i) {
		if (NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(i, BuzzStrategyConstants.BUZZ_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}
}
