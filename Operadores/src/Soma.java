import java.util.Scanner;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		// declarar as variaveis ✅
		int numero1;
		int numero2;
		int soma;
		
		// ler os dados ✅
		numero1 = Integer.valueOf( JOptionPane.showInputDialog("Digite o primeiro número") ) ;
		numero2 = Integer.valueOf( JOptionPane.showInputDialog("Digite o segundo número") ) ;
		
		//ler os dados com Scanner
//		Scanner leitor = new Scanner(System.in);
//		System.out.print("Digite o primeiro numero:");
//		numero1 = leitor.nextInt();
//		System.out.print("Digite o segundo numero:");
//		numero2 = leitor.nextInt();
//		leitor.close();
	 	
		// fazer a soma ✅
		soma = numero1 + numero2;
		
		// mostrar o resultado ✅
		JOptionPane.showMessageDialog(null, "A soma vale " + soma);
		
	}

}
