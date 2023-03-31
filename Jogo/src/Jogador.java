
public class Jogador {
	
	private String nome = "Anonimo";
	private int xp = 5;
	private int hp = 100;
	private boolean envenenado;
	
	//sobrecarga de métodos
	public Jogador() {
		
	}
	
	public Jogador(String nome) {
		System.out.println("Criando jogador chamado " + nome);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void receberDano(int pontos) {
		this.hp -= pontos;
		if(this.hp <= 0) {
			System.out.println("Game Over " + nome);
			this.hp = 0;
		}
	}

	public void receberCura(int pontos) {
		this.hp += pontos;		
	}

	public void ganharExperiencia(int pontos) {
		this.xp += pontos;		
	}
	
	public void receberAntidoto() { //code smell
//		if(isEnvenenado()) {
//			envenenado = false;
//		}else {
//			envenenado = true;
//		}
		
//		envenenado = isEnvenenado() ? false : true;
		
		envenenado = !envenenado;
		
	}

	public void atacar(Jogador jogador) {
		jogador.receberDano(this.xp);
		
		if(jogador.foiDerrotado()) 
			this.ganharExperiencia(jogador.getXp());
		
	}

	private boolean foiDerrotado() {
		return hp == 0;
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
