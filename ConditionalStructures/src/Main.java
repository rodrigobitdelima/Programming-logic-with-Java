
public class Main {

	public static void main(String[] args) {
		int hour = java.time.LocalTime.now().getHour();

		if (hour >= 6 && hour <= 12) {
			System.out.println("Bom dia!");
		} else if (hour >= 13 && hour <= 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
	}

}
