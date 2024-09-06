import java.io.File;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        String arquivo = "C:\\Users\\37046\\Desktop\\simulado.txt";
        lerArquivo(arquivo);
    }
    public static void lerArquivo(String arquivo){
        try {
            File lerArquivo = new File(arquivo);
            Scanner scanner = new Scanner(lerArquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();

        } catch(Exception e){
            System.out.println(e);
            System.out.println("Deu ruim");
        }

    }
}
