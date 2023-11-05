
import java.util.Scanner;

/**
 * Llegeix l'edat de lusuari,
 * verifica que no sigui negativa,
 * i mostra un missatge indicant si és o no major d'edat.
 * @author ProvenSoft
 */
public class Ex01MajoriaEdat {

    public static void main(String[] args) {
        final int MAJORIA_EDAT = 18;
        Scanner lector = new Scanner(System.in);
        //llegir de l'usuari l'edat
        System.out.print("Entra l'edat: ");
        int edat = lector.nextInt();
        if (edat > 0) {  //edat vàlida
            if (edat >= MAJORIA_EDAT) {  //major d'edat
                System.out.println("Ets major d'edat");
            } else {   //menor d'edat
                System.out.println("Ets menor d'edat");
            }
        } else {  //edat no vàlida
            System.out.println("Valor d'edat no vàlida");
        }
    }
    
}
