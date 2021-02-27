import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Utilizado em programação de baixo nível:
		 * Micro-controlador, interfaces de rede, arduínos, etc).
		 */
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) == mask) {
			System.out.print("6th bit is true!");
		} else {
			System.out.print("6th bit is false!");
		}
		
		sc.close();
	}

}
