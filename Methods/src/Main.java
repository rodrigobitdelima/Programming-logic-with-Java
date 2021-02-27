import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> list = Arrays.asList(a, b, c);

		System.out.println("Higher: " + Main.returnHigher(list));
		sc.close();

	}

	private static int returnHigher(List<Integer> list) {
		Integer max = Collections.max(list);
		return max;
	}
}
