/* Exerc�cio 2 - Fa�a um sistema que leia a idade de uma pessoa expressa em dias 
e mostre-a expressa em anos, meses e dias.*/

package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) {
		
		int idadeAnos, idadeMeses, idadeDias;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		idadeDias = leitura.nextInt();
		
		idadeAnos = idadeDias / 365;
		idadeMeses = (idadeDias%365)/30;
		idadeDias = (idadeDias%365)%30;
		
		System.out.println("A idade em anos �: " + idadeAnos + "anos");
		System.out.println("A idade em meses �: " + idadeMeses + "meses");
		System.out.println("A idade em dias �: " + idadeDias + "dias");
	}

}
