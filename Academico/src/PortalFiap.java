import java.util.Scanner;

public class PortalFiap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o nome:");
		String nome = in.nextLine();
		double nota = 0;
		double soma = 0;
		int qtde = -1;
		//object calestenic
		while (nota >= 0) {
			qtde++;
			soma += nota;
			System.out.print("Digite a nota:");
			nota = in.nextDouble();
		}
		
		double media = soma / qtde;
		System.err.println("Soma = " + soma);
		System.err.println("Qtde = " + qtde);
		in.close();
	}
}
