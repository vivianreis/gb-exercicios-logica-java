/*Ex 4 Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: idade,
 *  sexo (1-feminino / 2-masculino),
 *   e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *   Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

package PacoteExerciciosLacoRepeticaoJava;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		int idade = 0, sexo = 0, personalidade = 0,cont = 0, calmo=0, nervoso=0, agressivo=0, mulherNervosa=0, homemAgressivo=0;
		Scanner leitura = new Scanner(System.in);

		while (cont >=1 && cont <= 150) {
			System.out.print("Digite a sua idade: ");
			idade = leitura.nextInt();
			System.out.print("Digite o sexo (1-feminino / 2-masculino): ");
			sexo = leitura.nextInt();
			System.out.print("Digite sua personalidade (1, se for uma pessoa calma; 2, se é uma pessoa nervosa e 3, se a pessoa é agressiva): ");
			personalidade = leitura.nextInt();
			
			if (personalidade != 2 && personalidade != 3) {
				calmo++;
			}

			if (personalidade != 1 && personalidade != 3) {
				if (sexo == 1) {
					mulherNervosa++;
				}
			}

			if (personalidade != 1 && idade != 2) {
				if (sexo == 2) {
					homemAgressivo++;
				}
			}

			if (personalidade == 2 && idade > 40) {
				nervoso++;
			}

			if (personalidade == 1 && idade < 18) {
				calmo++;
			}
			cont++;
		}
		System.out.println("O número de pessoas calmas é igual a: " + calmo);
		System.out.println("O número de mulheres nervosas é igual a: " + mulherNervosa);
		System.out.println("O número de homens agressivos é igual a: " + homemAgressivo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é de: " + nervoso);
		System.out.println("O número de pessoas calmas com menos de 18 anos é de: " + calmo);
	}

}
