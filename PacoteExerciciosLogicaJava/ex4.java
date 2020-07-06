/*Exercício 4 - Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
 *  e calcule a seguinte expressão: */

package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex4 {
	public static void main (String srgs[]) {
		int a, b,c;
		double r,s,d;
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Escreva um número inteiro positivo: ");
		a = leitura.nextInt();
		
		System.out.print("Escreva um número inteiro positivo: ");
		b = leitura.nextInt();
		
		System.out.print("Escreva um número inteiro positivo: ");
		c = leitura.nextInt();
		
	    r = Math.pow((a+b), 2);	    
	    s = Math.pow((b+c), 2);
	    d = (r + s)/2;
	    
	    System.out.println("R = " + r);
	    System.out.println("S = " + s);
	    System.out.println("D = " + d);
	    
	}

}
