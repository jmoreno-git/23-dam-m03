package parlador;

/**
 *
 * @author Jose
 */
public class ParlarTest {

    public static void main(String[] args) {
        ParlarTest ap = new ParlarTest();
        ap.run();
    }

    private void run() {
        //crear objectes
        Gos gos = new Gos();
        Gat gat = new Gat();
        Ocell ocell = new Ocell();
        Cucut cuco = new Cucut();
        //crear array de 'parladors'
        Parlador[] parladors = new Parlador[4];
        parladors[0] = gos;
        parladors[1] = gat;
        parladors[2] = ocell;
        parladors[3] = cuco;
        //fer parlar els parladors
        for (int i = 0; i < parladors.length; i++) {
            queParli(parladors[i]);
        }
    }
    
    private void queParli(Parlador parlador) {
        parlador.parla();
    }
}
