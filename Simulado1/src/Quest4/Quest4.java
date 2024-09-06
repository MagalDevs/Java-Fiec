package Quest4;
import Quest4.Classe.Obras;
import java.util.ArrayList;
import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        ArrayList<Obras> listaObras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("A ou a - instancia uma obra\nM ou m - imprime todos as obras da lista\nQ ou q - sair");
            String menu = scanner.next();

            switch (menu) {
                case "A":
                case "a":
                    System.out.print("Digite o id da obra: ");
                    String id = scanner.next();
                    System.out.println("");

                    System.out.print("Digite o nome da obra: ");
                    String nome = scanner.next();
                    System.out.println("");

                    System.out.print("Digite a autoria da obra: ");
                    String autoria = scanner.next();
                    System.out.println("");

                    System.out.print("Digite o ano de alocamento da obra: ");
                    int ano = scanner.nextInt();
                    listaObras.add(new Obras(id, nome, autoria, ano));
                    break;

                case "M":
                case "m":
                    for (Obras obra : listaObras) {
                        System.out.println(obra);
                    }
                    System.out.println("");
                    break;

                case "Q":
                case "q":
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
            if (menu.equals("Q") || menu.equals("q")){
                break;
            }
        }
    }
}
