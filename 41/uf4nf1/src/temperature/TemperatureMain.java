
package temperature;

/**
 *
 * @author ProvenSoft
 */
public class TemperatureMain {

    public static void main(String[] args) {
        //Temperature temp = new Temperature();
        double tC = 25.0;
        //double tF = temp.celsiusToFahrenheit(tC);
        double tF = Temperature.celsiusToFahrenheit(tC);
        System.out.format("%.2f celsius are %.2f fahrenheit%n",
                tC, tF);
    }
    
}
