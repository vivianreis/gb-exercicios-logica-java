package PacoteExerciciosPooDoisJava;

public class EmpregadoTeste {
	
	public static void main(String[] args) {
		Empregado vivian = new Empregado();
		vivian.setNome("Vivian");
		vivian.setEndereco("Rua Ouro Fino");
		vivian.setTelefone("12345678");
		vivian.setCodigoSetor(0001);
		vivian.setSalarioBase(5000);
		vivian.setImposto(6);
		
		System.out.println("Nome: " + vivian.getNome());
		System.out.println("Endere�o: " + vivian.getEndereco());
		System.out.println("Telefone: " + vivian.getTelefone());
		System.out.println("C�digo do setor: " + vivian.getCodigoSetor());
		System.out.println("Calculo do sal�rio com descontos de impostos: " + vivian.calcularSalario());
	}
     
}
