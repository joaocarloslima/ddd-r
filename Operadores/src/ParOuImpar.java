import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		int numero;
		boolean ehPar;
		int resposta = 0;

		while(resposta == 0) {//loop - laços condicional
			numero = Integer.valueOf( JOptionPane.showInputDialog("Digite um número") );
			ehPar = numero % 2 == 0;
			JOptionPane.showMessageDialog(null, ehPar ? "É par" : "É ímpar");
			resposta = JOptionPane.showConfirmDialog(null, "Quer digitar outro número? ");
		}



//		if(ehPar) 
//			JOptionPane.showMessageDialog(null, "É par");
//		else 
//			JOptionPane.showMessageDialog(null, "É ímpar");
		
		
	}
	
}
