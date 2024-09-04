package ParteB;

import java.util.Scanner;

public class ParteBG{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TamanhoRoupa tamanho = TamanhoRoupa.xxg;
		switch(tamanho) {
			case pp:
				System.out.print("Seu tamanho é: " + tamanho);
				break;
			case p:
				System.out.print("Seu tamanho é: " + tamanho);
				break;
			case m:
				System.out.print("Seu tamanho é: " + tamanho);
				break;
			case g:
				System.out.print("Seu tamanho é: " + tamanho);
				break;
			case xg:
				System.out.print("Seu tamanho é: " + tamanho);
				break;
			case xxg:
				System.out.print("Seu tamanho é: " + tamanho);
				break;
		}
	} 
	enum TamanhoRoupa{
		pp,p,m,g,xg,xxg
	}
}