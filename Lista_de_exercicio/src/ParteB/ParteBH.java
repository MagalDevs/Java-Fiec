package ParteB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParteBH{
	public static class Roupa{
		
		enum TamanhoRoupa{
			PP,P,M,G,XG,XXG
		}
		
		private TamanhoRoupa tamanho;
		private int id;
		private String modelo;
		
		public Roupa(TamanhoRoupa tamanho, int id, String modelo) {
			super();
			this.tamanho = tamanho;
			this.id = id;
			this.modelo = modelo;
		}
		
		public TamanhoRoupa getTamanho() {
			return tamanho;
		}
		public void setTamanho(TamanhoRoupa tamanho) {
			this.tamanho = tamanho;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		@Override
		public String toString() {
			return "Roupa [tamanho=" + tamanho + ", id=" + id + ", modelo=" + modelo + "]";
		}
		
		
	}
	
	public static void main(String[] args) {
		List<Roupa> listaRoupa = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		ParteB.ParteBH.Roupa.TamanhoRoupa tamanhoReal = null;
		
		System.out.print("Gostaria de Adicionar uma roupa?(s/n)");
		String verify = scanner.nextLine().toLowerCase();
		
		while(verify.equals("s")) {
			System.out.print("Digite o id da roupa: ");
			int id = scanner.nextInt();
			
			System.out.print("Digite o modelo da roupa: ");
			String modelo = scanner.next();
			
			System.out.print("Digite o tamanho da roupa: ");
			String tamanho = scanner.next().toLowerCase();
			
			switch(tamanho) {
				case "pp":
					tamanhoReal = ParteB.ParteBH.Roupa.TamanhoRoupa.PP;
					break;
				case "p":
					tamanhoReal = ParteB.ParteBH.Roupa.TamanhoRoupa.P;
					break;
				case "m":
					tamanhoReal = ParteB.ParteBH.Roupa.TamanhoRoupa.M;
					break;
				case "g":
					tamanhoReal = ParteB.ParteBH.Roupa.TamanhoRoupa.G;
					break;
				case "xg":
					tamanhoReal = ParteB.ParteBH.Roupa.TamanhoRoupa.XG;
					break;
				case "xxg":
					tamanhoReal = ParteB.ParteBH.Roupa.TamanhoRoupa.XXG;
					break;
				default:
					tamanhoReal = null;
			}
			
			
			listaRoupa.add(new Roupa(tamanhoReal, id, modelo));
			
			System.out.print("Gostaria de Adicionar uma roupa?(s/n)");
			verify = scanner.next().toLowerCase();
		}
		
		System.out.print(listaRoupa);
	}
	
	
}