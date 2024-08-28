package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.FizzyBuzzyStringPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers.BuzzStringPrinter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.StringPrinterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.printers.StringPrinter;

/**
 * Factory for FizzyBuzzyStringPrinter
 */
@Service
public class FizzyBuzzyStringPrinterFactory implements StringPrinterFactory {

    private final FizzyBuzzyStringPrinter _fizzybuzzyStringPrinter;

    /**
     * @param _fizzybuzzyStringPrinter FizzyBuzzyStringPrinter
     */
    @Autowired
    public FizzyBuzzyStringPrinterFactory(final FizzyBuzzyStringPrinter _fizzybuzzyStringPrinter) {
        super();
        this._fizzybuzzyStringPrinter = _fizzybuzzyStringPrinter;
    }

    /**
     * @return StringPrinter
     */
    @Override
    public StringPrinter createStringPrinter() {
        return this._fizzybuzzyStringPrinter;
    }

}
