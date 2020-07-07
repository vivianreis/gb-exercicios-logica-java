/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/

package PacoteExerciciosCondicionalJava;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double numero;
		double resultado;
		System.out.print("Digite um número: ");
		numero = leitura.nextDouble();
	
		if(numero%2!=0) {
			resultado = Math.pow(numero, 2);
			System.out.println("Este número é ímpar! E " + numero + " ao quadrado é: " + resultado);
		}else {
			resultado = Math.sqrt(numero);
			System.out.println("Este número é par! E a raiz quadrada de " + numero + " é: " + resultado);
		}
	}

}
