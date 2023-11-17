package recursivitat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex07Interes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Entra capital inicial: ");
            double capitalInicial = in.nextDouble();
            System.out.print("Entra tasa nominal anual d'interès: ");
            double tasaNominalInteres = in.nextDouble();
            System.out.print("Entra el nombre d'anys: ");
            int anys = in.nextInt();
            double capitalFinal = capitalFinal(capitalInicial, tasaNominalInteres, anys);
            String missatge = String.format(
                    """
                    capital inicial: %.2f
                    tasa anual nominal interès: %.2f
                    anys: %d
                    capital final: %.2f
                    """,
                    capitalInicial, 
                    tasaNominalInteres, 
                    anys, 
                    capitalFinal
            );
            System.out.println(missatge);
        } catch (InputMismatchException e) {
            System.out.println("Has d'introduir un número enter");
        }
    }

    private static double capitalFinal(double capital, double tasa, int temps) {
        double result = 0.0;
        if (temps == 0) {
            result = capital;
        } else {
            double interes = capital *tasa/100.0;
            result = capitalFinal(capital+interes, tasa, temps-1);
        }
        return result;
    }

}
