package PacoteExerciciosPooJavaHerancaPolimorfismoColecao;

public class Cachorro extends Animal {
	
	public Cachorro() {
        super();       
	}

	public void emitirSom() {
		System.out.println("Au!, au!");
	}
	
	public void movimentar() {
		System.out.println("Correr...");
	}
	
}