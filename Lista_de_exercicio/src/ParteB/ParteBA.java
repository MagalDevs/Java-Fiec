package ParteB;
import java.util.Scanner;

public class ParteBA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Média de 3 números:");
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int num3 = scanner.nextInt();

        System.out.println(media(num1, num2, num3));
    }

    public static int media(int a, int b, int c){
        return ((a+b+c)/3);
    }
}
