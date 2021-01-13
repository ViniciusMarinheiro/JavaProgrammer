package aula06;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {

		/*
		 * String nome = JOptionPane.showInputDialog("Digite seu nome: "); String str =
		 * JOptionPane.showInputDialog("Digite a quantidade de vezes para imprimir: ");
		 * int qtde = Integer.parseInt(str);
		 * 
		 * repeteNome(nome, qtde);
		 */

		/*
		 * String str =
		 * JOptionPane.showInputDialog("Digite um número para saber sua tabuada: "); int
		 * num = Integer.parseInt(str); tabuada(num);
		 */

		/*
		 * String str = JOptionPane.showInputDialog("Soma até:"); int num =
		 * Integer.parseInt(str); soma(num);
		 */
		String str = JOptionPane.showInputDialog("Multiplicar até:");
		int num = Integer.parseInt(str);
		multiplica(num);

	}

	public static void multiplica(int num) {

		int total = 1;
		int cont = 1;

		while (cont <= num) {
			total = total * cont;
			System.out.print(cont);
			if (cont < num) System.out.print(" * ");
			cont++;
		}
		System.out.print(" = " + total);

	}

	/*
	 * nunca fazer o metodo soma em teste de emprego
	 */
	public static void soma(int num) {

		int soma = 0;

		for (int cont = 1; cont <= num; cont++) {
			soma = soma + cont;
			if (cont == num) {
				System.out.print(cont);
			} else {
				System.out.print(cont + " + ");
			}

		}
		System.out.println(" = " + soma);

	}

	public static void tabuada(int num) {

		for (int cont = 0; cont <= 10; cont++)
			System.out.println(num + " X " + cont + " = " + num * cont);
	}

	public static void repeteNome(String nome, int qtde) {

		for (int cont = 0; cont <= qtde; cont++) {
			System.out.println(nome);

		}

	}

}
