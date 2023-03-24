import java.util.Locale;
import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite o numero do dia:");
		int dia = in.nextInt();
		in.close();

//		if (dia == 1) System.out.println("Domingo");
//		if (dia == 2) System.out.println("Segunda");
//		if (dia == 3) System.out.println("Terça");
//		if (dia == 4) System.out.println("Quarta");
//		if (dia == 5) System.out.println("Quinta");
//		if (dia == 6) System.out.println("Sexta");
//		if (dia == 7) System.out.println("Sábado");
		
		switch (dia) {
		case 'D':
		case 'd':
			System.out.println("Domingo");
			break;
		case 'S':
			System.out.println("Segunda");
			break;
		case 'T':
			System.out.println("Terça");
			break;

		default:
			System.out.println("Dia inválido");
			break;
		}
		
		String[] dias = {"inválido", "Domingo", "Segunda", "Terça"};
		System.out.println(dias[dia]);
		

	}

}
