
import java.util.Scanner;


/**
 * Programa que entra nombres reals 
 * fins que l’usuari vol finalitzar 
 * (cal preguntar cada vegada si es 
 * vol continuar entrant dades)
 * i calcula el valor màxim, 
 * el valor mínim 
 * i la mitjana aritmètica 
 * dels nombres entrats. 
 * Finalment ha de mostrar els resultats.
 * @author ProvenSoft
 */
public class Ex17MinMaxMean {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float minim = Float.MAX_VALUE;
        float maxim = -Float.MIN_NORMAL;
        float mitjana = 0.0f;
        //entrar números i calcular
        boolean finalitzar = false;  //senyal per acabar
        float suma = 0.0f; //acumulador per sumar
        int numElems = 0;
        do {
            //entrar un número
            System.out.print("Número: ");
            float numero = sc.nextFloat();
            //fer els càlculs i actualitzar variables
            if (numero < minim) {
                minim = numero;
            }
            if (numero > maxim) {
                maxim = numero;
            }
            numElems++;
            suma += numero;
            //preguntar a l'usuari si vol afegir més números
            System.out.print("Afegir un altre número? (S/N): ");
            char resposta = sc.next().toLowerCase().charAt(0);
            if (resposta == 'n') {  //acabar
                finalitzar = true;
            }
        } while (!finalitzar);
        mitjana = suma/numElems;
        //mostrar resultats
        System.out.println("Mínim: "+minim);
        System.out.println("Màxim: "+maxim);
        System.out.println("Mitjana aritmètica: "+mitjana);
    }
    
}
