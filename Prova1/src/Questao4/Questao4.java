package Questao4;

import Questao4.Classe.Aluno;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("B ou b - instancia aluno\nM ou m - imprime alunos\nS ou s - salva alunos na area de trabalho\nQ ou q - sair\n::");
            String menu = scanner.next();

            switch (menu.toLowerCase()) {
                case "B":
                case "b":
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.next();
                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o RM do aluno: ");
                    int rm = scanner.nextInt();

                    listaAluno.add(new Aluno(nome, idade, rm));
                    break;

                case "M":
                case "m":
                    for (Aluno aluno : listaAluno) {
                        System.out.println(aluno);
                    }
                    break;

                case "S":
                case "s":
                    try {
                        String caminho = System.getenv("HOMEPATH") + "\\Desktop\\prova1.txt";
                        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho));
                        for (Aluno aluno : listaAluno) {
                            writer.write(String.valueOf(aluno));
                            writer.newLine();
                        }
                        writer.close();
                    }catch (Exception e){
                        System.out.println("Deu ruim.");
                        System.out.println("error: " + e);
                    }
                    break;

                case "Q":
                case "q":
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

            if (menu.equals("Q") || menu.equals("q")) {
                break;
            }
        }
    }
}
