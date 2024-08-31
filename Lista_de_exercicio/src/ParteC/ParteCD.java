package ParteC;

import org.junit.jupiter.api.Test;

public class ParteCD {

    @Test
    void Result(){
        String resultado = menorString("vai tomar no cu", "piranha");
        System.out.println(resultado);
    }

    public static String menorString(String a, String b){
        int tamanho = a.length();
        int tamanhob = b.length();

        if(tamanho < tamanhob){
            return a;
        } else {
            return b;
        }

    }
}
