
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ex2Nomina {

    public static void main(String[] args) {
        //definim variables
        Scanner entrada = new Scanner(System.in);
        double souBrutAnual;  //sou brut anual
        int numPagues = 0;  //nombre de pagues anuals (12 o 14)
        //llegir sou brut anual i nombre de pagues
        boolean dadesValides;
        do{
            dadesValides = true;
            System.out.print("Introdueix el sou brut anual: ");
            souBrutAnual = entrada.nextDouble();
            if(souBrutAnual<0){
                System.out.println("El sou no pot ser negatiu! Torna-hi!");
                dadesValides = false;
            }
            System.out.print("Introdueix el nombre de pagues anuals (12 o 14): ");
            numPagues = entrada.nextInt();
            if( (numPagues != 12) && (numPagues != 14) ){
                System.out.println("El número de pagues només pot ser 12 o 14");
                dadesValides = false;
            }
        } while (!dadesValides);
        //calcular percentatge retenció IRFP
        double percRetencio = calculaPercentatgeIRPF(souBrutAnual);
        //calcula import retenció
        double retencio = calculaRetencio(souBrutAnual, percRetencio);
        //mostra dades nòmina
        mostrarResultats(souBrutAnual, retencio, numPagues);
    }
    

    /**
     * determina el percentatge de retenció a aplicar en funció del sou
     * @param sou el sou brut anual
     * @return percentatge de retenció d'IRPF a aplicar
     */
    public static double calculaPercentatgeIRPF(double sou){
        double retencio;
        //determinar el valor del percentatge de retenció
        if(sou < 10000.0){
            retencio=2.00;
        } else {
            if (sou < 15000.0) {
                retencio = 11.50;
            } else {
                if (sou < 30000.0) {
                    retencio = 15.00;
                } else {
                    if (sou < 45000.0) {
                        retencio = 18.50;
                    } else {
                        retencio = 22.00;
                    }
                }
            }
        }
        //retornar el valor del percentatge de retenció
        return retencio;        
    }
    
    /**
     * calcula l'import de la retenció per IRPF donat el sou brut i el % de retenció
     * @param souBrut el sou brut anual
     * @param percRetencio el % de retenció a aplicar
     * @return import de sou net
     */
    public static double calculaRetencio(double souBrut, double percRetencio){
        double souNet;
        souNet=souBrut*percRetencio/100;
        return souNet;
    }
    
    /**
     * mostra informació de nòmina
     * @param souBrut el sou brut anual
     * @param retencio l'import de la retenció
     * @param nPagues el nombre de pagues anuals
     */
    public static void mostrarResultats(double souBrut, double retencio, int nPagues){
        System.out.println("Sou brut anual: "+souBrut);
        System.out.println("Import retenció anual: "+ retencio);
        System.out.println("Nombre de pagues anuals: "+nPagues);
        double souNetMensual = (souBrut - retencio) / nPagues;
        System.out.println("Sou brut mensual: "+souNetMensual);
    }
}
