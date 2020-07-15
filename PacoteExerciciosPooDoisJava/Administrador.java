package PacoteExerciciosPooDoisJava;

public class Administrador extends Pessoa {
	private double ajudaDeCusto;
	private double custoDeslocamento;
	private double custoEstadia;
	
	public Administrador() {
		
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}	
	
	
	public double getCustoDeslocamento() {
		return custoDeslocamento;
	}

	public void setCustoDeslocamento(double custoDeslocamento) {
		this.custoDeslocamento = custoDeslocamento;
	}

	public double getCustoEstadia() {
		return custoEstadia;
	}

	public void setCustoEstadia(double custoEstadia) {
		this.custoEstadia = custoEstadia;
	}

	public double calcularAjudaDeCusto() {
		double calcularAjudaDeCusto = custoDeslocamento + custoEstadia;
		return calcularAjudaDeCusto;
	}
}
