package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.constants.FizzyBuzzyStrategyConstants;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;

/**
 * Strategy for FizzyBuzzy
 */
@Service
public class FizzyBuzzyStrategy implements IsEvenlyDivisibleStrategy {

    /**
     * @param theInteger int
     * @return boolean
     */
    public boolean isEvenlyDivisible(final int theInteger) {
        if (NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(theInteger,
                FizzyBuzzyStrategyConstants.FIZZY_BUZZY_INTEGER_CONSTANT_VALUE)) {
            return true;
        } else {
            return false;
        }
    }

}
