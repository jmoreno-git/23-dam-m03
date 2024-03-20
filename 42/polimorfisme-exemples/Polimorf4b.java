/**
 * Polimorf4b.java
 * Exemple de herencia i polimorfisme
 * @author Jose Moreno
 * @version 
 */
public class Polimorf4b {
	public static void main(String[] args) {
		Derivat deriv = new Derivat();
		Base bas = new Base();
		deriv.f();
		deriv = (Derivat)bas; //excepcio en temps d'execucio
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