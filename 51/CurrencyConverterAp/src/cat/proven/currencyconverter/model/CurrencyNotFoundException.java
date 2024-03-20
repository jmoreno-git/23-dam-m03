package cat.proven.currencyconverter.model;

/**
 * Exception thrown when a currency is not found
 * @author ProvenSoft
 */
public class CurrencyNotFoundException extends Exception {

    public CurrencyNotFoundException(String message) {
        super(message);
    }
    
}
