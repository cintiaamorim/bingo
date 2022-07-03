package bingoPorConjunto;

import java.util.Scanner;

/* se o usuário apertar r o sistema gera um número aleatório entre 1 a 99, se ele apertar x o sistema se encerra e exibe os números sorteados
 os números sorteados não podem sair repetidos. */

public class Sorteio {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			String letra;

			Bingo bingo = new Bingo();	
			
			do{
				System.out.println("Digite a letra (R para sortear, X para sair)");
				letra = entrada.next();
				if(letra.equalsIgnoreCase("X")) {
					bingo.sairSorteio();
					break;
				}
				bingo.sortearNumero();
				//Se a quantidade de números definida no intervalo da regra para sorteio estiver chegada ao limite 
				if(bingo.qntMaxNum == true) {
					bingo.sairSorteio();
					break;			
				}
			}while(letra.equalsIgnoreCase("R"));		
	  
	}

}
