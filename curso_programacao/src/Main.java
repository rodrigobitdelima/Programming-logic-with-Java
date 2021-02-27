import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("Good morning!");
		System.out.print("Hello world!");
		System.out.print("Good morning!");
		
		int y = 32;
		double x = 10.35784;
		System.out.println("\n" + y);
		System.out.println(x);
		
		// Controlar casas decimais para números de ponto flutuante
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		// Alterar formatação padrão para formatos do USA
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		// Concatenar elementos
		System.out.println("RESULTADO = " + y + " METROS");
		
		// Concatenar elementos de ponto flutuante
		System.out.printf("RESULTADO = %.2f metros\n", x);
		
		// Concatenar variáveis de tipos distintos
		String name = "Rodrigo";
		int age = 25;
		double salary = 20000.00;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais\n", name, age, salary);
	}

}
