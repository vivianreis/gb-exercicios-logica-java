package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[]) {
		int tempoSegundos, tempoHoras, tempoMinutos;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o tempo do evento da f�brica expresso em segundos: ");
		tempoSegundos = leitura.nextInt();
		
		tempoHoras = tempoSegundos / 3600;
		tempoMinutos = tempoSegundos /60;
		
		System.out.println("O tempo expresso em horas � de: " + tempoHoras + " hora(s)");
		System.out.println("O tempo expresso em minutos � de: " + tempoMinutos + " minutos(s)");
		System.out.println("O tempo expresso em segundos � de: " + tempoSegundos + " segundos(s)");
	}

}
