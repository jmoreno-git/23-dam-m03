
import java.util.Scanner;

/**
 * llegeix un nombre natural 
 * i calcula i mostra la suma i el producte
 * dels primers nombres naturals fins a l'entrat
 * @author ProvenSoft
 */
public class Ex08SumaProducte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaració de variables
        int num; //número entrat per l'usuari
        int suma = 0; //suma dels primers naturals...
        int producte = 1; //producte dels primers naturals...
        //llegir número
        System.out.print("Entra un nombre natural: ");
        num = sc.nextInt();
        //calcular
        for (int i = 1; i <= num; i++) {
            suma += i;
            producte *= i;
        }
        //mostrar resultats
        System.out.format("Suma dels naturals entre 1 i %d: %d\n",
                        num, suma);
        System.out.format("Producte dels naturals entre 1 i %d: %d\n",
                        num, producte);
    }
    
}
