package aula18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerCSV {

	private static final String ARQUIVO = "D:\\git\\JavaProgrammer\\Exercicios\\src\\aula18\\Gorjetas.CSV";

	public static void main(String[] args) {
		lerArqGorjetas();
	}

	private static void lerArqGorjetas() {
		try {
			FileReader arqEntrada = new FileReader(ARQUIVO);
			BufferedReader dados = new BufferedReader(arqEntrada);
			String linha = "";
			while (linha != null) {
				linha = dados.readLine();
				if (linha != null) {
					String[] s = linha.split(";");
					System.out.println("Total=" + s[0]
							+ "\tgorjeta="+s[1]
									+ "\tsexo" + s[2]);
				}
			}

			dados.close();
			arqEntrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
