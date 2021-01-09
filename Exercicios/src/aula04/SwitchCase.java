package aula04;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		//comSwitch();
		comIf();

	}
	
	public static void comIf() {
		String num = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
		int dia = Integer.parseInt(num);
		
		if( dia == 1)JOptionPane.showMessageDialog(null, "Domingo");
		else if (dia == 2)JOptionPane.showMessageDialog(null, "Segunda-feira");
		else if (dia == 3)JOptionPane.showMessageDialog(null, "Terça-feira");
		else if (dia == 4)JOptionPane.showMessageDialog(null, "Quarta-feira");
		else if (dia == 5)JOptionPane.showMessageDialog(null, "Quinta-feira");
		else if (dia == 6)JOptionPane.showMessageDialog(null, "Sexta-feira");
		else if (dia == 7)JOptionPane.showMessageDialog(null, "Sábado");
		else {
			JOptionPane.showMessageDialog(null, "Número inválido"); 
			comIf();
		}
	}

	/*
	 * Ler um numero inteiro entre 1 e 7 e mostrar o respectivo dia da semana
	 */
	public static void comSwitch() {
		String num = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
		int dia = Integer.parseInt(num);

		switch (dia) {
		case 1:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Segunda-feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Terça-feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quarta-feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Quinta-feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sexta-feira");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Número inválido!"); comSwitch();

		}

	}

}
