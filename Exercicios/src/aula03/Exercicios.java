package aula03;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		// ordemCrescente();
		// valorAbsoluto();
		// sinalDoNumero();
		numerosMultiplos();
	}

	/*
	 * Leia 2 numeros e irforme se são multiplos
	 */

	public static void numerosMultiplos() {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String num2 = JOptionPane.showInputDialog("Digite o segundo número ");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);

		if (n1 % n2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + n1 + " é multiplo de " + n2);
		} else if (n2 % n1 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + n1 + " é multiplo de " + n2);
		} else {
			JOptionPane.showMessageDialog(null, "Os números não são multiplos");
		}

	}

	/*
	 * Leia um numero e informe se ele é positivo, negativo ou nulo
	 */
	public static void sinalDoNumero() {
		String num = JOptionPane.showInputDialog("Digite um número:");
		int n = Integer.parseInt(num);
		if (n > 0) {
			JOptionPane.showMessageDialog(null, "O número " + n + " é positivo");
		} else if (n == 0) {
			JOptionPane.showMessageDialog(null, "O número " + n + " é nulo");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + n + " é negativo");
		}

	}

	/*
	 * Fazer rotina que leia um numero e mostre seu valor absoluto
	 */
	public static void valorAbsoluto() {
		String num = JOptionPane.showInputDialog("Digite um número:");
		int n = Integer.parseInt(num);
		if (n < 0)
			n = n * -1;
		JOptionPane.showMessageDialog(null, "Valor absoluto: " + n);

	}

	/*
	 * Fazer rotina que leia dois numeros e imprima-os em ordem crescente
	 */
	public static void ordemCrescente() {

		String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String num2 = JOptionPane.showInputDialog("Digite o segundo número ");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);

		if (n1 < n2) {
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + " - " + n2);
		} else if (n2 < n1) {
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + n2 + " - " + n1);
		} else {
			JOptionPane.showMessageDialog(null, "Ambos os números são iguais");
		}

	}

}
