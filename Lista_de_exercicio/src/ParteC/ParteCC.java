package ParteC;

import org.junit.jupiter.api.Test;

public class ParteCC {

    @Test
    void coisado(){
        int resultant = menorNum(4, 7);
        System.out.println(resultant);
    }

    public static int menorNum(int a, int b){
        int menor;
        if(a < b){
            menor = a;
        } else menor = b;

        return menor;
    }
}
