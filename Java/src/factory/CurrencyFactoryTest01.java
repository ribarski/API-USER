package factory;

import factory.currency.Country;
import factory.currency.Currency;
import factory.currency.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency.getSymbol());
    }
}
