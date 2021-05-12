package aula18;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException; 

import org.apache.poi.xwpf.usermodel.XWPFDocument; 


public class ArquivoTexto {

	private static final String ARQUIVO = "D:\\Users\\vinic\\Desktop\\Arquivo.txt";
	private static final String TEXTO = "Teste";
	private static String extensao;
	private static ByteArrayOutputStream saida;

	public static void main(String[] args) {
		gravaArquivo();
		// lerArquivo();
		// lerByte();
		extrairCarta();
	}
	public static void extrairCarta() {
		
	    //File outputfile = new File("SampleProcessed.docx");
	    System.out.println("P01");
        
		//XWPFDocument documento = new XWPFDocument();
		
		try {
		    String caminhoArquivoTemplate = "D:\\Desenvolvimento\\Workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp3\\wtpwebapps\\BebSystem\\resources\\modeloCarta\\Modelo.docx";
		    
		    System.out.println("P02.1");
		    
			File arquivoTemplate = new File(caminhoArquivoTemplate);
			
		    System.out.println("P02.2" + arquivoTemplate.toString());
		    
			
			FileInputStream bytesArquivoTemplate = new FileInputStream(arquivoTemplate.getAbsolutePath());
		    System.out.println("P02.3" + bytesArquivoTemplate.toString());

		    
			XWPFDocument documento = new XWPFDocument(bytesArquivoTemplate);
			//XWPFDocument documento = new XWPFDocument();
		    System.out.println("P03");
	    
		    System.out.println("P03");
			saida = new ByteArrayOutputStream();
		    System.out.println("P04");

			documento.write(saida);
		    System.out.println("P05");
			documento.close();
		    System.out.println("P06");
			extensao = ".docx";
		    System.out.println("P07");
			
		    //ZipAdicionar();
		    System.out.println("P08");
			saida.close();
		    System.out.println("P09");

		} catch (IOException ex) {
			//JSFUtil.adicionarMensagemErro("Falha na extração de Carta " + ex.getMessage());
			System.out.println("erro " + ex);
		}
	}
	
	
	public static void lerComBufferedReader() {
		try {
			FileReader arqEntrada = new FileReader(ARQUIVO);
			BufferedReader dados = new BufferedReader(arqEntrada);
			String linha = "";
			while (linha != null) {
				linha = dados.readLine();
				if (linha != null) System.out.println(linha);
			}
			dados.close();

			arqEntrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void lerByte() {

		try {
			FileInputStream arqEntrada;
			arqEntrada = new FileInputStream(ARQUIVO);
			DataInputStream dados = new DataInputStream(arqEntrada);
			while (true) {
				char c = dados.readChar();
				System.out.print(c);
			}

		} catch (IOException e) {
			System.out.println("\n***************  Fim do arquivo  ***************");
		}

	}

	public static void lerArquivo() {

		try {
			FileInputStream arqEntrada = new FileInputStream(ARQUIVO);
			DataInputStream dados = new DataInputStream(arqEntrada);
			String texto = dados.readLine();
			System.out.println(texto);
			dados.close();
			arqEntrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void gravaArquivo() {
		try {
			FileOutputStream arqSaida = new FileOutputStream(ARQUIVO);
			DataOutputStream dados = new DataOutputStream(arqSaida);
			dados.writeBytes(TEXTO);
			dados.close();
			arqSaida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
