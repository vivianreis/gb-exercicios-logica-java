package PacoteExerciciosPooDoisJava;

public class AdministradorTeste {
	public static void main(String[] args) {
		Administrador cristiane = new Administrador();
		cristiane.setNome("Cristiane");
		cristiane.setEndereco("Rua Antonio Agu");
		cristiane.setTelefone("98765432");
		cristiane.setCustoDeslocamento(80);
		cristiane.setCustoEstadia(120);
		
		System.out.println("Nome: " + cristiane.getNome());
		System.out.println("Endereço: " + cristiane.getEndereco());
		System.out.println("Telefone: " + cristiane.getTelefone());
		System.out.println("A ajuda de custo é de: " + cristiane.calcularAjudaDeCusto());
	}
	

}
