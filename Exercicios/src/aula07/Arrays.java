package aula07;

import java.util.Scanner;

import aula06.Mat;

public class Arrays {

	public static void main(String[] args) {

		// manipulandoArray();
		//calculandoSoma();
		//media();
		maiorValor();
		
	}
	

	/*gerar um array com 20 numeros ramdomicos
	 * e imprimir o maior
	 */
	
	public static void maiorValor() {
		int tamanho = 20;
		double v[] = new double[tamanho];
		System.out.print("Vetor: ");

		
		for (int i = 0; i < v.length; i++) {
			v[i] = Math.random() * 100;
			System.out.printf( "%.2f   ", v[i]);
			
		
		}
		double maior = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i]>maior) maior = v[i];
			
		}
		System.out.printf("\nMaior: %.2f " , maior);
		System.out.printf("\nMaior com o método da classe Mat = %.2f", Mat.maior(v));
		
		System.out.printf("\nMenor com o método da classe Mat = %.2f", Mat.menor(v));
		
		
		
		
		
		
		
	}
	
	
	public static void media() {
		
		Scanner sc = new Scanner(System.in);
		int tamanho = 5;
		double v[] = new double[tamanho];

		System.out.printf("Digite a sequência de %d números: ", tamanho);
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextDouble();
			
		}
		double soma = 0;
		for (double n : v) {
			soma += n;
			
		}
		System.out.println("Média = " + (soma/tamanho));
		
		
		
	}

	public static void calculandoSoma() {
		Scanner sc = new Scanner(System.in);
		int tamanho = 5;
		double v[] = new double[tamanho];

		System.out.printf("Digite a sequência de %d números: ", tamanho);
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextDouble();
		}

		double soma = 0;
		for (double n : v) {
			soma += n;
		}

		System.out.println("Soma = " + soma);
	}

	public static void manipulandoArray() {
		int num[] = new int[10];
		num[0] = 5;
		num[1] = 2;
		num[4] = 0;
		num[3] = 18;

		System.out.println("Usando o for completo ==================");
		for (int i = 0; i < num.length; i++) {

			System.out.printf("num[%d] = %2d\n", i, num[i]);
		}

		System.out.println("Usando o for each ======================");
		for (int v : num) {

			System.out.println("v = " + v);
		}

	}

	public static void variosArrays() {
		int inteiros[] = new int[10];
		long[] longs = new long[20];
		double decimais[] = new double[132];
		String nomes[] = new String[20];
		float flutuantes[];
		flutuantes = new float[17];
		int tamanho = 40;
		double[] nums = new double[tamanho];

		int preenchido[] = { 2, 3, 5, 3, 7, 90, 45 };
	}

}
