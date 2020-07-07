/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package PacoteExerciciosCondicionalJava;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Digite um número inteiro: ");
		n1 = leitura.nextInt();
		System.out.print("Digite um número inteiro: ");
		n2 = leitura.nextInt();
		System.out.print("Digite um número inteiro: ");
		n3 = leitura.nextInt();
		
		if (n1 > n2 && n1 > n3){
			System.out.println("O maior valor é:" + n1);
		}
		if (n2 > n1 && n2 > n3) {
			System.out.println("O maior valor é: " + n2);
		}
		if (n3 > n1 && n3 > n2) {
			System.out.println("O maior valor é: " + n3);
		}
	}

}
