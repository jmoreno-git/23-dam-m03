package point;

/**
 *
 * @author ProvenSoft
 */
public class PointMain {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2.0, 3.0);
        Point p3 = new Point(-2.0,1.0);
        System.out.println("p1: "+p1.toString());
        System.out.println("p2: "+p2.toString());
        System.out.println("p3: "+p3.toString());
        //
        //p2.x = 5;
        p2.setX(5);
        System.out.println("Coord. x de p2: "+p2.getX());
        System.out.println("p2: "+p2.toString());
        //
        System.out.println("distance from p2 to p3: "+p2.distance(p3));
        //
        System.out.println("p2.equals(p3): "+p2.equals(p3));
        Point p4 = new Point(5.0, 3.0);
        System.out.println("p2.equals(p4): "+p2.equals(p4));        
    }
    
}
