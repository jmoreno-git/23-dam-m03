
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex11Pagament {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir de l'usuari els números
        System.out.print("Entra el preu: ");
        double preu = lector.nextDouble();
        System.out.print("Entra la quantitat pagada: ");
        double pagat = lector.nextDouble();
        //validar dades
        boolean dadesValides = true;
        if (preu < 0.0) {
            dadesValides = false;
        }
        if (pagat < 0.0) {
            dadesValides = false;
        }
        if (dadesValides) {
            //calcular diferència
            double diferencia = pagat - preu;
            //mostrar sobra o falta
            if (diferencia == 0.0) {
                System.out.println("Pagament exacte");
            } else {
                if (diferencia > 0.0) {
                    System.out.format("Sobren %.2f euros\n", diferencia);
                } else {
                    System.out.format("Falten %.2f euros\n", -diferencia);
                }
            }
        } else {
            System.out.println("Les dades no són vàlides: han de ser valors positius");
        }
    }

}
