package ParteC;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ParteCJ{
	String meuArquivo = "C:\\Users\\1051392411001\\Desktop\\Teste.txt";
	/*
	void TesteScanner(){
		try{
			File arquivo = new File(meuArquivo);
			Scanner scanner = new Scanner(arquivo);
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

	void TesteTop(){
		try {
			List<String> linhas = Files.readAllLines(Paths.get(meuArquivo));
			linhas.forEach(System.out::println);
		} catch(Exception e) {
			System.out.println(e);
			System.out.print("Deu bom não");	
		}
	}
	*/
	
	@Test
	void TesteBuffered() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(meuArquivo));
			String linha;
			
			while((linha = reader.readLine()) != null) {
				System.out.print(linha);
			}
			reader.close();
		}catch(Exception e) {
			System.out.println(e);
			System.out.print(e);
		}
	}
}