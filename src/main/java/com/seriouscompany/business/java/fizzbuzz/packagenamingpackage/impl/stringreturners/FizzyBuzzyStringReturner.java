package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
/**
 * Returner for FizzyBuzzyString
 */
@Service
public class FizzyBuzzyStringReturner implements StringStringReturner {

    /**
     * @return String
     */
    public String getReturnString() {
        final StringBuilder myStringBuilder = new StringBuilder(
                Constants.FIZZY_BUZZY);
        final String myString = myStringBuilder.toString();
        final char[] myCharacters = myString.toCharArray();
        return new String(myCharacters, 0, myCharacters.length);
    }

}
