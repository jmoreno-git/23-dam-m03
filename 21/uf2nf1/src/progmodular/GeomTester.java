package progmodular;

import java.util.Scanner;
import cat.proven.geometria.Geom2dS;
import cat.proven.geometria.Geom2dNS;

/**
 * Tester per a càlculs amb figures
 * @author ProvenSoft
 */
public class GeomTester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //càlculs amb quadrat
        System.out.print("Entra el costat del quadrat: ");
        double costatQuadrat = scan.nextDouble();
        double perimetreQuadrat = Geom2dS.perimetreQuadrat(costatQuadrat);
        double areaQuadrat = Geom2dS.areaQuadrat(costatQuadrat);
        System.out.printf(
                "El quadrat de costat %.2f té perímetre %.2f i àrea %.2f%n",
                costatQuadrat, perimetreQuadrat, areaQuadrat
                );
        //
        //càlculs amb cercle
        System.out.print("Entra el radi del cercle: ");
        double radiCercle = scan.nextDouble();
        Geom2dNS geom2dns = new Geom2dNS();
        double perimetreCercle = geom2dns.perimetreCircumferencia(radiCercle);
        double areaCercle = geom2dns.areaCercle(radiCercle);
    }
    
}
