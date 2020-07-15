package PacoteExerciciosPooDoisJava;

public class OperarioTeste {
	public static void main(String[] args) {
		Operario vania = new Operario();
		vania.setNome("Vania");
		vania.setEndereco("Rua XPTO 123");
		vania.setTelefone("44445555");
		vania.setSalarioBase(1500);
		vania.setComissao(28);
		vania.setValorProducao(90);
		
		System.out.println("Nome: " + vania.getNome());
		System.out.println("Endereço: " + vania.getEndereco());
		System.out.println("Telefone: " + vania.getTelefone());
		System.out.println("Salario Base: " + vania.getSalarioBase());
		System.out.println("Porcentagem da comissão: " + vania.getComissao());
		System.out.println("Quantidade de produção: " + vania.getValorProducao());
		System.out.println("Salario Total: " + vania.calcularSalarioTotal());
		
		
	}

}
