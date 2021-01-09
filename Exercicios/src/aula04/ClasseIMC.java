
package aula04;

import java.util.Scanner;

public class ClasseIMC {

	/*
	 * entrada dos dados: nome, altura, peso saída: índice IMC e a classificação
	 */
	public static void main(String[] args) {
		String nome;
		double altura;
		double peso;
		double imc;
		String classe;

		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		nome = sc.nextLine();

		System.out.print("Altura: ");
		altura = sc.nextDouble();

		System.out.print("Peso: ");
		peso = sc.nextDouble();

		imc = peso / (altura * altura);
		classe = classeIMC(imc);

		System.out.println("Seu IMC é " + imc);
		System.out.println("Sua Classificação é " + classe);

	}

	/*
	 * classeIMC: recebe o índice IMC e retorna a classificação param: imc : double
	 * - índice imc a ser classificado return: string contendo a classificação
	 * conforme tabela
	 */
	public static String classeIMC(double imc) {
		if (imc < 18.5) return "Peso baixo";
		else if (imc <= 24.9) return "Peso normal";
		else if (imc <= 29.9) return "Sobre peso";
		else if (imc <= 34.9) return "Obesidade - Grau 1";
		else if (imc <= 39.9) return "Obesidade Severa - Grau 2";
		else return "Obesidade Mórbida - Grau 3";
		
		
		
	}
}
