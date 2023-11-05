package prgmod;

import java.util.Scanner;

/**
 * Llegeix de l'usuari dos nombres reals
 * i calcula i mostra el seu producte.
 * @author ProvenSoft
 */
public class Ex01Producte {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        //preguntar els nombres reals
        System.out.print("Primer operand: ");
        float operand1 = teclat.nextFloat();
        System.out.print("Segon operand: ");
        float operand2 = teclat.nextFloat();
        //calcular producte
        float resultat = calculaProducte(operand1, operand2);
        //mostrar resultat
        System.out.format("%f * %f = %f%n",
                operand1,operand2, resultat);
        
        
    }  //final main()
    
    /**
     * multiplica els paràmetres
     * @param x primer factor
     * @param y segon factor
     * @return el producte dels dos paràmetres
     */
    public static float calculaProducte(float x, float y) {
        return x * y;
    }
    
}
