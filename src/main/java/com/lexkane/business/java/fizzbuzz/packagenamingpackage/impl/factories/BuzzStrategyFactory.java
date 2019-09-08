package com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.lexkane.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.lexkane.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

public class BuzzStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

	@Override
	public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
		BuzzStrategy myBuzzStrategy = new BuzzStrategy();
		return myBuzzStrategy;
	}

}
