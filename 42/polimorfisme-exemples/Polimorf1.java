/**
 * Polimorf1.java
 * Exemple de herencia i polimorfisme
 * @author Jose Moreno
 * @version
 */
public class Polimorf1 {
	public static void main(String[] args) {
		Granota unaGranota = new Granota();
		Amfibi unAmfibi = unaGranota; //referencia a l'objecte unaGranota
		//metode setNom() de la classe base
		unAmfibi.setNom("Eusebi");
		System.out.println("Nom de l'amfibi: "+unAmfibi.getNom());
		System.out.println("Nom de la granota: "+unaGranota.getNom());
		//metode setNom() des de la classe derivada
		unaGranota.setNom("Carlota");
		System.out.println("Nom de l'amfibi: "+unAmfibi.getNom());
		System.out.println("Nom de la granota: "+unaGranota.getNom());
	}
}
class Amfibi {
	String nom;
	public Amfibi() {
		System.out.println("Nou objecte Amfibi ");
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom){
		this.nom = "Amfibi->"+nom;
	}
}
class Granota extends Amfibi {
	public Granota() {
		super();
		System.out.println("Nou objecte Granota ");
	}
}
