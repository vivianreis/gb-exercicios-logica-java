/* Exerc�cio 5 Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/

package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex5 {
	public static void main(String args[]) {
		
		Scanner leitura = new Scanner(System.in);
		double  nota1, nota2, nota3, mediaFinal;
		final double pesoNota1 = 2;
		final double pesoNota2 = 3;
		final double pesoNota3 = 5;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leitura.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leitura.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leitura.nextDouble();
		
		mediaFinal = ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3))/10;
		System.out.println("A m�dia final do aluno(a) �: " + mediaFinal);
		
	}

}
