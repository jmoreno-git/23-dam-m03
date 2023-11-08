package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 * Implementació senzilla del joc de la ruleta
 * @author Jose
 */
public class Ruleta {

    public static void main(String[] args) {
        /**
         * Punts amb què comença el jugador
         */
        final int PUNTS_INICIALS = 100;
        /**
         * Punts que té el jugador en cada moment
         */
        int saldoPunts = PUNTS_INICIALS;
        /**
         * sçSenyal per continuar jugant
         * S'acaba el joc quan el jugador diu que no vol continuar o quan es queda sense saldo
         */
        boolean continuar = false;
        //iniciar joc
        System.out.println("Saldo inicial: "+saldoPunts);
        do {
            if (saldoPunts >= 0) { //verificar que hi ha saldo
                //obtenir el número per a l'aposta
                int numAposta = obtenirTipusAposta();
                //obtenir la quantitat per a l'aposta
                int quantitatAposta = obtenirQuantitatAposta(saldoPunts);
                if ( (numAposta > 0) && (quantitatAposta > 0) ) { //verificar validesa
                    saldoPunts -= quantitatAposta;
                    int ruletaNum = ruletaTir();
                    int premi = calculaPremi(ruletaNum, numAposta, quantitatAposta);
                    saldoPunts += premi;
                } else {  //cas d'aposta incorrecta
                    System.out.println("Aposta incorrecta");
                }
            } else {  //cas de no disposar de saldo
                continuar = false;
                break;
            }
            System.out.printf("Saldo actual és: %d\n", saldoPunts);
            continuar = obtenirContinuar();
        } while (continuar);
        System.out.println("Joc finalitzat");
        System.out.printf("Saldo final és: %d\n", saldoPunts);
    }
    
    /**
     * Pregunta al jugador els punts que vol apostar.
     * No s'accepten valors superiors al saldo de punts que té
     * @param saldo el saldo de punts a apostar
     * @return els punts a apostar o 0 si no és vàlid
     */
    public static int obtenirQuantitatAposta(int saldo) {
        int quantAposta = Integer.parseInt(inputString("Quantitat a apostar: "));
        if (quantAposta > saldo) {
            quantAposta = 0;
        }
        return quantAposta;
    }
    
    /**
     * Pregunta al jugador el número per a apostar.
     * Els valors permesos estan entre 1 i 38
     * @return el número al qual aposta el jugador (37 vol dir senar, 38 parell) o 0 si no és vàlid
     */
    public static int obtenirTipusAposta() {
        int tipusAposta = Integer.parseInt(inputString("Número aposta: "));
        if ( (tipusAposta < 1) || (tipusAposta > 38) ) {
            tipusAposta = 0;
        }
        return tipusAposta;
    }
    
    /**
     * Mostra un missatge i llegeix la resposta de l'usuari
     * @param missatge el missatge a mostrar
     * @return la resposta de l'usuari
     */
    public static String inputString(String missatge) {
        Scanner sc = new Scanner(System.in);
        System.out.print(missatge);
        return sc.next();
    }

    /**
     * Tirada de la ruleta per escollir un número aleatòriament entre 1 i 36.
     * Imprimeix la paraula 'ruleta' i tants asteriscs com el número que ha sortit.
     * Finalment mostra el número
     * @return el número que ha sortit
     */
    public static int ruletaTir() {
        Random rnd = new Random();
        int numAleat =  rnd.nextInt(1, 36);
        System.out.print("Ruleta>");
        for (int i = 0; i < numAleat; i++) {
            System.out.print("*");
        }
        System.out.println(" "+numAleat);
        return numAleat;
    }

    /**
     * Calcula l'import del premi
     * @param numRuleta número que ha sortit a la ruleta
     * @param numAposta número al qual ha apostat el jugador
     * @param quantitatAposta quantitat apostada pel jugador
     * @return 0 si falla, 36 vegades la quantitat apostada si encerta el número, el doble si encerta parell o senar (parell correspon al 38, senar al 37)
     */
    public static int calculaPremi(int numRuleta, int numAposta, int quantitatAposta) {
        int premi = 0;
        if (numRuleta == numAposta) {
            premi = quantitatAposta * 36;         
        } else {
            if ( (numAposta == 37) && (numRuleta%2 == 1) ) {
                premi = quantitatAposta * 2;
            }
            if ( (numAposta == 38) && (numRuleta%2 == 0) ) {
                premi = quantitatAposta * 2;
            }
        }
        return premi;
    }

    /**
     * Pregunta al jugador si vol continuar jugant
     * @return true si vol continuar, false en cas contrari
     */
    public static boolean obtenirContinuar() {
        String resposta = inputString("Continuar (S/N): ");
         return resposta.toLowerCase().startsWith("s");
    }
    
}
