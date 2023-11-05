
import java.util.Scanner;


/**
 *
 * @author ProvenSoft
 */
public class Ex10Nomina {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaració de variables
        int horesTreballades;
        double salariBrut;
        double impostos;
        double salariNet;
        //preguntar les hores treballades
        System.out.print("Entra les hores treballades: ");
        horesTreballades = scan.nextInt();
        //calcular salari brut
        if (horesTreballades <= 130) {
            salariBrut = horesTreballades * 15;
        } else {
            salariBrut = 130 * 15;
            salariBrut += (horesTreballades-130)*15*1.5;
        }
        //calcular impostos
        double baseImposable = salariBrut-500;
        if (baseImposable<0) {
            baseImposable = 0;
        }
        //baseImposable = (salariBrut<500)?0:(salariBrut-500);
        if (baseImposable >= 400) {
           impostos = 400 * 0.25;
           impostos += (baseImposable-400) * 0.45;
        } else {
            impostos = baseImposable * 0.25;
        }
        //calcular salari net
        salariNet = salariBrut - impostos;
        //mostrar resultats
        System.out.println("Salari brut: "+salariBrut);
        System.out.println("Impostos: "+impostos);
        System.out.println("Salari net: "+salariNet);
    }
    
}
