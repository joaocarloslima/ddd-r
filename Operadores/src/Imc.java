import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// declaracao das variaveis
		double peso;
		double altura;

		// ler os numeros
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite o peso");
		peso = in.nextDouble();
		System.out.print("Digite a altura");
		altura = in.nextDouble();
		in.close();

		// calcular
		double imc = peso / Math.pow(altura, 2);

		// mostrar o resultado
		System.out.println("O IMC vale " + imc);

	}

}
