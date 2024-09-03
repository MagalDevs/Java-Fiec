package ParteB;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParteBB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> ListaNum = new ArrayList<>();

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int num3 = scanner.nextInt();

        ListaNum.add(num1);
        ListaNum.add(num2);
        ListaNum.add(num3);

        maiorNum(ListaNum);
    }

    public static void maiorNum(List<Integer> lista){
        int maiorNumero = lista.indexOf(0);
        for (Integer integer : lista) {
            if (integer > maiorNumero) {
                maiorNumero = integer;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
