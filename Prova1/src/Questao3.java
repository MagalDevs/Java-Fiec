import java.util.*;

public class Questao3 {
    public static void main(String[] args) {

        contadorPalavra("eu sou você, você é você e eu");

    }
    public static void contadorPalavra(String a){
        HashMap<String, Integer> contagem = new HashMap<>();
        List<String> listaPalavras = List.of(a.replace(",", "").split(" "));

        for (String listaPalavra : listaPalavras) {
            Integer contagemPalavra = contagem.get(listaPalavra);
            if (contagem.containsKey(listaPalavra)) {
                contagem.put(listaPalavra, contagemPalavra + 1);
            } else {
                contagem.put(listaPalavra, 1);
            }
        }

        int maiorOcorrencia = 0;
        String palavraMaiorOcorrencia = "";

        for (Map.Entry<String, Integer> entry: contagem.entrySet()) {
            if(entry.getValue() > maiorOcorrencia){
                maiorOcorrencia = entry.getValue();
                palavraMaiorOcorrencia = entry.getKey();
            }
        }

        System.out.println(contagem);
        System.out.println(palavraMaiorOcorrencia);
    }
}
