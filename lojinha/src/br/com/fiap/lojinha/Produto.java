package br.com.fiap.lojinha;

public class Produto extends Object { //bean - BO - POJO (plain old java object) - model
	
	private String nome;
	private double preco;
	private int quantidade;
	private String tipo;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		String dados = String.format("[%s] %s (%d): %.2f ",
						tipo,
						nome, 
						quantidade, 
						preco
					);
		
		if(estaComEstoqueBaixo()) dados = "!ESTOQUE BAIXO " + dados;
		
		return dados;
	}
	
	public double getPrecoMinimo() {
		return preco;
	}
	
	public boolean estaComEstoqueBaixo() {
		return quantidade < 5;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
