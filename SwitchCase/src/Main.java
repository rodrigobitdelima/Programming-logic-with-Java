import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Informe o dia da semana: ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		String dayText;
		
		switch (day) {
		case 1:		
			dayText = "Domingo";
			break;
		case 2:
			dayText = "Segunda";
			break;
		case 3:
			dayText = "Terça";
			break;
		case 4:
			dayText = "Quarta";
			break;
		case 5:
			dayText = "Quinta";
			break;
		case 6:
			dayText = "Sexta";
			break;
		case 7:
			dayText = "Sábado";
			break;
		default:
			dayText = "Valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + dayText);
		sc.close();
	}

}
