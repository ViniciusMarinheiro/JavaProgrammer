package aula14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;

import aula04.ClasseIMC;
import aula06.Mat;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class TelaIMC extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JPanel pnCenter;
	private JLabel lbTitulo;
	private JLabel lbNome;
	private JTextField tfNome;
	private JLabel lbPeso;
	private JLabel lbAltura;
	private JTextField tfAltura;
	private JSpinner spPeso;
	private JButton btnIMC;
	private JLabel lbLogo;
	private JTextArea txSaida;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIMC frame = new TelaIMC();
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
	public TelaIMC() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnTitulo = new JPanel();
		pnTitulo.setPreferredSize(new Dimension(10, 40));
		pnTitulo.setBackground(new Color(51, 51, 51));
		pnTitulo.setForeground(Color.WHITE);
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		pnTitulo.setLayout(null);
		
		lbLogo = new JLabel("");
		lbLogo.setBounds(24, 5, 30, 23);
		lbLogo.setIcon(new ImageIcon(TelaIMC.class.getResource("/aula14/iconeIMC.png")));
		pnTitulo.add(lbLogo);

		lbTitulo = new JLabel("C\u00E1lculo do IMC");
		lbTitulo.setBounds(123, -1, 158, 29);
		lbTitulo.setForeground(new Color(153, 204, 0));
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pnTitulo.add(lbTitulo);

		pnCenter = new JPanel();
		pnCenter.setBackground(new Color(102, 153, 153));
		contentPane.add(pnCenter, BorderLayout.CENTER);
		SpringLayout sl_pnCenter = new SpringLayout();
		pnCenter.setLayout(sl_pnCenter);

		lbNome = new JLabel("Nome: ");
		sl_pnCenter.putConstraint(SpringLayout.NORTH, lbNome, 31, SpringLayout.NORTH, pnCenter);
		sl_pnCenter.putConstraint(SpringLayout.WEST, lbNome, 35, SpringLayout.WEST, pnCenter);
		pnCenter.add(lbNome);

		tfNome = new JTextField();
		sl_pnCenter.putConstraint(SpringLayout.NORTH, tfNome, 25, SpringLayout.NORTH, pnCenter);
		sl_pnCenter.putConstraint(SpringLayout.WEST, tfNome, 6, SpringLayout.EAST, lbNome);
		sl_pnCenter.putConstraint(SpringLayout.EAST, tfNome, 314, SpringLayout.EAST, lbNome);
		pnCenter.add(tfNome);
		tfNome.setColumns(10);

		lbPeso = new JLabel("Peso:");
		sl_pnCenter.putConstraint(SpringLayout.NORTH, lbPeso, 18, SpringLayout.SOUTH, lbNome);
		sl_pnCenter.putConstraint(SpringLayout.WEST, lbPeso, 0, SpringLayout.WEST, lbNome);
		pnCenter.add(lbPeso);

		lbAltura = new JLabel("Altura: (Exemplo: 1.75)");
		sl_pnCenter.putConstraint(SpringLayout.NORTH, lbAltura, 0, SpringLayout.NORTH, lbPeso);
		pnCenter.add(lbAltura);

		tfAltura = new JTextField();
		sl_pnCenter.putConstraint(SpringLayout.EAST, lbAltura, -7, SpringLayout.WEST, tfAltura);
		sl_pnCenter.putConstraint(SpringLayout.NORTH, tfAltura, -2, SpringLayout.NORTH, lbPeso);
		sl_pnCenter.putConstraint(SpringLayout.EAST, tfAltura, 0, SpringLayout.EAST, tfNome);
		pnCenter.add(tfAltura);
		tfAltura.setColumns(10);

		spPeso = new JSpinner();
		sl_pnCenter.putConstraint(SpringLayout.NORTH, spPeso, 11, SpringLayout.SOUTH, tfNome);
		sl_pnCenter.putConstraint(SpringLayout.WEST, spPeso, 14, SpringLayout.EAST, lbPeso);
		sl_pnCenter.putConstraint(SpringLayout.SOUTH, spPeso, 0, SpringLayout.SOUTH, lbPeso);
		sl_pnCenter.putConstraint(SpringLayout.EAST, spPeso, 48, SpringLayout.EAST, lbPeso);
		pnCenter.add(spPeso);

		btnIMC = new JButton("Calcula IMC");
		btnIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaIMC();
			}
			
		});
		sl_pnCenter.putConstraint(SpringLayout.NORTH, btnIMC, 19, SpringLayout.SOUTH, tfAltura);
		sl_pnCenter.putConstraint(SpringLayout.WEST, tfAltura, 0, SpringLayout.WEST, btnIMC);
		sl_pnCenter.putConstraint(SpringLayout.EAST, btnIMC, 0, SpringLayout.EAST, tfNome);
		pnCenter.add(btnIMC);
		
		lblNewLabel = new JLabel("Resultado:");
		sl_pnCenter.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, pnCenter);
		sl_pnCenter.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lbPeso);
		pnCenter.add(lblNewLabel);

		
		txSaida = new JTextArea();
		txSaida.setFont(new Font("Dialog", Font.BOLD, 12));
		txSaida.setPreferredSize(new Dimension(1, 55));
		txSaida.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txSaida.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(txSaida, BorderLayout.SOUTH);
	}
	


	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}

	private void calculaIMC() {
		String nome = tfNome.getText();
		int peso = Integer.parseInt(spPeso.getValue().toString());
		double altura = Double.parseDouble(tfAltura.getText());
		double imc = peso / (altura*altura);
		String classe = ClasseIMC.classeIMC(imc);
		txSaida.setText("");
		txSaida.append(nome + "\n" + "Índice do IMC: " + imc + "\nClassificação IMC: " + classe);
		//System.out.println(nome + "\n" + "Índice do IMC: " + imc + "\nClassificação IMC: " + classe);
		
		
		

	}
}
