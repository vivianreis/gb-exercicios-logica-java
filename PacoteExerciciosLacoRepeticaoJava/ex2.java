/*Ex 2 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package PacoteExerciciosLacoRepeticaoJava;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		int numero, numeroPar = 0, numeroImpar=0;
		
		
		for(numero = 1; numero<=10; numero++) {
			Scanner leitura = new Scanner(System.in);
			System.out.print("Digite um número: ");
			numero = leitura.nextInt();
			
			if (numero%2==0) {
				numeroPar++;
				
			}else {
				numeroImpar++;	
			}		
		}
		System.out.println("O total de número(s) par(es) é: " + numeroPar);
		System.out.println("O total de número(s) impar(es) é: " + numeroImpar);
	}

}
