
/**
 * Exemple de bucles for niats
 * @author Jose
 */
public class BuclesForNiats {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.format("Bucle extern i=%d%n", i);
            for (int j = 0; j < 10; j++) {
                System.out.format("\tBucle intern i=%d, j=%d%n", i, j);
            }
        }
    }
    
}
