public class SobrecarregaTest {
	public static void main(String[] args) {
		Calculs c = new Calculs();
		System.out.println(“2+3=”+c.suma(2,3));
		System.out.println(“2+3+4=”+c.suma(2,3,4));
	}
}
class Calculs {
	int suma(int x, int y) {
		return (x+y);
	}
	int suma(int x, int y, int z) {
		return (x+y+z);
	}
}