/*Ex 2 Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

package PacoteExerciciosLacoRepeticaoJava;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		int numero, numeroPar = 0, numeroImpar=0;
		
		
		for(numero = 1; numero<=10; numero++) {
			Scanner leitura = new Scanner(System.in);
			System.out.print("Digite um n�mero: ");
			numero = leitura.nextInt();
			
			if (numero%2==0) {
				numeroPar++;
				
			}else {
				numeroImpar++;	
			}		
		}
		System.out.println("O total de n�mero(s) par(es) �: " + numeroPar);
		System.out.println("O total de n�mero(s) impar(es) �: " + numeroImpar);
	}

}
