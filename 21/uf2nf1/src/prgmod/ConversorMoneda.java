package prgmod;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realitza conversions de moneda entre euros i dòlars. Presenta a l'usuari un
 * menú per escollir la conversió fins que demana sortir.
 *
 * @author ProvenSoft
 */
public class ConversorMoneda {

    public static void main(String[] args) {

        boolean sortir = false; //senyal per sortir

        do {
            //mostrar menu i llegir opcio
            int opcioSel = mostraMenu();
            //executar l'opció escollida
            switch (opcioSel) {
                case 0: //sortir
                    sortir = true;
                    break;
                case 1: //euros a dòlars
                    procConvEuroDolar();
                    break;
                case 2: //dòlars a euros
                    procConvDolarEuro();
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (!sortir);

    } //final de main

    /**
     * mostra el menu del programa i llegeix l'opció escollida per l'usuari
     *
     * @return el número de l'opció escollida per l'usuari o -1 si no vàlida
     */
    public static int mostraMenu() {
        int opcio = -1;
        System.out.println("===Menú del programa de conversió euro-dòlar===");
        //mostrar opcions
        System.out.println("0. Sortir");
        System.out.println("1. Convertir d'euros a dòlars");
        System.out.println("2. Convertir de dòlars a euros");
        //llegir opció
        System.out.print("> Selecciona una opció: ");
        Scanner lector = new Scanner(System.in);
        try {
            opcio = lector.nextInt();
        } catch (InputMismatchException e ){
            opcio = -1;
        }
        return opcio;
    }

    /* ====== Mètodes de càlcul ====== */
    
    /**
     * converteix euros a dòlars
     *
     * @param euros els euros que s'han de convertir
     * @return la conversió a dòlars
     */
    public static double convEuroDolar(double euros) {
        final double EURO_DOLAR = 0.9;
        return euros * EURO_DOLAR;
    }

    /**
     * converteix dòllars to euros
     *
     * @param dolars els dòlars que s'han de convertir
     * @return la conversió a euros
     */
    public static double convDolarEuro(double dolars) {
        final double DOLAR_EURO = 1.0 / 0.9;
        return dolars * DOLAR_EURO;
    }

    /* ====== Mètodes de control ====== */
    
    /**
     * llegeix euros, converteix a dòlars i imprimeix resultat
     */
    private static void procConvEuroDolar() {
        Scanner lector = new Scanner(System.in);
        try {
            double euros = lector.nextDouble();
            double dolars = convEuroDolar(euros);
            System.out.format("%.2f euros equivalen a %.2f dòlars\n", euros, dolars);
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dades incorrecta");
        }
    }

    /**
     * llegeix dòlars, converteix a euros i imprimeix resultat
     */
    private static void procConvDolarEuro() {
        Scanner lector = new Scanner(System.in);
        try {
            double dolars = lector.nextDouble();
            double euros = convDolarEuro(dolars);
            System.out.format("%.2f dòlars equivalen a %.2f euros\n", dolars, euros);
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dades incorrecta");
        }
    }

}