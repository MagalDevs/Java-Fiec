package ParteS;

import java.util.Scanner;

public class ParteSC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números de Fibonacci quer ver: ");
        int n = scanner.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        if (n < 0){
            System.out.println("número invalido");;
        } else if (n == 0) {
            System.out.println("0");
        }

        int fib1 = 0, fib2 = 1, fib3;

        for (int i = 0; i <= n; i++){
            System.out.print(fib1 + " ");
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
