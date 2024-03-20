package automobile;

/**
 *
 * @author ProvenSoft
 */
public class CarMain {

    public static void main(String[] args) {
        Car c1 = new Car("1234A", "Seat", "600S", "Gasolina", 4);
        System.out.println(c1.toString());
        boolean result = c1.start();
        System.out.println(c1);
        result = c1.changeEngine(1);
        System.out.println(c1);
        result = c1.accelerate(20.0);
        System.out.println(c1);
        result = c1.changeEngine(2);
        System.out.println(c1);
        result = c1.changeEngine(-1);
        System.out.println(c1);
        result = c1.decelerate(30.0);
        System.out.println(c1);
        result = c1.changeEngine(0);
        System.out.println(c1);
        result = c1.stop();
        System.out.println(c1);
    }
    
}
