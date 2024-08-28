package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.NoFizzNoBuzzStrategyConstants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

/**
 * Strategy for NoFizzNoBuzz
 */
@Service
public class NoFizzNoBuzzStrategy implements IsEvenlyDivisibleStrategy {

	/**
	 * @param theInteger int
	 * @return boolean
	 */
	public boolean isEvenlyDivisible(final int theInteger) {
		boolean isMultipleOfNoFizz = NumberIsMultipleOfAnotherNumberVerifier
				.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_FIZZ_INTEGER_CONSTANT_VALUE);
		boolean isMultipleOfNoBuzz = NumberIsMultipleOfAnotherNumberVerifier
				.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_BUZZ_INTEGER_CONSTANT_VALUE);
		boolean isMultipleOfNoFizzyBuzzy = NumberIsMultipleOfAnotherNumberVerifier
				.numberIsMultipleOfAnotherNumber(theInteger, NoFizzNoBuzzStrategyConstants.NO_FIZZY_BUZZY_INTEGER_CONSTANT_VALUE);

		return !isMultipleOfNoFizzyBuzzy && !isMultipleOfNoFizz && !isMultipleOfNoBuzz;
	}
}
