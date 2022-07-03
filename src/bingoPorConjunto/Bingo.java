package bingoPorConjunto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Bingo {
	
	boolean qntMaxNum = false;
	
	Integer numeroSorteado;
	
	Random aleatorio = new Random();
	
	Set<Integer> conjunto = new TreeSet<Integer>();
	
	public void sortearNumero() 
	{			
			qntMaxNum = verificarLimite(false);
			if(qntMaxNum == true) {
				System.out.println("Todos os números possíveis já foram sorteados");
			}
			else if(qntMaxNum == false) {
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
		System.out.println("Número sorteado:" + numeroSorteado);
		
	}
	
	public void sairSorteio() {
		System.out.println("Fim do Sorteio");
		if(conjunto.isEmpty()) {
			System.out.println("Nenhum número foi sorteado");
		} else if(!conjunto.isEmpty()) {
		System.out.println("Foram sorteados " + conjunto.size() + " número(s)");
		System.out.println("Os números sorteados são: " + conjunto.toString());
		}
		}
		
}
