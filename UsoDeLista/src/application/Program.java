package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
/* 0 */		list.add("Maria");
/* 1 */		list.add("Alex");
/* 2 */		list.add("Bob");
/* 3 */		list.add("Ana");
			list.add(2, "Marco"); // Na posi��o de index 2, adicionar Marco   
		
		System.out.println(list.size());
		
		
		for (String x : list) { //Para cada String x pertencente a minha lista fazer 
			System.out.println(x);
		}
		
		System.out.println("============================");
		
		list.remove("Ana"); //Essa fun��o compara o valor que foi iniciado aqui com o valor de outra instancia 
		list.remove(1);
		
		list.removeIf(x -> x.charAt(0) == 'M'); /*Remove algo caso se encaixe na fun��o lambda provida
												onde essa em particular se chama predicado  */
		
		for (String x : list) { 
			System.out.println(x);
		}
		
		System.out.println("============================");
		
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		System.out.println("Index of Maria " + list.indexOf("Maria")); //retorna -1 caso n�o exista
		
		System.out.println("============================");
		
		list.add("Jose");
		list.add("Joaquim");
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		/* O stream permite uma fun��o lambda ser utilizada, porem, stream n�o � compativel com list
		 portanto � necessario chamar uma outra fun��o que converte esse stream para uma lista */
		 
		for (String x : result) { 
			System.out.println(x);
		}
		
		System.out.println("============================");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		/*Stream permite o uso do predicado
		 * findFirst retorna o primeiro resultado a se encaixar na fun��o
		 * orElse retorna nulo caso nenhum resultado se encaixe nos requisitos da fun��o lambda 
		 */
		
		System.out.println(name);
		
	}
}
