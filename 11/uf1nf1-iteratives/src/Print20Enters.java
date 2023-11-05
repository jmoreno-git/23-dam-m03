
/**
 * Imprimeix els 20 primers nombres naturals
 * @author ProvenSoft
 */
public class Print20Enters {

    public static void main(String[] args) {
        final int LIMIT = 20;
        //comptador
//        int comptador = 0;
//        //bucle while
//        while ( comptador < LIMIT ) {
//            //imprimir comptador
//            System.out.println(comptador+1);
//            //incrementar comptador
//            comptador++;
//        }
        //bucle do-while
//        do {
//            //imprimir comptador
//            System.out.println(comptador+1);
//            //incrementar comptador
//            comptador++;            
//        } while ( comptador < LIMIT );
        //bucle for
        for ( int comptador=0; comptador<LIMIT ; comptador++ ) {
            //imprimir comptador
            System.out.println(comptador+1);            
        }
        System.out.println("fi del programa");
    }
    
}
