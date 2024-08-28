package curso28_08;

public class Onibus extends Veiculos_abs {
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando o bus");
	}
	
	@Override
	public void frear() {
		System.out.println("Freando o bus");
	
    }
	
	@Override
	public void virar() {
		System.out.println("Virando o bus");
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando o bus");
	}
}


