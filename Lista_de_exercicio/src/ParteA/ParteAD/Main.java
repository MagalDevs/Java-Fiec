package ParteA.ParteAD;
import ParteA.ParteAD.Classes.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Livro> listaLivros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("A ou a - instancia um livro\nM ou m - imprime todos os livros da lista\nQ ou q - sair");
            System.out.println(":");
            String menu = scanner.next();

            switch (menu){
                case "A":
                case "a":
                    System.out.print("Digite o ISBN do livro: ");
                    String isbn = scanner.next();

                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.next();

                    System.out.print("Digite o nome do autor do livro: ");
                    String autor = scanner.next();

                    System.out.print("Digite o ano do livro: ");
                    int ano = scanner.nextInt();

                    listaLivros.add(new Livro(isbn, titulo, autor, ano));
                    break;
                case "M":
                case "m":
                    for(Livro l: listaLivros){
                        System.out.println(l);
                    }
                    break;
                case "Q":
                case "q":
                    System.out.println("Fim do Programa.");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
            if (menu == "Q" || menu == "q"){
                break;
            }
        }


    }
}
