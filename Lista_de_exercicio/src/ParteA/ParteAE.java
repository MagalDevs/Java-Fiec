package ParteA;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class ParteAE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int colunas = scanner.nextInt();

        String matrix = matrix(linhas, colunas);
        salvarCoiso(matrix);
    }
    public static String matrix(int rows, int collumn){
        String matrixValores = "";
        Random random = new Random();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < collumn; j++) {
                int num = random.nextInt(10);
                matrixValores += "" + num;
            }
            matrixValores += "\n";
        }
        return matrixValores;
    }

    public static void salvarCoiso(String matrix){
        String caminho = System.getenv("HOMEPATH") + "\\OneDrive\\Área de Trabalho\\matrixTeste.txt";//C:\Users\Daniel\OneDrive\Área de Trabalho
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminho));

            writer.write(matrix);
            writer.close();

            System.out.println("Salvo com sucesso");
        }catch (Exception e){
            System.out.println("error: "+ e);
            System.out.println("Deu erro ao salvar");
        }

    }
}
