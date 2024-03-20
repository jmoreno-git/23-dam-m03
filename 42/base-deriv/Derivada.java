
public class Derivada extends Base {
	
	public String cognom;
	
	public Derivada(String nom, String cognom) {
		super(nom);
		this.cognom = cognom;
	}
	

	public void saluda() {
		System.out.println("Hola "+nom+" "+cognom);
	}
/*	
	public void saluda() {
		super.saluda();
		System.out.println("Hola "+cognom);
	}
*/
}

