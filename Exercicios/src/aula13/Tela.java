package aula13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelCima = new JPanel();
		panelCima.setPreferredSize(new Dimension(10, 50));
		panelCima.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelCima.setBackground(new Color(102, 51, 255));
		contentPane.add(panelCima, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Título da Aplicação");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setPreferredSize(new Dimension(250, 40));
		panelCima.add(lblNewLabel);

		JPanel painelCentral = new JPanel();
		painelCentral.setBackground(new Color(255, 204, 0));
		contentPane.add(painelCentral, BorderLayout.CENTER);
		SpringLayout sl_painelCentral = new SpringLayout();
		painelCentral.setLayout(sl_painelCentral);

		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		sl_painelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.EAST, lblNewLabel_1, 91, SpringLayout.WEST, painelCentral);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		painelCentral.add(lblNewLabel_1);

		textField = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField, 22, SpringLayout.EAST, lblNewLabel_1);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField, -450, SpringLayout.EAST, painelCentral);
		painelCentral.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("CliqueAqui");
		sl_painelCentral.putConstraint(SpringLayout.EAST, btnNewButton, -126, SpringLayout.EAST, painelCentral);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaNome();
				listaEmail();
			}
		});
		sl_painelCentral.putConstraint(SpringLayout.WEST, btnNewButton, 521, SpringLayout.WEST, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.SOUTH, btnNewButton, -141, SpringLayout.SOUTH, painelCentral);
		painelCentral.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Email:");
		sl_painelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 33, SpringLayout.NORTH, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.WEST, lblNewLabel_2, 10, SpringLayout.WEST, painelCentral);
		sl_painelCentral.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setPreferredSize(new Dimension(81, 21));
		painelCentral.add(lblNewLabel_2);

		textField_1 = new JTextField();
		sl_painelCentral.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, textField);
		sl_painelCentral.putConstraint(SpringLayout.WEST, textField_1, 22, SpringLayout.EAST, lblNewLabel_2);
		sl_painelCentral.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		textField_1.setColumns(10);
		painelCentral.add(textField_1);
	}

	private void listaNome() {
		String nome = textField.getText();
		System.out.println(nome);

	}

	private void listaEmail() {
		String email = textField_1.getText();
		System.out.println(email);

	}
}
