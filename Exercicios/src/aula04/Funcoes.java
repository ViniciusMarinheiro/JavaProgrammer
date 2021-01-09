package aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcoes {

	public static void main(String[] args) {

		//passar pra JOption
		//String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro Número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Segundo Número: ");
		int num2 = sc.nextInt();

		int total = soma(num1, num2);

		System.out.println("A soma é igual a " + total);
		System.out.println("A diferença é igual a " + diferenca(num1, num2));
		
		System.out.println("Dia da semana do primeiro número: " + nomeDoDia(num1));
		System.out.println("Dia da semana do segundo número: " + nomeDoDia(num2));
		

	}

	public static String nomeDoDia(int dia) {

		switch (dia) {
		case 1:
			return ("Domingo");
		case 2:
			return ("Segunda-feira");

		case 3:
			return ("Terça-feira");

		case 4:
			return ("Quarta-feira");

		case 5:
			return ("Quinta-feira");

		case 6:
			return ("Sexta-feira");

		case 7:
			return ("Sábado");

		default:
			return ("Número inválido!");

		}

	}

	public static int soma(int n1, int n2) {
		int total = n1 + n2;
		return total;

	}

	public static int diferenca(int n1, int n2) {
		int dif;
		if (n1 > n2) {
			dif = n1 - n2;
		} else {
			dif = n2 - n1;
		}
		return dif;
	}
	

}
