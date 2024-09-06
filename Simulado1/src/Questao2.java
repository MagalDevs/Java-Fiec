import java.util.ArrayList;
import java.util.List;

public class Questao2 {
    public static void main(String[] args) {
        Listas();
    }
    public static void Listas(){
        int soma = 0;
        try {
            List<Integer> lista = List.of(10, 8, 1, 4, 5, 9, 17, 14, 18, 28);
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 == 0) {
                    soma += lista.get(i);
                }
            }
            System.out.println(soma);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
