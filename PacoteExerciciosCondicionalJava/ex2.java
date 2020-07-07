/*Faça um programa que entre com três números e coloque em ordem crescente.*/

package PacoteExerciciosCondicionalJava;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double n1, n2, n3, primeiro = 0.0, segundo = 0.0, terceiro = 0.0;
		System.out.print("Digite um número: ");
		n1 = leitura.nextDouble();
		System.out.print("Digite um número: ");
		n2 = leitura.nextDouble();
		System.out.print("Digite um número: ");
		n3 = leitura.nextDouble();
		
		if(n1>n2 && n1>n3)
        {
            if(n2>n3)
            {
                terceiro = n1;
                segundo = n2;
                primeiro = n3;
            }
            else
            {
                terceiro = n1;
                segundo = n3;
                primeiro = n2;
            }

        }
        else if(n2>n1 && n2>n3)
        {
            if(n1>n3)
            {
                terceiro = n2;
                segundo = n1;
                primeiro = n3;
            }
            else
            {
                terceiro = n2;
                segundo = n3;
                primeiro = n1;
            }
        }
        else if(n3>n1 && n3>n2)
        {
            if(n1>n2)
            {
                terceiro = n3;
                segundo = n1;
                primeiro = n2;
            }
            else
            {
                terceiro = n3;
                segundo = n2;
                primeiro = n1;
            }
        }

        System.out.println("Os numeros em ordem crescente são: " + primeiro + ", " + segundo + ", " + terceiro);
    }

}