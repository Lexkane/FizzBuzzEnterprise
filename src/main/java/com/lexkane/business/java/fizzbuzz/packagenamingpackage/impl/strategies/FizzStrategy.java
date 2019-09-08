package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.FizzStrategyConstants;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

public class FizzStrategy implements IsEvenlyDivisibleStrategy {
	public boolean isEvenlyDivisible(int i) {
		if (NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(i, FizzStrategyConstants.FIZZ_INTEGER_CONSTANT_VALUE)) {
			return true;
		} else {
			return false;
		}
	}
}
