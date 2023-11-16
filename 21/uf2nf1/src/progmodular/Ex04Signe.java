package progmodular;

import java.util.Scanner;

/**
 * Llegeix un número enter i en determina el signe
 * @author ProvenSoft
 */
public class Ex04Signe {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //preguntar el número
        System.out.print("Entra el número: ");
        int num = lector.nextInt();
        int signe = obteSigne(num);
        String missatge = "";
        switch (signe) {
            case -1:
                missatge = "negatiu";
                break;
            case 0:
                missatge = "zero";
                break;
            case 1:
                missatge = "positiu";
                break;
        }
        //mostrar resultat
        System.out.format("El número %d és %s%n", num,missatge );
    }
    
    /**
     * obté el signe del paràmetre
     * @param x el valor del qual s'ha de determinar el signe
     * @return -1 si és negatiu, 0 si és zero, +1 si és positiu
     */
    public static int obteSigne(int x) {
        int signe = 0;
        if (x > 0) {
            signe = 1;
        } else {
            if (x < 0) {
                signe = -1;
            }
        }
        return signe;
    }
    
}
