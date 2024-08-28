package curso28_08;

public class Principal_Veiculos_abs {

	public static void main(String[] args) {
		
		Onibus busao = new Onibus();
		Carro car = new Carro();
		
		System.out.println("BUSÃOOOOOOOOOOOOOOO");
		busao.acelerar();
		busao.frear();
		busao.ligar();
		busao.virar();
		
		System.out.println("CARROOOOOOOOOOOOOOO");
		car.acelerar();
		car.frear();
		car.ligar();
		car.virar();

	}

}
