package ParteS.ParteSB;

import ParteS.ParteSB.Classes.VooInternacional;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ParteSB {
    public static void main(String[] args) {
        ArrayList<VooInternacional> listaVoosInternacionais = new ArrayList<VooInternacional>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Menu:\nA ou a - Instanciar um voo internacional\nM ou m - Imprimir Voos internacionais\nS ou s - Salvar voos em um arquivo na área de trabalho\nQ ou q - sair\n::");
            String menu = scanner.next();

            switch (menu) {
                case "A":
                case "a":
                    System.out.print("Digite o ID do voo internacional: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a origem do voo: ");
                    String origem = scanner.nextLine();
                    System.out.println("");

                    System.out.print("Digite o destino do voo: ");
                    String destino = scanner.nextLine();
                    System.out.println("");

                    System.out.print("Digite a data do voo (dd/mm/yyyy): ");
                    String data = scanner.nextLine();
                    System.out.println("");

                    System.out.print("Digite a escala do voo: ");
                    String escala = scanner.nextLine();

                    listaVoosInternacionais.add(new VooInternacional(id, origem, destino, data, escala));
                    break;
                case "M":
                case "m":
                    for (int i = 0; i < listaVoosInternacionais.size(); i++) {
                        System.out.println(listaVoosInternacionais.get(i).toString());
                    }
                    break;
                case "S":
                case "s":
                    try {
                        String caminho = System.getenv("HOMEPATH") + "\\OneDrive\\Área de Trabalho\\my-flights.txt";
                        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho));

                        for(int i = 0; i < listaVoosInternacionais.size(); i++) {
                            writer.write(listaVoosInternacionais.get(i).toString());
                            writer.newLine();
                        }
                        writer.close();

                        System.out.println("Voos Salvos com Sucesso.");
                    }catch (Exception e){
                        System.out.println("Houve um Problema ao Salvar");
                        System.out.println("erro:" + e);
                    }
                    break;
                case "Q":
                case "q":
                    System.out.println("Fim do Programa.");
                    break;
                default:
                    System.out.println("Comando inválido, Digite novamente.");
                    break;
            }

            if (menu.equals("Q") || menu.equals("q")){
                break;
            }
        }


    }
}
