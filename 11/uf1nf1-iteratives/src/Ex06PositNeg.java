
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex06PositNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_NUMS = 5;
        int numero;  //número entrat per l'usuari
        int positius = 0;
        int negatius = 0;
        //llegir i processar dades
        for (int i = 0; i < MAX_NUMS; i++) {
            try {
                //llegir número
                System.out.format(
                        "Entra el número %2d: ",
                        i);
                numero = sc.nextInt();
                //descartar els zeros
                if (numero != 0) {
                    //actualitzar comptadors de positius i negatius
                    if (numero > 0) {
                        positius++;
                    } else {
                        negatius++;
                    }
                } else {
                    i--;
                }
            } catch (InputMismatchException e) {
                //consumir l'entrada incorrecta
                sc.next();
                i--;
            }
        } //final for
        System.out.println("Nombre de positius: " + positius);
        System.out.println("Nombre de negatius: " + negatius);

    }

}
