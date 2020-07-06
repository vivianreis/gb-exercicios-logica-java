package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex3 {
	public static void main(String args[]) {
		int tempoSegundos, tempoHoras, tempoMinutos;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o tempo do evento da fábrica expresso em segundos: ");
		tempoSegundos = leitura.nextInt();
		
		tempoHoras = tempoSegundos / 3600;
		tempoMinutos = tempoSegundos /60;
		
		System.out.println("O tempo expresso em horas é de: " + tempoHoras + " hora(s)");
		System.out.println("O tempo expresso em minutos é de: " + tempoMinutos + " minutos(s)");
		System.out.println("O tempo expresso em segundos é de: " + tempoSegundos + " segundos(s)");
	}

}
