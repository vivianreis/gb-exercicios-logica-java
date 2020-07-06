/*Exercicio 6 Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1, y1) e P(x2, y2),
escreva a distância entre eles. 
A fórmula que efetua tal cálculo é: */

package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex6 {
	public static void main(String args []) {
		Scanner leitura = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1,p2, d;
		System.out.print("Digite o ponto x1: ");
		x1 = leitura.nextDouble();
		System.out.print("Digite o ponto y1: ");
		y1 = leitura.nextDouble();
		System.out.print("Digite o ponto x2: ");
		x2 = leitura.nextDouble();
		System.out.print("Digite o ponto y2: ");
		y2 = leitura.nextDouble();
		
		p1 = Math.pow((x2-x1), 2);
		p2 = Math.pow((y2-y1), 2);
		d = Math.sqrt(p1 + p2);
		System.out.println("D = " + d);
		
	}

}
