package animal;

/**
 *
 * @author jmorenp
 */
public class AnimalMain {

    public static void main(String[] args) {
        Parlador[] parladors = new Parlador[5];
        parladors[0] = new Gos();
        parladors[1] = new Gat();
        parladors[2] = new Cucu();
        parladors[3] = new Gos();
        parladors[4] = new Ocell();
        //
        for (Parlador elem : parladors) {
            queParli(elem);
        }
    }
    
    private static void queParli(Parlador parlador) {
        parlador.parla();
    }
    
}
