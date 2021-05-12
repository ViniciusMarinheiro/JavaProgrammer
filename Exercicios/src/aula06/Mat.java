package aula06;

import javax.swing.JOptionPane;

public class Mat {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Digite um número:");
		long a = Long.parseLong(str);

		String str2 = JOptionPane.showInputDialog("Digite outro número:");
		long b = Long.parseLong(str2);

		JOptionPane.showMessageDialog(null, "O MDC é " + mdc(a, b) + "\nE o MMC é " + mmc(a, b));

	}

	public static double menor(double v[]) {
		double menor = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] < menor)
				menor = v[i];
		}
		return menor;

	}

	/*
	 * recebe o vetor de numeros e retorna o maior numero
	 */
	public static double maior(double v[]) {
		double maior = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] > maior)
				maior = v[i];
		}
		return maior;
	}

	// recebe vetor de double e retorna soma
	public static double soma(double v[]) {
		double soma = 0;
		for (double n : v) {
			soma += n;
		}
		return soma;

	}

	// recebe vetor de double e retorna media
	public static double media(double v[]) {

		double soma = soma(v);

		return soma / v.length;

	}

	public static long mmc(long a, long b) {
		long resp;

		if (a > b)
			resp = a;
		else
			resp = b;
		while (true) {
			if ((resp % a == 0) && (resp % b == 0))
				return resp;
			else
				resp++;
		}

	}

	public static long mdc(long a, long b) {

		long resp = 0;
		if (a < b)
			resp = a;
		else
			resp = b;

		while (true) {

			if (a % resp == 0 && b % resp == 0)
				return resp;
			else
				resp--;
		}

	}

	public static double pow(double b, int e) {

		double total = 1;
		if (e < 0) {
			e = e * -1;
			b = 1/b;
		}
		for (int cont=1 ; cont<=e ; cont++) {
			total = total * b;
		}
		return total;

	}

	public static double fatorial(int num) {

		double total = 1;
		int cont = 1;

		for (cont = 1; cont <= num; cont++) {
			total = total * cont;
		}

		return total;

	}

}
