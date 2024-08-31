package ParteC;

import org.junit.jupiter.api.Test;

public class ParteCA {
    @Test
    public static void main(String[] args) {
        int resultadoSubtracao = Subtracao(18,12);
        System.out.println(resultadoSubtracao);
    }

    public static int Subtracao(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
}
