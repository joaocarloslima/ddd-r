
public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Joao");
		Jogador jogador2 = new Jogador();
		Jogador jogador3 = new Jogador();
		
		//jogador1.nome = "João";
		//jogador1.setHp(-1);
		System.out.println("Jogador1 " + jogador1.getNome()+ 
									"XP=" + jogador1.getXp() +
									" HP=" + jogador1.getHp() +   
									" Envenenado=" + jogador1.isEnvenenado()   
									);
		
		//jogador1.receberDano(120);
		//jogador1.receberCura(10);
		jogador1.ganharExperiencia(5);
		jogador2.ganharExperiencia(100);
		jogador1.receberAntidoto();
		jogador2.atacar(jogador1);
		
		
		System.out.println("Jogador1 " + jogador1.getNome()+ 
				"XP=" + jogador1.getXp() +
				" HP=" + jogador1.getHp() +   
				" Envenenado=" + jogador1.isEnvenenado()   
				);
		
		System.out.println("Jogador2 XP" + jogador2.getXp());
		
		
	}
	
}
