
import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;


/**
 * L'ordinador genera un número aleatori
 * i l'usuari l'ha d'endevinar.
 * El programa indicarà a cada intent si el número secret
 * és més gran o més petit que l'intent.
 * Al final indica el nombre d'intents.
 * @author ProvenSoft
 */
public class Ex12EndevNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int VALOR_MAXIM = 30;
        int numSecret;  //número aleatori a endevinar
        //generar número aleatori
        //Amb Math.random()
//        System.out.println(
//            (long)Math.floor(1 + Math.random()*(VALOR_MAXIM -1))
//        );
        numSecret = (int)Math.floor(1 + Math.random()*(VALOR_MAXIM -1));
//        System.out.println("round(3.6):"+ Math.round(3.6));
//        System.out.println("floor(3.6):"+(long)Math.floor(3.6));
//        System.out.println("ceil(3.6):"+Math.ceil(3.6));
//        System.out.println("round(-3.6):"+ Math.round(-3.6));
//        System.out.println("floor(-3.6):"+(long)Math.floor(-3.6));
//        System.out.println("ceil(-3.6):"+Math.ceil(-3.6));
        //amb classe Random
        Random rnd = new Random();
//        System.out.println(
//                rnd.nextInt(1, VALOR_MAXIM)
//        );
        numSecret = rnd.nextInt(1, VALOR_MAXIM);
        //bucle d'interacció amb l'usuari per endevinar
        boolean endevinat = false; //indicador que l'usuari endevina el número
        int numIntents = 0;  //comptador d'intents
        do {
            //preguntar número
            System.out.print("Número entre 1 i 100: ");
            int num = sc.nextInt();
            numIntents++;  //incrementar comptador d'intents
            //encertat?
            if (num == numSecret) {
                endevinat = true;
            } else {
                if (num < numSecret) {
                    System.out.println("Prova'n un de més gran");
                } else {
                    System.out.println("Prova`n un de més petit");
                }
            }
        } while (!endevinat);
        //mostrar nombre d'intents
        System.out.println("L'has encertat. Felicitats!");
        System.out.println("Nombre d'intents: "+numIntents);
    }
    
}
