
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix dos números i calcula i mostra la suma, resta, multiplicació i
 * divisió
 *
 * @author ProvenSoft
 */
public class Ex02Operacions {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try {
            //llegir de l'usuari els números
            System.out.print("Entra el primer número: ");
            double num1 = lector.nextDouble();
            System.out.print("Entra el segon número: ");
            double num2 = lector.nextDouble();
            //fer les operacions
            double suma = num1 + num2;
            double resta = num1 - num2;
            double producte = num1 * num2;
            double divisio = 0.0;
            if (num2 != 0.0) {
                divisio = num1 / num2;
            }
            //mostrar resultats
            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta);
            System.out.println("producte: " + producte);
            if (num2 != 0.0) {
                System.out.println("divisio: " + divisio);
            } else {
                System.out.println("No es pot dividir perquè el divisor és zero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dades no vàlida");
        }
    }

}
