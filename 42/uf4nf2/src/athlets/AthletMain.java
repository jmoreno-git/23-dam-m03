package athlets;

/**
 *
 * @author jmorenp
 */
public class AthletMain {
    
    private Athlet[] athlets;
    private final int MAX_ATHLETS = 5;
    
    public static void main(String[] args) {
        AthletMain am = new AthletMain();
        am.athlets = new Athlet[am.MAX_ATHLETS];
        //
        am.generateAthlets();
        //
        am.displayAthlets();
        //
        System.out.println("Attending class");
        am.makeAthletsAttendClass();
        //
        System.out.println("Swimming");
        am.makeAthletsSwim();
        //
        System.out.println("Take competition");
        am.takeCompetition();
        am.displayAthlets();
//        Athlet jordan = new Athlet("Jordan", 20, "Basket", 12);
//        System.out.println("Jordan: "+jordan);
//        jordan.setAge(30);
//        jordan.setDiscipline("Marathon");
//        System.out.println("Jordan: "+jordan);
    }
    
    public void generateAthlets() {
        athlets[0] = new Athlet("Jordan", 20, "Basket", 12);
        athlets[1] = new Athlet("Jordan", 20, "Basket", 12);
        athlets[2] = new Athlet("Jordan", 20, "Basket", 12);
        athlets[3] = new Athlet("Jordan", 20, "Basket", 12);
        athlets[4] = new Athlet("Jordan", 20, "Basket", 12);    
    }
    
    public void displayAthlets() {
        for (Athlet athlet : athlets) {
            System.out.println(athlet);
        }
    }
    
    public void makeAthletsAttendClass() {
        for (Athlet athlet : athlets) {
            System.out.println(athlet.attendClass());
        }
    }

    public void makeAthletsSwim() {
        for (Athlet athlet : athlets) {
            System.out.println(athlet.swim());
        }
    }
    
    public void takeCompetition() {
        for (int i = 0; i < athlets.length; i++) {
            athlets[i].setNumber(i+1);
        }
    }
    
}
