package PacoteExerciciosLogicaJava;

import java.util.Scanner;

public class ex8 {
    public static void main (String args[]) {
    	    Scanner leitura = new Scanner(System.in);
    		double custoFabrica, custoConsumidor;
    		final double porcentagemDistribuidor = 0.28;
    		final double impostos = 0.45;
    		System.out.print("Digite o custo de f�brica do carro: (ex: 15000)");
    		custoFabrica = leitura.nextDouble();
    		custoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor) + (custoFabrica * impostos);
    		System.out.println("O custo total do carro ao consumidor � de: R$" + custoConsumidor);		
    	
    }
}
