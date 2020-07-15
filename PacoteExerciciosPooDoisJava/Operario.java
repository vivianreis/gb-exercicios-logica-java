package PacoteExerciciosPooDoisJava;

public class Operario extends Pessoa {
	public double valorProducao;
	public double comissao;
	public double salarioBase;
	
	public Operario() {
		
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calcularSalarioTotal() {
		double calcularSalarioTotal = salarioBase + (valorProducao * (comissao/100));
		return calcularSalarioTotal;
	}
}
