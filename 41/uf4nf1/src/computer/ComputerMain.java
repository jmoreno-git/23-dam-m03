package computer;

/**
 *
 * @author ProvenSoft
 */
public class ComputerMain {

    public static void main(String[] args) {
        Computer comp1 = new Computer(
                "i7", 16, 1000, 
                "LED 24 inches");
        comp1.start();
        comp1.executeProgram("Excel");
        comp1.setScreenSaverOn(true);
        comp1.close();
    }
    
}
