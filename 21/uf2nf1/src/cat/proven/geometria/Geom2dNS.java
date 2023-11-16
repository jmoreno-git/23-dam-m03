package cat.proven.geometria;

/**
 * Biblioteca de mètodes per al càlcul amb figures planes
 * @author ProvenSoft
 */
public class Geom2dNS {
    /**
     * calcula el perímetre d'un quadrat, donat el costat
     * @param costat el costat del quadrat
     * @return el perímetre
     */
    public double perimetreQuadrat(double costat) {
        return 4.0 * costat;
    }
    
    /**
     * calcula l'àrea d'un quadrat, donat el costat
     * @param costat el costat del quadrat
     * @return l'àrea
     */
    public double areaQuadrat(double costat) {
        return costat * costat;
    }    
    
    /**
     * calcula el perímetre del rectangle
     * @param base la base del rectangle
     * @param altura l'altura del rectangle
     * @return el perímetre
     */
    public double perimetreRectangle(double base, double altura) {
        return 2.0 * (base + altura);
    }
    
    /**
     * calcula l'àrea del rectangle
     * @param base la base del rectangle
     * @param altura l'altura del rectangle
     * @return l'àrea
     */
    public double areaRectangle(double base, double altura) {
        return base * altura;
    } 
    
    /**
     * calcula el perímetre de la circumferència
     * @param radi el radi de la circumferència
     * @return el perímetre
     */
    public double perimetreCircumferencia(double radi) {
        return 2.0 * Math.PI * radi;
    }
    
    /**
     * calcula l'àrea del cercle
     * @param radi el radi del cercle
     * @return l'àrea
     */
    public double areaCercle(double radi) {
        return Math.PI * radi * radi;
    }
    
}
