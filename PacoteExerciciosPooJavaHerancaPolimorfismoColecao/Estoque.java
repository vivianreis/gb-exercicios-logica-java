package PacoteExerciciosPooJavaHerancaPolimorfismoColecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque {
	public static void main(String[] args) {
		Collection<String> estoque = new <String> ArrayList();
		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Carne");
		
		System.out.println("Dados adicionados: " + estoque);
		
		//Remover dados
		estoque.remove("Arroz");
		System.out.println("Dados sem Arroz: " + estoque);
		
		//Atualizar dados
		Collection<String> estoque1 = Arrays.asList("Macarrão");
		estoque.addAll(estoque1);
		System.out.println("Dados atualizados estoque: " + estoque);	
		
		//Apresentar
		//for(String estoquinho : estoque) { // o for ele mostra um embaixo do outro.
			System.out.println("Apresentação dos dados: " + estoque);
		//}
	}
}
