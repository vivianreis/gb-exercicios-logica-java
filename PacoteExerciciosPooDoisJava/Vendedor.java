package PacoteExerciciosPooDoisJava;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
		
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalarioTotal() {
		double calcularSalarioTotal = valorVendas + (valorVendas * (comissao/100));
		return calcularSalarioTotal;
	}

}
