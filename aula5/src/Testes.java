import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.util.List;

public class Testes {

    @Test
    void test_split(){
        String alunos = "Marcos Felipe Lucas Vitor";
        List<String> ListaAlunos = List.of(alunos.split(""));
        System.out.println(ListaAlunos.get(0));
        System.out.println(ListaAlunos.get(0));
    }

    @Test
    void test_join(){
        List<String> numeros = List.of("3", "8", "9", "12", "4", "-1", "14", "4");
        String texto = String.join("|| ", numeros);
        System.out.println(texto);
    }

    @Test
    void test_operadores_String(){
        String email = "Joao@pedefeijao.com";
        System.out.println(email.contains("Joao"));
        System.out.println(email.indexOf("@"));
        System.out.println(email.indexOf("!"));
    }

    @Test
    void test_operadores_extras_string(){
        String textoFeliz = " Eu sou um texto feliz.";
        System.out.println(textoFeliz.trim());
    }

    @Test
    void test_replace(){
        String texto = "Jose senhor do aneis";

    }
}
