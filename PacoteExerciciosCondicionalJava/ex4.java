/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/

package PacoteExerciciosCondicionalJava;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double numero;
		double resultado;
		System.out.print("Digite um n�mero: ");
		numero = leitura.nextDouble();
	
		if(numero%2!=0) {
			resultado = Math.pow(numero, 2);
			System.out.println("Este n�mero � �mpar! E " + numero + " ao quadrado �: " + resultado);
		}else {
			resultado = Math.sqrt(numero);
			System.out.println("Este n�mero � par! E a raiz quadrada de " + numero + " �: " + resultado);
		}
	}

}
