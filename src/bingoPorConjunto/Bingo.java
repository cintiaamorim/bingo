package bingoPorConjunto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Bingo {
	
	boolean maxLista = false;
	
	Integer numeroSorteado;
	
	Random aleatorio = new Random();
	
	Set<Integer> conjunto = new TreeSet<Integer>();
	
	public void sortearNumero() 
	{			
			maxLista = verificarLimite(false);
			if(maxLista == true) {
				System.out.println("Todos os n�meros poss�veis j� foram sorteados");
			}
			else if(maxLista == false) {
				numeroSorteado = aleatorio.nextInt(5) + 1;
				verificarNumeroRepetido(numeroSorteado);
			}

		}
	
	public boolean verificarLimite(boolean checkLimite) {
		if(conjunto.size() == 5) {
			return true;
	}
			return false;
	}
	
	public void verificarNumeroRepetido(Integer numeroSorteado) {
		if(conjunto.isEmpty()) {
			exibirNumeroSorteado();
		} 
		else if(!conjunto.contains(numeroSorteado)) {
			exibirNumeroSorteado();				
		} else {
			sortearNumero();
		}
	}
	
	public void exibirNumeroSorteado() {
		conjunto.add(numeroSorteado);
		System.out.println("N�mero sorteado:" + numeroSorteado);
		
	}

	
	public void exibirTodosNumerosSorteados() {
		System.out.println("Fim do Sorteio");
		if(conjunto.isEmpty()) {
			System.out.println("Nenhum n�mero foi sorteado");
		} else if(!conjunto.isEmpty()) {
		System.out.println("Foram sorteados " + conjunto.size() + " n�mero(s)");
		System.out.println("Os n�meros sorteados s�o: " + conjunto.toString());
		}
		}

}
