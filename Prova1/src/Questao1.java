import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("Digite um número inteiro: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite um número inteiro: ");
        int numero3 = scanner.nextInt();

        lista.add(numero);
        lista.add(numero2);
        lista.add(numero3);

        System.out.println(menorNum(lista));
    }

    public static int menorNum(ArrayList<Integer> a){
        int menor = a.getFirst();

        for (int i = 0; i < a.size(); i++) {
            if(menor > a.get(i)){
                menor = a.get(i);
            }
        }
        return menor;
    }
}
