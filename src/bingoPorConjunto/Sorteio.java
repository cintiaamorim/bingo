package bingoPorConjunto;

import java.util.Scanner;

public class Sorteio {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			String letra;

			Bingo bingo = new Bingo();	
			
			do{
				System.out.println("Digite a letra (R para sortear, X para sair)");
				letra = entrada.next();
				if(letra.equalsIgnoreCase("X")) {				
					break;
				}
				bingo.sortearNumero(); 
				if(bingo.maxLista == true) {
					break;			
				}
			}while(letra.equalsIgnoreCase("R"));		
	  
	        bingo.exibirTodosNumerosSorteados();



	}

}
