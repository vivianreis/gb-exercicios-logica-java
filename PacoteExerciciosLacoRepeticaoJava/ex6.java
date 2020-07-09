/*Ex 6 - Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/

package PacoteExerciciosLacoRepeticaoJava;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		int numero;
		double soma=0, media=0, cont=0;;
		Scanner leitura = new Scanner(System.in);
			
		do {
			System.out.print("Entre com um número inteiro: ");
			numero = leitura.nextInt();
			
			if(numero%3==0 && numero !=0 ) {
				soma = soma + numero;
				cont++;
			}
            media = soma/cont;
		}while(numero !=0);	
		System.out.println("A média dos números múltiplos de 3 é: " + media);
	}

}
