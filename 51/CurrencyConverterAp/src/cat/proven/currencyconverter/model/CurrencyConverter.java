package cat.proven.currencyconverter.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Stores currency changes and performs conversions
 * @author ProvenSoft
 */
public class CurrencyConverter {
    /**
     * map containing al currencies and changes (related to EUR)
     */
    private final Map<String, Double> changes;

    public CurrencyConverter() {
        changes = new HashMap<>();
        loadCurrencies();
    }

    /**
     * gets all currency names
     * @return a Set with all currency names
     */
    public Set<String> getCurrencies() {
        return changes.keySet();
    }
    
    /**
     * gets value (change) of given currency
     * @param currency the currency name to search
     * @return the value of the change of that currency
     * @throws CurrencyNotFoundException if currency not found
     */
    public Double getCurrencyChange(String currency) throws CurrencyNotFoundException {
        return 0.0; //TODO
    }
    
    /**
     * calculates value of change from 'cSource' currency to 'cTarget'
     * @param cSource the source currency
     * @param cTarget the target currency 
     * @param value the amount in 'cSource' currency to change
     * @return the calculated change
     * @throws CurrencyNotFoundException if some currency is not found
     */
    public Double change(String cSource, String cTarget, Double value) 
            throws CurrencyNotFoundException {
        Double result = 0.0;
        //TODO
        return result;
    }
    
    /**
     * adds a new currency and its value to the map
     * @param name the name of the currency
     * @param value the value of the currency
     * @return true if successfully added, false otherwise
     */
    public boolean addCurrency(String name, Double value) {
        return false;
    }
    
    /**
     * modifies a currency value
     * @param name the name of the currency
     * @param value the value of the currency
     * @return true if successfully modified, false otherwise
     * @throws CurrencyNotFoundException if currency name is not found
     */
    public boolean modifyCurrency(String name, Double value) 
            throws CurrencyNotFoundException {
        return false;
    }

    /**
     * removes a currency and its value from the map
     * @param name the name of the currency
     * @return true if successfully removed, false otherwise
     * @throws CurrencyNotFoundException if currency name is not found
     */
    public boolean removeCurrency(String name)
            throws CurrencyNotFoundException {
        return false;
    }    
    
    /**
     * generate currency changes
     */
    private void loadCurrencies() {
        changes.put("EUR", 1.0);
        changes.put("USD", 0.91);
        changes.put("GBP", 0.85);
        //TODO add more currencies
    }
    
}
