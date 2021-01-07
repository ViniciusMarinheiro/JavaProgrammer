package aula02;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// soma();
		// converte();
		// calculaSalarioBruto();
		calculaSalarioLiquido();

	}

	/*
	 * Fa�a uma rotina que leia o nome do desenvolvedor, o valo da hora e a
	 * quantidade de horas trabalhadas, o percentual do IRF e imprima o sal�rio
	 * liquido do desenvolvedor
	 */

	public static void calculaSalarioLiquido() {

		double valorBruto = retornaSalarioBruto();
		Scanner sc = new Scanner(System.in);
		System.out.print("Percentual do IRF: ");
		double irf = sc.nextDouble();
		double valorIRF = valorBruto * irf / 100;
		double valorLiquido = valorBruto - valorIRF;
		System.out.println("Sal�rio Bruto: R$" + valorBruto);
		System.out.println("Valor IRF: R$" + valorIRF);
		System.out.println("Sal�rio Liquido R$: " + valorLiquido);
		
	}
	
	public static double retornaSalarioBruto() {

		Scanner input = new Scanner(System.in);
		String nome;
		int hora;
		double valorHora;
		

		System.out.print("Digite o nome do desenvolvedor: ");
		nome = input.nextLine();

		System.out.print("Digite o valor da hora trabalhada em reais: ");
		valorHora = input.nextDouble();

		System.out.print("Digite a quatidade de horas trabalhadas: ");
		hora = input.nextInt();

		//input.close();
		
		return(valorHora * hora);

		

		
	}

	/*
	 * Fa�a uma rotina que leia o nome do desenvolvedor, o valo da hora e a
	 * quantidade de horas trabalhadas e imprima o sal�rio total do desenvolvedor
	 */
	public static void calculaSalarioBruto() {

		Scanner input = new Scanner(System.in);
		String nome;
		int hora;
		int valorHora;
		double salarioBruto;

		System.out.print("Digite o nome do desenvolvedor: ");
		nome = input.nextLine();

		System.out.print("Digite o valor da hora trabalhada em reais: ");
		valorHora = input.nextInt();

		System.out.print("Digite a quatidade de horas trabalhadas: ");
		hora = input.nextInt();

		salarioBruto = valorHora * hora;
		
		System.out.println(nome + " - " + "R$" +salarioBruto);

		input.close();

		
	}

	/*
	 * Ler um a temperatura em graus celcius e imprimir o valor correspondente em
	 * graus fahrenheit e kelvin �F = �C * 1,8 + 32 �K = �C + 273,15
	 */
	public static void converte() {

		Scanner input = new Scanner(System.in);

		double temperatura;

		System.out.print("Digite a temperatura em Graus Celcius: ");
		temperatura = input.nextDouble();

		System.out.println("A temperatura em Graus Fahrenheit � " + (temperatura * (9.0 / 5) + 32) + " �F");
		System.out.println("E a temperatura em Graus Kelvin � " + (temperatura + 273.15) + " K");

		input.close();

	}

	/*
	 * Ccrie uma rotina que leia dois numeros inteiros e imprima a soma dos numeros
	 */
	public static void soma() {

		Scanner input = new Scanner(System.in);
		int n1;
		int n2;

		System.out.print("Insira o primeiro n�mero: ");
		n1 = input.nextInt();

		System.out.print("Insira o segundo n�mero: ");
		n2 = input.nextInt();

		System.out.println("A soma dos n�meros digitados � igual a " + (n1 + n2));

		input.close();

	}

}
