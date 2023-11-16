package progmodular;

import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Teclat {

    public static void main(String[] args) {
        try {
            String nom = entraString("Entra el nom: ");
            System.out.println("nom: " + nom);
            int edat = Integer.parseInt(entraString("Entra l'edat: "));
            System.out.println("edat: " + edat);
            double salari = Double.parseDouble(entraString("Entra el salari: "));
            System.out.println("salari: " + salari);
        } catch (NumberFormatException e) {
            //System.out.println(e.getMessage());
            System.out.println("Dades incorrectes");
        }
        System.out.println("Finalització normal del programa");
    }

    /**
     * mostra un missatge i llegeix una resposta de l'usuari
     *
     * @param missatge el missatge a mostrar a l'usuari
     * @return la resposta de l'usuari
     */
    public static String entraString(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.print(missatge);
        return lector.next();
    }

}
