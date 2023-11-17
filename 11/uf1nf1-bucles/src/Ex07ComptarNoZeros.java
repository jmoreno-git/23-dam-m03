
import java.util.Scanner;


/**
 * Llegeix números enters
 * fins que l'usuari entra un zero
 * i diu quants han estat positius
 * i quants negatius i el total.
 * @author ProvenSoft
 */
public class Ex07ComptarNoZeros {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //declaració de variables
        int numero;  //número entrat a cada iteració
        int total = 0;
        int positius = 0;
        int negatius = 0;
        //entrar dades i actualitzar comptadors
        do {
            //entrar número
            System.out.print("Entra un número: ");
            numero = lector.nextInt();
            //actualitzar comptadors
            if (numero != 0) {
                total++;
                if (numero > 0) {
                    positius++;
                } else {
                    negatius++;
                }
            }
        } while ( numero != 0 );
        //mostrar resultats
        System.out.println("Total: "+total);
        System.out.println("Positius: "+positius);
        System.out.println("Negatius: "+negatius);
    }
    
}
