package ParteC;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ParteCE {

    @Test
    void Coisinho(){
        lista();
    }

    public static void lista(){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(8);
        lista.add(1);
        lista.add(4);
        lista.add(5);
        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
}
