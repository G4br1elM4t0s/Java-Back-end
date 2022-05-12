package Colecoes;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	
	public static void main(String[] args) {
		
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Gabriel");
		usuarios.put(20, "José");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Guilherme");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios);
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Gabriel"));
		
		System.out.println(usuarios.get(1));
		System.out.println();
		//primeiro pecorrer as chaves
		
		for(int chave : usuarios.keySet()) {
				System.out.println(chave);
		}
		
		//segundo pecorrer os nomes 
		
		for(String valores: usuarios.values()) {
				System.out.println(valores);
		}
		
		
		//terceiro pecorrer os valores e as chaves
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
				System.out.print(registro.getKey() + " ==>");
				System.out.println(registro.getValue());
		}
	}
}
