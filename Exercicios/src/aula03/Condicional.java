package aula03;

import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {
		//compara();
		//ternario();
		bloco();
	}
	
	public static void bloco() {
		if(10 > 0) {
			System.out.println("10 � maior que zero");
			System.out.println("10 � positivo");
			System.out.println("10 � um n�mero bonito");
		}
	}

	public static void compara() {
		String s = JOptionPane.showInputDialog("Digite um n�mero:");
		int num = Integer.parseInt(s);
		if (num > 10) JOptionPane.showMessageDialog(null, "O n�mero � maior que 10");
		else if (num < 10) JOptionPane.showMessageDialog(null, "O n�mero � menor que 10");
		else JOptionPane.showMessageDialog(null, "O n�mero � igual a 10");
		

	}
	
	public static void ternario() {
		String s = JOptionPane.showInputDialog("Digite um n�mero:");
		int num = Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, (num>10 ?
				"O n�mero � maior que 10" :
				"O n�mero n�o � maior que 10"));
		
		
	}

}
