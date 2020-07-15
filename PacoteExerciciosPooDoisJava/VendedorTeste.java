package PacoteExerciciosPooDoisJava;

public class VendedorTeste {
	public static void main(String[] args) {
		Vendedor talita = new Vendedor();
		talita.setNome("Talita");
		talita.setEndereco("Rua Lourenço Colino");
		talita.setTelefone("34342121");
		talita.setValorVendas(2500);
		talita.setComissao(20);
		
		System.out.println("Nome: " + talita.getNome());
		System.out.println("Endereço: " + talita.getEndereco());
		System.out.println("Telefone: " + talita.getTelefone());
		System.out.println("Valor das vendas: " + talita.getValorVendas());
		System.out.println("Porcentagem da comissão: " + talita.getComissao());
		System.out.println("Valor salário total: " + talita.calcularSalarioTotal());
	}
}
