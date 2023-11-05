
import java.util.Scanner;


/**
 * Llegeix base i exponent (enters),
 * calcula la potencia i mostra el resultat
 * @author ProvenSoft
 */
public class Ex11Potencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaració de variables
        int base , exponent;
        double potencia;
        //llegir base i exponent
        System.out.print("Introdueix base i exponent: ");
        base = sc.nextInt();
        exponent = sc.nextInt();
        //calcular la potencia
        potencia = 1;
        int absExponent = Math.abs(exponent);
        for (int i = 0; i < absExponent; i++) {
            potencia *= base;
        }
        if (exponent < 0) {
            potencia = 1.0 / potencia;
        }
        //mostrar resultat
        System.out.format("%d ^ %d = %f\n",
                base, exponent, potencia);
        
    }
    
}
