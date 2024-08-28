package curso28_08;

public class Principal_Computador {

	public static void main(String[] args) {
		Gamer Gamer = new Gamer();
		Home Home = new Home();
		
		System.out.println("-----Computador Gamer-----");
		Gamer.ligar();
		Gamer.desligar();
		Gamer.reiniciar();
		Gamer.carregandoSistemas();
		
		System.out.println("-----Computador Home-----");
		Home.ligar();
		Home.desligar();
		Home.reiniciar();
		Home.carregandoSistemas();

	}

}
