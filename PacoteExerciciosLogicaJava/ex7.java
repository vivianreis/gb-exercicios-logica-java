package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex7 {
	public static void main (String args[]) {
		Scanner leitura = new Scanner(System.in);		
		double a, b, c, d, e, f, x, y;
		System.out.print("Entre com o valor de A: ");
		a = leitura.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = leitura.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = leitura.nextDouble();
		System.out.print("Entre com o valor de D: ");
		d = leitura.nextDouble();
		System.out.print("Entre com o valor de E: ");
		e = leitura.nextDouble();
		System.out.print("Entre com o valor de F: ");
		f = leitura.nextDouble();
		
		x = Math.round(((c*e)-(b*f))/ ((a*e)-(b*d)));
		y = ((a*f)-(c*d))/ ((a*e)-(b*d));
		
		System.out.println("O valor de X foi de: " + x);
		System.out.println("O valor de Y foi de: " + y);
		
	}

}
