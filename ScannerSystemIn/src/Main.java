import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou o inteiro: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou o número com ponto flutuante: " + z);
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Primeiro caracter informado: " + c);
		
		String s;
		int i;
		double d;
		s = sc.next();
		i = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("Dados digitados na mesma linha: ");
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		
		sc.close();
	}

}
