package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.FizzyBuzzyStringReturnerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.BuzzStringReturnerFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Printer for FizzyBuzzyString
 */
@Service
public class FizzyBuzzyStringPrinter implements StringPrinter {

    private final SystemOutFizzBuzzOutputStrategyFactory _outputStrategyFactory;

    private final FizzyBuzzyStringReturnerFactory _fizzybuzzyStringReturnerFactory;

    /**
     * @param _fizzybuzzyStringReturnerFactory
     * @param _fizzybuzzyoutputStrategyFactory
     */
    @Autowired
    public FizzyBuzzyStringPrinter(final FizzyBuzzyStringReturnerFactory _fizzybuzzyStringReturnerFactory,
                             final SystemOutFizzBuzzOutputStrategyFactory _fizzybuzzyoutputStrategyFactory) {
        super();
        this._fizzybuzzyStringReturnerFactory = _fizzybuzzyStringReturnerFactory;
        this._outputStrategyFactory = _fizzybuzzyoutputStrategyFactory;
    }

    /**
     * @return void
     */
    public void print() {
        final StringStringReturner myFizzyBuzzyStringReturner = this._fizzybuzzyStringReturnerFactory
                .createStringStringReturner();
        final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
                new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
                        this._outputStrategyFactory.createOutputStrategy());

        myOutputAdapter.output(myFizzyBuzzyStringReturner.getReturnString());
    }

    /**
     * @param value
     * @return
     */
    @Override
    public void printValue(final Object value) {
        this.print();
    }

}
