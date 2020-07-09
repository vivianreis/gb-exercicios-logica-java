/*Ex 5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
*/

package PacoteExerciciosLacoRepeticaoJava;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		double numero, somaNumero = 0, cont = 0;
		Scanner leitura = new Scanner(System.in);

		do {	
			System.out.println("Entre com um número: ");
			numero = leitura.nextDouble();
			if (numero != 0 ) {
				somaNumero = somaNumero+ numero;
				cont++;
			}
		} while (numero != 0);
		System.out.println("A soma dos número digitados é: " + somaNumero);
	}

}
