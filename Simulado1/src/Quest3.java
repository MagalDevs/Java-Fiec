import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Quest3 {
    public static void main(String[] args) {
        String frase = "joao,pe,de,feijao,joao,pe,joao";
        separador(frase);
    }
    public static void separador(String frase){
        List<String> fraseSeparada = List.of(frase.split(","));
        HashSet<String> lista = new HashSet<>();

        for(int i = 0; i < fraseSeparada.size(); i++){
            lista.add(fraseSeparada.get(i));
        }
        System.out.println(lista);
    }
}
