
package temperature;

/**
 *
 * @author ProvenSoft
 */
public class Temperature {
    /**
     * converts temperature t in Celsius to Fahrenheit degrees
     * @param t the temperature in Celsius degrees
     * @return temperature in Fahrenheit degrees
     */
    public static double celsiusToFahrenheit(double t) {
        return ( (9.0/5.0) * t + 32.0  );
    }
}
