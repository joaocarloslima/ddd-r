import java.util.Scanner;

public class Horario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha uma opcao: "
				+ "\n a - segunda "
				+ "\n b - terca"
				+ "\n c - quarta"
				+ "\n d - quinta"
				+ "\n e - sexta");
		
		char resposta = in.next().charAt(0);
		in.close();
		
		if(resposta == 'a') {
			System.out.println("Aula da segunda");
			return;
		}
		if (resposta == 'b'){
			System.out.println("Aula da terca");
			return;
		}
		if (resposta == 'c'){
			System.out.println("Aula da quarta");
			return;
		}
		System.out.println("Opcao invalida");
		
		switch (resposta) {
		case 'a':
			System.out.println("Aula da segunda");
			break;
		case 'b':
			System.out.println("Aula da terca");
			break;

		default:
			System.out.println("Opcao invalida");
			break;
		}
		
		
		
		
		
	}
}
