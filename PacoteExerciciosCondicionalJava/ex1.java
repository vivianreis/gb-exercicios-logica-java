/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

package PacoteExerciciosCondicionalJava;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Digite um n�mero inteiro: ");
		n1 = leitura.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		n2 = leitura.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		n3 = leitura.nextInt();
		
		if (n1 > n2 && n1 > n3){
			System.out.println("O maior valor �:" + n1);
		}
		if (n2 > n1 && n2 > n3) {
			System.out.println("O maior valor �: " + n2);
		}
		if (n3 > n1 && n3 > n2) {
			System.out.println("O maior valor �: " + n3);
		}
	}

}
