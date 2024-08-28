package curso28_08;

public class Principal_Animal_abs {

	public static void main(String[] args) {
		Lobo_abs lobo = new Lobo_abs();
		Leao leao = new Leao();
		Tigre tigre = new Tigre();
		Cachorro cao = new Cachorro();
		Gato gato = new Gato();
		
		System.out.println("-----Lobo-----");
		lobo.setNome("Furia");
		lobo.setSexo("Masculino");
		lobo.setRaca("Canis Lufus");
		
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());
		
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println(" ");
		
		System.out.println("-----Leão-----");
		leao.setNome("Carlos");
		leao.setSexo("Masculino");
		leao.setRaca("Africano");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());
		
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println(" ");
		
		System.out.println("-----Tigre-----");
		tigre.setNome("Raivosa");
		tigre.setSexo("Feminino");
		tigre.setRaca("Siberiano");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaca());
		
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println(" ");
		
		System.out.println("-----Cachorro-----");
		cao.setNome("Belinha");
		cao.setSexo("Feminino");
		cao.setRaca("shitzu");
		System.out.println(cao.getNome());
		System.out.println(cao.getSexo());
		System.out.println(cao.getRaca());
		
		cao.dormir();
		cao.caminhar();
		cao.correr();
		cao.emitirSom();
		
		System.out.println(" ");
		
		System.out.println("-----Gato-----");
		gato.setNome("Panqueca");
		gato.setSexo("Feminina");
		gato.setRaca("Persa");
		System.out.println(gato.getNome());
		System.out.println(gato.getSexo());
		System.out.println(gato.getRaca());
		
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
		

	}

	}


