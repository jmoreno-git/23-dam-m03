package prgmod;

import java.util.Scanner;

/**
 * Pregunta l'edat i informa si és major d'edat o no
 * @author Provensoft
 */
public class Ex02Edat {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir l'edat
        System.out.print("Entra l'edat: ");
        int edatAVerificar = lector.nextInt();
        //validar edat
        if (esEdatValida(edatAVerificar)) {  //edat valida
            //verificar i mostrar majoria d'edat
           if (esMajorEdat(edatAVerificar)) {
               System.out.println("major d'edat");
           } else {
               System.out.println("menor d'edat");
           }           
        } else {
            System.out.println("Valor no vàlid per a l'edat");
        }

    }
    
    /**
     * determina si és major d'edat o no
     * @param edat l'edat a verificar
     * @return true si és major d'edat, false en cas contrari
     */
    public static boolean esMajorEdat(int edat) {
        final int MAJORIA_EDAT = 18;
//        boolean resultat = false;
//        if (edat >= MAJORIA_EDAT) {
//            resultat = true;
//        } else {
//            resultat = false;
//        }
//        resultat = (edat >= MAJORIA_EDAT) ? true : false;
//        resultat = (edat >= MAJORIA_EDAT);
//        return resultat;
        return (edat >= MAJORIA_EDAT);
    }

    private static boolean esEdatValida(int edat) {
        return (edat >= 0);
    }
    
}
