/**
 * Polimorf3.java
 * Exemple de herencia i polimorfisme
 * @author Jose Moreno
 * @version
 */
public class Polimorf3 {
	public static void main(String[] args) {
		Derivat deriv = new Derivat();
		Base bas = new Base();
		bas.f();
		bas = deriv; //referencia a l'objecte deriv
		deriv.f();
		bas.f();
	}
}
class Base {
	public Base() {
		System.out.println("Nou objecte Base ");
	}
	public void f() {
		System.out.println("Base.f()");
	}
}
class Derivat extends Base {
	public Derivat() {
		super();
		System.out.println("Nou objecte Derivat ");
	}
	public void f() {
		System.out.println("Derivat.f()");
	}
}