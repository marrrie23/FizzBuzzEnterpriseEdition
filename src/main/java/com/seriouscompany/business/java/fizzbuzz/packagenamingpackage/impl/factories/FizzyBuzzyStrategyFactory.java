package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.FizzyBuzzyStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.BuzzStrategy;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.IsEvenlyDivisibleStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.IsEvenlyDivisibleStrategy;

/**
 * Factory for FizzyBuzzyStrategy
 */
@Service
public class FizzyBuzzyStrategyFactory implements IsEvenlyDivisibleStrategyFactory {

    private final FizzyBuzzyStrategy _fizzybuzzyStrategy;

    /**
     * @param _fizzybuzzyStrategy BuzzStrategy
     */
    @Autowired
    public FizzyBuzzyStrategyFactory(final FizzyBuzzyStrategy _fizzybuzzyStrategy) {
        super();
        this._fizzybuzzyStrategy = _fizzybuzzyStrategy;
    }

    /**
     * @return void
     */
    @Override
    public IsEvenlyDivisibleStrategy createIsEvenlyDivisibleStrategy() {
        return this._fizzybuzzyStrategy;
    }

}
