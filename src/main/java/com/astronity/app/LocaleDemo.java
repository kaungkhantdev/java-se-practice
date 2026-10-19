package com.astronity.app;

import java.util.Currency;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Current Locale : " + locale);
        System.out.println("Display name : " + locale.getDisplayName());
        System.out.println("Display country : " + locale.getDisplayCountry());

        Currency currency = Currency.getInstance(locale);
        System.out.println("Current Currency : " + currency);
        System.out.println("Display currency : " + currency.getDisplayName());
        System.out.println("Display currency code : " + currency.getCurrencyCode());

        System.out.println("Default Fraction Digit : " + currency.getDefaultFractionDigits());
    }
}
