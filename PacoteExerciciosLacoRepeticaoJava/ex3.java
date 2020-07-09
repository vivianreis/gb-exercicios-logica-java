/*Ex 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
*/

package PacoteExerciciosLacoRepeticaoJava;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		int idade, cont, maisIdade=0, menosIdade=0;
		Scanner leitura = new Scanner(System.in);
		System.out.print("Entre com a idade: " );
		idade = leitura.nextInt();
		
		while(idade != -99) {
			if (idade < 21) {
				menosIdade++;
			}
			if (idade > 50) {
				maisIdade++;
			}
			System.out.print("Entre com a idade: ");
			idade = leitura.nextInt();
		}
		System.out.println("Temos: " + menosIdade + " pessoa(s) com menos de 21 anos");
		System.out.println("Temos: " + maisIdade + " pessoa(s) com mais de 50 anos");
	}

}
