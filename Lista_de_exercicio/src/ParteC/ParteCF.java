package ParteC;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ParteCF {
     @Test
    void Prompt(){
        Lista2();
     }

     public static void Lista2(){
         List<Integer> listinha = List.of(10, 8, 1, 4, 5);

         for (Integer i : listinha) {
             System.out.println(i);
         }
     }
}
