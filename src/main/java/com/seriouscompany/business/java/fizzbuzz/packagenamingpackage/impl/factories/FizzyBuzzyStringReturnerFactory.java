package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzyBuzzyStringReturner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.FizzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Factory for FizzyBuzzyStringReturner
 */
@Service
public class FizzyBuzzyStringReturnerFactory implements StringStringReturnerFactory {

    private final FizzyBuzzyStringReturner _fizzybuzzyStringReturner;

    /**
     * @param _fizzybuzzyStringReturner FizzyBuzzyStringReturner
     */
    @Autowired
    public FizzyBuzzyStringReturnerFactory(final FizzyBuzzyStringReturner _fizzybuzzyStringReturner) {
        super();
        this._fizzybuzzyStringReturner = _fizzybuzzyStringReturner;
    }

    /**
     * @return StringStringReturner
     */
    @Override
    public StringStringReturner createStringStringReturner() {
        return this._fizzybuzzyStringReturner;
    }

}
