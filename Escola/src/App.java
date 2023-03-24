
public class App {
	public static void main(String[] args) {
		Aluno joao = new Aluno("Joao Carlos");
		Aluno maria = new Aluno("Maria Silva");
		
		
		//joao.nome = "Joao Carlos";
		joao.responderChamada(2);
		joao.setNota1(5);
		joao.setNota2(2);
		//joao.situacao = "Aprovado";
		System.out.println("Aluno joao esta " + joao.getSituacao());
		
//		maria.nome = "Maria Silva";
//		maria.nota1 = 10;
//		maria.nota2 = 8;
		maria.responderChamada(1);
		
		double mediaMaria = maria.calcularMedia();
		System.out.println("Media maria = " + mediaMaria);
	}
}
