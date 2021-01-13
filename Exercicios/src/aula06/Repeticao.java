package aula06;

import javax.swing.JOptionPane;

public class Repeticao {

	public static void main(String[] args) {
		// mostraNumeros();

		String str = JOptionPane.showInputDialog("Digite um número para saber sua tabuada: ");
		int num = Integer.parseInt(str);
		tabuadaDoWhile(num);

	}

	public static void tabuadaDoWhile(int num) {
		int cont = 0;

		do {
			System.out.println(num + " X " + cont + " = " + num * cont);
			cont++;
		} while (cont <= 10);

	}

	public static void tabuadaWhile(int num) {
		int cont = 0;
		while (cont <= 10) {
			System.out.println(num + " X " + cont + " = " + num * cont);
			cont++;
		}

	}

	public static void mostraNumeros() {

		String str = JOptionPane.showInputDialog("Imprimir até: ");
		int qtde = Integer.parseInt(str);

		for (int cont = 1; cont <= qtde; cont++) {

			JOptionPane.showMessageDialog(null, cont);

		}

	}

}
