
import java.util.Scanner;

/**
 * Llegeix l'edat de l'usuari
 * i li diu si està jubilat o no segons l'edat.
 * @author ProvenSoft
 */
public class Jubilacio {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat;
        //llegir l'edat
        System.out.print("Entra l'edat: ");
        edat = lector.nextInt();
        String missatge;
        //validar edat positiva
        if (edat > 0) { //edat positiva
            //comprovar l'edat de jubilació
            if (edat >= 67) { //edat superior a la de jubilació
                missatge = "Estàs en edat de jubilació";
            } else {  //edat inferior a la de jubilació
                missatge = "Estàs en edat de treballar";
            }
        } else {  //edat no positiva
            missatge = "Edat no vàlida";
        }
        //mostrar el missatge a l'usuari
        System.out.println(missatge);
    }
    
}
