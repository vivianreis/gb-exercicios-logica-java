package PacoteExerciciosPooDoisJava;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	public double salarioBase;
	public double imposto;
	
	public Empregado() {
		
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		double calcularSalario = salarioBase - (salarioBase * (imposto/100));
		return calcularSalario;
	}
	
}
