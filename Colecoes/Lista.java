package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main( String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario user1= new Usuario("Gabriel");
		lista.add(user1);
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Guilherme"));
		lista.add(new Usuario("Henrique"));
		lista.add(new Usuario("Rafael"));
		lista.add(new Usuario("Pedro"));
		
		System.out.println(lista);
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
	}
}
