package bingoPorConjunto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Bingo {
	
	boolean qntMaxNum = false;
	
	Integer numeroSorteado;
	
	Random aleatorio = new Random();
	
	Set<Integer> conjunto = new TreeSet<>();
	
	public void sortearNumero() 
	{			
			qntMaxNum = verificarLimite();
			if(qntMaxNum) {
				System.out.println("Todos os n�meros poss�veis j� foram sorteados");
			}
			else {
				numeroSorteado = aleatorio.nextInt(99) + 1;
				verificarNumeroRepetido(numeroSorteado);
			}

		}
	
	public boolean verificarLimite() {
		if(conjunto.size() == 99) {
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
	
	public void sairSorteio() {
		System.out.println("Fim do Sorteio");
		if(conjunto.isEmpty()) {
			System.out.println("Nenhum n�mero foi sorteado");
		} else if(!conjunto.isEmpty()) {
		System.out.println("Foram sorteados " + conjunto.size() + " n�mero(s)");
		System.out.println("Os n�meros sorteados s�o: " + conjunto.toString());
		}
		}
		
}
