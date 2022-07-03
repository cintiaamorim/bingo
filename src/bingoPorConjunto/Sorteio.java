package bingoPorConjunto;

import java.util.Scanner;

/* se o usu�rio apertar r o sistema gera um n�mero aleat�rio entre 1 a 99, se ele apertar x o sistema se encerra e exibe os n�meros sorteados
 os n�meros sorteados n�o podem sair repetidos. */

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
				//Se a quantidade de n�meros definida no intervalo da regra para sorteio estiver chegada ao limite 
				if(bingo.qntMaxNum == true) {
					bingo.sairSorteio();
					break;			
				}
			}while(letra.equalsIgnoreCase("R"));		
	  
	}

}
