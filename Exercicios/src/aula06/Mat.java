package aula06;

import javax.swing.JOptionPane;

public class Mat {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Base:");
		double num = Double.parseDouble(str);
		// JOptionPane.showMessageDialog(null, num + "! = " + fatorial(num));

		String str2 = JOptionPane.showInputDialog("Expoente:");
		int exp = Integer.parseInt(str2);

		JOptionPane.showMessageDialog(null, num + " ^ " + exp + " = " + pow(num, exp));

	}
	
	public static long mdc(long a, long b) {

		//pendente
		
		
	}
	
	public static long mmc(long a, long b) {

		//pendente
		
		
	}

	public static double pow(double b, int e) {

		double total = 1;
		if (e < 0) {
			e = e * 1;
			b = 1 / b;
		}

		for (int cont = 1; cont <= e; cont++) {
			total = total * e;
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
