package ParteB;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParteBF{
	public static void main(String[] args) {
		splitador("magal,devs,magal,daniel");
	}
	
	public static void splitador(String frase) {
		Set<String> listaHash = new HashSet<>();
		List<String> listaNormal = List.of(frase.split(","));
		
		for(int i = 0; i < listaNormal.size(); i++) {
			listaHash.add(listaNormal.get(i));
		}
		
		System.out.print(listaHash + " há " + listaHash.size() + " palavra(s) diferente(s).");
	}
}