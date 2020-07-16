package PacoteExerciciosPooJavaHerancaPolimorfismoColecao;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		cachorro1.setNome("Brotinho");
		System.out.println(cachorro1.getNome());
		cachorro1.setIdade(1);
		System.out.println(cachorro1.getIdade() + " anos");
		cachorro1.emitirSom();
		cachorro1.movimentar();
		
		System.out.println("-----------------------------------");
		cavalo1.setNome("Pé de pano");
		System.out.println(cavalo1.getNome());
		cavalo1.setIdade(10);
		System.out.println(cavalo1.getIdade() + " anos");
		cavalo1.emitirSom();
		cavalo1.movimentar();
		
		System.out.println("-----------------------------------");
		preguica1.setNome("Dona Preguiça");
		System.out.println(preguica1.getNome());
		preguica1.setIdade(5);
		System.out.println(preguica1.getIdade() + " anos");
		preguica1.emitirSom();
		preguica1.movimentar();		
	}

}
