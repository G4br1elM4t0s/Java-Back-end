package Colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> user = new HashSet<>();
		
		user.add(new Usuario("Gabriel"));
		user.add(new Usuario("Rafael"));
		user.add(new Usuario("João"));
		user.add(new Usuario("José"));
		user.add(new Usuario("Jailton"));
		
		boolean resultado = user.contains(new Usuario("Gabriel"));
		System.out.println(resultado);
	}
}
