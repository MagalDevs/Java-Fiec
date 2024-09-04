package ParteB;

public class ParteBI{
	public static String escreveMatriz(int linha, int coluna) {
		String matriz = "";
		for(int i = 1; i <= linha; i++) {
			for(int j = 1; j <= coluna; j++) {
				matriz += "0";
			}
			matriz += "\n";
		}
		return matriz;
	}
	
	public static void main(String[] args) {
		System.out.print(escreveMatriz(5, 10));
	}
}