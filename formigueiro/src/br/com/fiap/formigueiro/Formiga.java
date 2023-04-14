package br.com.fiap.formigueiro;

public class Formiga {

	// [modificador] [tipo] [nome] = [valor]
	private int velocidade;
	private int x;
	private int y;
	private boolean estaCarregandoAlimento;
	private int feromonios;
	private int casaX;
	private int casaY;
	private int alimentoX;
	private int alimentoY;
	
	public Formiga(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void buscarComida() {
		andar();
		verificarAlimento();
	}

	private void andar() {
		int sorteio = (int) (Math.random()*4);
		if(sorteio == 0) x += velocidade;
		if(sorteio == 1) x -= velocidade;
		if(sorteio == 2) y -= velocidade;
		if(sorteio == 3) y += velocidade;
	}

	private void verificarAlimento() {
		if(x == alimentoX && y == alimentoY) {
			pegarAlimento();
		}
	}

	private void pegarAlimento() {
		estaCarregandoAlimento = true;
	}
	
	private void largarAlimento() {
		estaCarregandoAlimento = false;
	}
	
	private void verificarSeEstaEmCasa() {
		if(estaEmCasa()) largarAlimento();
	}
	
	private boolean estaEmCasa() {
		return x == casaX && y == casaY;
	}
	
	public void agir() {
		if(estaCarregandoAlimento) {
			System.out.println("indo pra casa");
			return;
		}
		
		buscarComida();
		
	}
	
	
	
}
