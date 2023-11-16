package progmodular;

import java.util.Scanner;

/**
 * Programa que demana a l’usuari dos números enters 
 * i diu si són iguals o, cas que no ho siguin, 
 * quin és el valor del més gran.
 * @author ProvenSoft
 */
public class Ex06Compara {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //preguntar els números
        System.out.print("Entra el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Entra el segon número: ");
        int num2 = lector.nextInt();
        int comparacio = Integer.compare(num1, num2);
        //int comparacio = compara(num1, num2);
        String missatge = "";
        switch (comparacio) {
            case -1:
                missatge = "num1 < num2";
                break;
            case 0:
                missatge = "num1 = num2";
                break;
            case 1:
                missatge = "num1 > num2";
                break;
        }
        //mostrar resultat
        System.out.println(missatge );
    }
    
    /**
     * obté el signe del paràmetre
     * @param x primer valor a comparar
     * @param y segon valor a comparar
     * @return -1 si el primer és menor, 0 si són iguals, +1 si el segon és menor
     */
    public static int compara(int x, int y) {
        int r = 0;
//        if (x < y) {
//            r = -1;
//        } else {
//            if (x > y) {
//                r = 1;
//            }
//        }
        if (x != y) {
            r = (x < y) ? -1 : 1 ;
        }
        return r;
    }
    
}
