
public class Jogo {

	public static void main(String[] args) {
		int vidas = 3;
		int level = 15;
		boolean temEspada = true;
		boolean temMagia = false;
		boolean acabouOJogo = vidas <= 0;
		boolean levelAlto = level>10;
		
		boolean podeAtacar = levelAlto && (temEspada || temMagia) && !acabouOJogo;
		
		System.out.println("Pode atacar = " + podeAtacar);

	}

}
