package ParteC;

import org.junit.jupiter.api.Test;

public class ParteCB {
    @Test
    public static void main(String[] args){
        double resultado = multiplica(12.98, 34.37);
        System.out.println(resultado);
    }

    public static double multiplica(double a, double b){
        double conta = a * b;
        return conta;
    }
}
