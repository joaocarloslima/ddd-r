package br.com.fiap.lojinha;

public class App {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Produto Genérico", 10, 1);
		Livro livro = new Livro("DDD", 90.0, 15, "Eric Evans");
		Eletronico eletronico = new Eletronico("iPhone", 40_000_000.99, 3, "apple", "14pro");
		Vestuario vestuario = new Vestuario("Blusinha", 50.0, 3, "P", "branco");
		
		System.out.println(livro);
		System.out.println(eletronico);
		System.out.println(vestuario);
		
		System.out.println(livro.getPrecoMinimo());
		System.out.println(eletronico.getPrecoMinimo());
		System.out.println(vestuario.getPrecoMinimo());
	}

}
