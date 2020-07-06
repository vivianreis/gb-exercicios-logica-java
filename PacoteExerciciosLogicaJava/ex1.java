/* Exercício 1 Faça um sistema que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa apenas em dias.*/

package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex1 {
	 public static void main (String args[]) {
		 
		 Scanner leitura = new Scanner(System.in);
		 int idadeAnos, idadeMeses, idadeDias;
		 
		 System.out.print("Digite a sua idade em anos: ");
		 idadeAnos = leitura.nextInt();
		 System.out.print("Digite a sua idade em meses: ");
		 idadeMeses = leitura.nextInt();
		 System.out.print("Digite a sua idade em dias: ");
		 idadeDias = leitura.nextInt();
		 
		 idadeDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		 System.out.println("Total de dias vividos: " + idadeDias);
	 }
}
