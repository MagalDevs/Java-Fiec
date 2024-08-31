package ParteC;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ParteCG {
    @Test

    void Test(){
        ListaSet();
    }

    public static void ListaSet(){
        Set<Integer> lista = new HashSet<>();
        lista.add(10);
        lista.add(8);
        lista.add(10);
        lista.add(4);
        lista.add(8);

        for(Integer i: lista){
            System.out.println(i);
        }
    }
}
