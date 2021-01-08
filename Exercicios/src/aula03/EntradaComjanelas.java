package aula03;

import javax.swing.JOptionPane;

public class EntradaComjanelas {

	public static void main(String[] args) {
		entradaTexto();

	}

	public static void entradaTexto() {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);

	}

}
