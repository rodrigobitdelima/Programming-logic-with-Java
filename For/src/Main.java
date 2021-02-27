import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int soma = 0;
//		for(int i = sc.nextInt(); i > 0; i--) {
//			int value = sc.nextInt();
//			soma += value;
//		}
//		
//		System.out.println("SOMA = " + soma);
//		
//		int x = sc.nextInt();
//		for(int i = 1; i <= x; i++) {
//			if (i%2 != 0) {
//				System.out.println(i);
//			}
//		}
		
		int in = 0;
		int out = 0;
		for(int i = sc.nextInt(); i > 0; i--) {
			int value = sc.nextInt();
			if (value >= 10 && value <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + "in");
		System.out.println(out + "out");

		sc.close();
	}

}
