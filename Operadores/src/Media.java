import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// declaracao das variaveis
		int numero1;
		int numero2;
		
		//ler os numeros
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o primeiro numero");
		numero1 = in.nextInt();
		System.out.print("Digite o segundo numero");
		numero2 = in.nextInt();
		in.close();
		
		//calcular
		double media = (numero1 + numero2) / 2.0;
		
		//mostrar o resultado
		System.out.println("A media vale " + media);

	}

}
