package ParteA;

public class ParteAA {
    public static void main(String[] args){
        System.out.print(pontencia(3, 10));
    }

    public static double pontencia(double base, int expoente){
        double conta = base;
        for(int i = 1; i < expoente; i++){
            conta *= base;
        }
        return conta;
    }
}
