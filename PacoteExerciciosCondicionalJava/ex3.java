/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/

package PacoteExerciciosCondicionalJava;

import java.util.Scanner;

public class ex3 {
	public static void main (String args[]) {
		Scanner leitura = new Scanner(System.in);
		int idade;
		System.out.print("Digite a idade da pessoa: ");
		idade = leitura.nextInt();
		
		if (idade >=10 && idade <=14) {
			System.out.println("Categoria Infantil");
		}
		if (idade >=15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		}
		if(idade >=18 && idade<= 25) {
			System.out.println("Categoria Adulto");
		} 
	}
}
