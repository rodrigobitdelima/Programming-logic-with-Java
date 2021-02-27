
public class Main {

	public static void main(String[] args) {
		Main.example1();
		Main.example2();
		Main.areaDoTrapezio();
		Main.example4();
		Main.example5();
	}
	
	private static void example1() {
		System.out.println("Exemplo 1: ");
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y + "\n\n");
	}
	
	private static void example2() {
		System.out.println("Exemplo 2: ");
		int x;
		double y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y + "\n\n");
	}
	
	private static void areaDoTrapezio() {
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("A área do trapézio é: " + area + "\n\n");
	}
	
	private static void example4() {
		int a, b;
		double result;
		a = 5;
		b = 2;
		
		result = (double) a / b;
		
		System.out.println("O resultado da divisão é: " + result + "\n\n");
	}
	
	private static void example5() {
		double a;
		int b;
		
		a = 5.0;
		b = (int) a;
		
		System.out.println(b);
	}

}
