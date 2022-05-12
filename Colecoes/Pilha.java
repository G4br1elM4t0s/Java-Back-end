package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		
		livros.add("O pequeno Princepe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String u: livros) {
			System.out.println("o livro " + u);
		}
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.size());
		System.out.println("removeu " + livros.poll());
		System.out.println("removeu " + livros.poll());
		System.out.println("removeu " + livros.poll());
		System.out.println(livros.poll());
		
		
		
		System.out.println(livros.size());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
		
	}
}
