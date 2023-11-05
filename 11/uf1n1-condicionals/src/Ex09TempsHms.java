
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex09TempsHms {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //entrada de l'hora en hores, minuts i segons
        System.out.print("Hora inicial (hores): ");
        int hores = lector.nextInt();
        System.out.print("Hora inicial (minuts): ");
        int minuts = lector.nextInt();  
        System.out.print("Hora inicial (segons): ");
        int segons = lector.nextInt(); 
        System.out.format("Hora inicial: %d h, %d m, %d s\n", hores, minuts, segons);        
        //entrada del temps en segons
        System.out.print("Interval (segons transcorreguts): ");
        int segonsInterval = lector.nextInt(); 
        //sumar a l'hora l'interval i normalitzar
        //tractar els segons
        segons += segonsInterval;
        int minutsAddicionals = segons /60;
        segons %= 60;
        //tractar els minuts
        minuts += minutsAddicionals;
        int horesAddicionals = minuts / 60;
        minuts %= 60;
        //tractar les hores
        hores += horesAddicionals;
        //mostrar l'hora final
        System.out.format("Hora final: %d h, %d m, %d s\n", hores, minuts, segons);        
    }
    
}
