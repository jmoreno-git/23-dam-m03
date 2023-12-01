
/**
 * Recull d'exemples d'ús de String
 * @author ProvenSoft
 */
public class ExemplesString {

    public static void main(String[] args) {
        String nom = "Pere";
        String nom1 = new String("Pere"); 
        String nom2 = nom1;
        String nom3 = new String("Pere");
        int edat = 23;
        System.out.println("nom1: "+nom1);
        System.out.println("nom2: "+nom2);
        System.out.println("nom3: "+nom3);
        System.out.println("nom1==nom2: "+(nom1==nom2));
        System.out.println("nom1==nom3: "+(nom1==nom3));
        System.out.println("nom1.equals(nom2): "+nom1.equals(nom2));
        System.out.println("nom1.equals(nom3): "+nom1.equals(nom3));
        //
        String missatge = String.format("%s tens %d anys", nom1, edat);
        System.out.println(missatge);
        //
        System.out.println(nom1.toLowerCase());
        System.out.println(nom1.toUpperCase());
        //
        String frase = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
        System.out.println("Comença per En? "+ frase.startsWith("En"));
        System.out.println("Acaba per rme? "+ frase.endsWith("rme"));
        //
        System.out.println(frase.indexOf("de"));
        System.out.println(frase.lastIndexOf("de"));
        System.out.println(frase.indexOf('n'));
        String canviat = frase.replace('e', '3');
        System.out.println(canviat);
        //
        System.out.println(frase.substring(10, 20));
    }
    
}
