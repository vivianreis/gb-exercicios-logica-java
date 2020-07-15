package PacoteExerciciosPooDoisJava;

public class FornecedorTeste {
	public static void main(String[] args) {
		
		Fornecedor leticia = new Fornecedor();
		leticia.setNome("Nome: Leticia");
		leticia.setEndereco("Rua 3");
		leticia.setTelefone("22223333");
		leticia.setValorCredito(500);
		leticia.setValorDivida(400);
		
		System.out.println("Nome: " + leticia.getNome());
		System.out.println("Endereço " + leticia.getEndereco());
		System.out.println("Telefone " + leticia.getTelefone());
		System.out.println("Saldo: " + leticia.obterSaldo());
	}

}
