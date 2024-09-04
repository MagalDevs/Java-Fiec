package ParteB;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ParteBE{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma dia da semana(0 a 6): ");
		int ler = scanner.nextInt();
		switch(ler) {
			case 0:
				System.out.print("Domingo");
				break;
			case 1:
				System.out.print("Segunda");
				break;
			case 2:
				System.out.print("Terça");
				break;
			case 3:
				System.out.print("Quarta");
				break;
			case 4:
				System.out.print("Quinta");
				break;
			case 5:
				System.out.print("Sexta");
				break;
			case 6:
				System.out.print("Sábado");
				break;
			default:
				System.out.print("O número " + ler + " não representa um dia da semana.");
		}
	}
}