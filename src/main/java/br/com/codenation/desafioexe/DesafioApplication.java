package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(0);
		numeros.add(1);
		Integer ultimo = 0;
		Integer atual = 1;
		Integer proximo = 0;
		while (atual <= 350) {
			numeros.add(ultimo + atual);
			proximo = ultimo + atual;
			ultimo = atual;
			atual = proximo;
		}

		return numeros;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}