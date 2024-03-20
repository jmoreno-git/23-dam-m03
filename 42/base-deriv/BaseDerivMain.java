
public class BaseDerivMain {
	
	public static void main (String[] args) {
		Base base1 = new Base("Joan");
		System.out.println("base1.nom: "+base1.nom);
		base1.saluda();
		Derivada deriv1 = new Derivada("Marta", "Gómez");
		System.out.println("deriv1.nom: "+deriv1.nom);
		System.out.println("deriv1.cognom: "+deriv1.cognom);
		deriv1.saluda();
	}
}

