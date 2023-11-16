package progmodular;

import java.util.Scanner;

/**
 * Calcula perímetre i àrea d'un rectangle,
 * les dimensions del qual demana a l'usuari
 * @author ProvenSoft
 */
public class Rectangles {

    public static void main(String[] args) {
        //llegir dimensions del rectangle
        double baseRectangle = llegirDouble("Entra la base: ");
        double alturaRectangle = llegirDouble("Entra l'altura: ");
        //càlculs
        double perimetreRectangle = calculaPerimetre(
           baseRectangle, alturaRectangle
        );
        double areaRectangle = calculaArea(
           baseRectangle, alturaRectangle
        );
        //mostrar resultats
        System.out.println("Perímetre: "+perimetreRectangle);
        System.out.println("Àrea: "+areaRectangle);
        
    }
    
    /**
     * pregunta a l'usuari el missatge
     * i retorna la resposta
     * @param missatge el missatge a mostrar a l'usuari
     * @return la resposta de l'usuari
     */
    public static double llegirDouble(String missatge) {
        Scanner sc = new Scanner(System.in);
        System.out.print(missatge);
        double resposta = sc.nextDouble();
        return resposta;
    }
    
    /**
     * calcula el perímetre d'un rectangle
     * amb la base i altura donades
     * @param base la base del rectangle
     * @param altura l'altura del rectangle
     * @return el perímetre del rectangle
     */
    public static double calculaPerimetre(
            double base, double altura
    ) {
       double perimetre = 0.0;
       perimetre = 2.0 * (base + altura);
       return perimetre;
    }
    
    /**
     * calcula l'àrea d'un rectangle
     * amb la base i altura donades
     * @param base la base del rectangle
     * @param altura l'altura del rectangle
     * @return l'àrea del rectangle
     */
    public static double calculaArea(
            double base, double altura
    ) {
        double area = 0.0;
        area = base * altura;
        return area;
    }
    
}
