package br.com.fiap.lojinha;

public class Vestuario extends Produto {
	
	private String tamanho;
	private String cor;
	private String meuTipo = "Vestuario";

	public Vestuario(String nome, double preco, int quantidade, String tamanho, String cor) {
		super(nome, preco, quantidade);
		setTipo(meuTipo);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + tamanho + " " + cor;
	}

	@Override
	public double getPrecoMinimo() {
		if (estaComEstoqueBaixo())
			return super.getPrecoMinimo()*0.7;
		
		return super.getPrecoMinimo();
	}
	
	
	
}
