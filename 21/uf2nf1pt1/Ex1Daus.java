
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex1Daus {

    public static void main(String[] args) {
        //definim variables i constants
        final int SALDO_INICIAL = 10;  //valor del saldo inicial
        final int MAX_SALDO = 30;  //valor màxim permès del saldo 
        int saldo=SALDO_INICIAL;   //saldo en cada moment del joc
        int dau1, dau2;   //valors en tirar cada dau
        int aposta;   //import en punts de l'aposta
        //lògica del joc
        do{
            //preguntar quantitat a apostar
            aposta=obteAposta(saldo);
            //restar aposta del saldo
            saldo -= aposta;
            //tirar els daus
            dau1=tiradaDau();
            dau2=tiradaDau();
            //mostrar resultat dels daus
            mostrarTirada(dau1, dau2);
            //calcular premi
            int premi = calcularPremi(dau1, dau2, aposta);
            //sumar premi a saldo
            saldo += premi;
            //limitar saldo a valor màxim.
            saldo = (saldo > MAX_SALDO) ? MAX_SALDO : saldo;
            acabarJoc(saldo, dau1, dau2);
        }while(!acabarJoc(saldo, dau1, dau2));
        //mostrem els resultats de la partida
        System.out.println("Joc finalitzat");
        System.out.println("Saldo final: "+saldo);
    }

    /**
     * demana a l'usuari l'import a apostar i el valida (positiu i no superior al saldo)
     * @param saldo el saldo de punts que té l'usuari
     * @return l'import a apostar
     */
    public static int obteAposta(int saldo){
        Scanner entrada = new Scanner(System.in);
        int aposta;
        boolean apostaValida = true;
        do{
            //demanar import aposta
            System.out.format("Saldo actual: %d%n",saldo);
            System.out.print("Punts a apostar? ");
            aposta=entrada.nextInt();
            if(aposta<=0 || aposta>saldo){  //validar import aposta
                System.out.println("L'aposta ha de ser positiva i no pot ser superior al saldo");
                apostaValida = false;
            } else {
                apostaValida = true;
            }
        }while(!apostaValida);
        //retorna la quantitat apostada
        return aposta;
    }
    
    /**
     * genera aleatòriament la tirada d'un dau (valor d'1 a 6 ambdós inclosos).
     * @return tirada del dau
     */
    public static int tiradaDau(){
        Random aleatori = new Random();
        return aleatori.nextInt(6)+1;
    }
    
    /**
     * mostra els valors obtinguts amb els dos daus
     * @param dau1 valor del dau 1
     * @param dau2 valor del dau 2
     */
    public static void mostrarTirada(int dau1,int dau2){
        //mostrem per pantalla el valor dels 2 daus
        System.out.println("***************************");
        System.out.format("* Dau1: %d *\n",dau1);
        System.out.format("* Dau2: %d *\n",dau2);
        System.out.println("***************************");
    }
    
    /**
     * calcula el premi obtingut
     * @param dau1 el valor del dau 1
     * @param dau2 el valor del dau 2
     * @param aposta l'import apostat en punts
     * @return els punts de premi obtinguts
     */
    public static int calcularPremi(int dau1, int dau2, int aposta){
        //definim variable premi
        int premi = 0;
        //calculem el premi
        if((dau1==6) && (dau2==6)){
            premi=3*aposta;
        }
        else {
            if((dau1+dau2)==10){
                premi = aposta+aposta;   
            } else {
                if (dau1 == dau2) {
                    premi = aposta+2;   
                }                 
            }
        }
        //retornem el valor del premi
        return premi;
    }
    
    /**
     * decideix si s'acaba el joc per esgotament del saldo,
     * superació del saldo màxim o que hagin sortit dos 6.
     * @param saldo el saldo de punts de l'usuari
     * @param dau1 el resultat del dau 1
     * @param dau2 el resultat del dau 2
     * @return true si s'acaba el joc, false en cas contrari
     */
    public static boolean acabarJoc(int saldo, int dau1, int dau2){
        boolean acabar;
        final int MAX_SALDO = 30;   //valor màxim permès del saldo 
        acabar = (saldo <= 0) || (saldo >=MAX_SALDO) 
                || ((dau1==6) && (dau2==6));
        return acabar;
    }
    
}
