/*Ex 1: Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/

package PacoteExerciciosLacoRepeticaoJava;

public class ex1 {
	public static void main(String args[]) {
		int numero;
		
		for (numero = 1000; numero<=1999; numero++) {
			if(numero%11==5) {
				System.out.println("O(s) n�mero(s) divididos por 11 que tem resto 5 s�o: " + numero);
			}
		}
	}

}
