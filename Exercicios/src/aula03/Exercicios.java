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
	 * Leia 2 numeros e irforme se s�o multiplos
	 */

	public static void numerosMultiplos() {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		String num2 = JOptionPane.showInputDialog("Digite o segundo n�mero ");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);

		if (n1 % n2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + n1 + " � multiplo de " + n2);
		} else if (n2 % n1 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + n1 + " � multiplo de " + n2);
		} else {
			JOptionPane.showMessageDialog(null, "Os n�meros n�o s�o multiplos");
		}

	}

	/*
	 * Leia um numero e informe se ele � positivo, negativo ou nulo
	 */
	public static void sinalDoNumero() {
		String num = JOptionPane.showInputDialog("Digite um n�mero:");
		int n = Integer.parseInt(num);
		if (n > 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + n + " � positivo");
		} else if (n == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + n + " � nulo");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + n + " � negativo");
		}

	}

	/*
	 * Fazer rotina que leia um numero e mostre seu valor absoluto
	 */
	public static void valorAbsoluto() {
		String num = JOptionPane.showInputDialog("Digite um n�mero:");
		int n = Integer.parseInt(num);
		if (n < 0)
			n = n * -1;
		JOptionPane.showMessageDialog(null, "Valor absoluto: " + n);

	}

	/*
	 * Fazer rotina que leia dois numeros e imprima-os em ordem crescente
	 */
	public static void ordemCrescente() {

		String num1 = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		String num2 = JOptionPane.showInputDialog("Digite o segundo n�mero ");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);

		if (n1 < n2) {
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + " - " + n2);
		} else if (n2 < n1) {
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + n2 + " - " + n1);
		} else {
			JOptionPane.showMessageDialog(null, "Ambos os n�meros s�o iguais");
		}

	}

}
