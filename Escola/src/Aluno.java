
public class Aluno {
	
	// atributos
	private String nome;
	private String rm;
	private double nota1;
	private double nota2;
	private int totalDeAula;
	private int totalDeFaltas;
	private String situacao = "reprovado";
	
	public Aluno(String nomeDoAluno) {
		nome = nomeDoAluno;
	}
	
	// metodos
	public void responderChamada(int tipoDeResposta){
		if (tipoDeResposta == 1)
			System.out.println(nome + " esta presente");
		if (tipoDeResposta == 2)
			System.out.println(nome + " ta aqui");
	}
	
	public double calcularMedia() { 
		double media = (nota1 + nota2)/2;
		return media;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setNota1(double valorNota1) {
		nota1 = valorNota1;
	}
	
	public void setNota2(double valorNota2) {
		nota2 = valorNota2;
	}

}
