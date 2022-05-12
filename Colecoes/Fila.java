package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		
		//Offer e Add --> adicionam elementos na fila;
		//Diferenca é o comportamento ocorre
		//quando a fila está cheia!
		
		fila.add("Gabriel"); // retorna um erro
		fila.offer("Rafael");//retorna um false
		fila.add("Daniel");
		fila.offer("Julia");
		fila.add("João");
		fila.offer("Junior");
		
		
		//Peek e Element --> obter elementos na fila
		//Diferenca é o comportamento ocorre 
		//quando a fila está vazia!
		
		
		System.out.println(fila.peek());// retorna nulo
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); //retorna um problema
		System.out.println(fila.element()); 
		
	
		
		
		//Poll e Remove --> obter o próximo elemento 
		//da fila e remove!
		
		//Difereca é o comportamento ocorre
		//quando a fila está vazia!
		
		System.out.println(fila.poll()); //retorna null 
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //lança uma exceção
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
		//fila.size();
//		fila.clear();
//		fila.isEmpty();
		//fila.contains(...)
		
	}
}
