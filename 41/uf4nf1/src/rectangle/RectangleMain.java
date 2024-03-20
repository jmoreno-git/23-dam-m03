
package rectangle;

/**
 *
 * @author ProvenSoft
 */
public class RectangleMain {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.0, 2.0);
        System.out.println("r1: "+r1.toString());
        System.out.println("perimeter r1: "+r1.perimeter());
        System.out.println("area r1:"+r1.area());
        Rectangle r2 = new Rectangle(3.0, 2.0);
        Rectangle r3 = new Rectangle(4.0, 3.0);
        System.out.println("r1.equals(r2): "+r1.equals(r2));
        System.out.println("r1.equals(r3): "+r1.equals(r3));
        Rectangle r4 = new Rectangle(2.0, 3.0);
        System.out.println("r2.equals(r4): "+r2.equals(r4));
        System.out.println("r2.perimeter(): "+r2.perimeter());
        System.out.println("r2.area(): "+r2.area());
    }
    
}
