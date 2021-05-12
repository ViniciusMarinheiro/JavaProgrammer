package aula14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aula04.ClasseIMC;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbTitulo;
	private JPanel pnCentral;
	private JLabel lbNum1;
	private JLabel lbNum2;
	private JLabel lbIcone;
	private JButton btSoma;
	private JButton btMult;
	private JButton btDiv;
	private JButton btSub;
	private JTextField tfValor2;
	private JTextField tfValor1;
	private JLabel lblNewLabel;
	private JTextArea txResultado;
	private JButton btIMC;
	private JButton btMMC;
	private JButton btMDC;
	private JButton btFatorial;
	private JButton btPotencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		setTitle("Calculadora Java");
		initComponents();

	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnTitulo = new JPanel();
		pnTitulo.setPreferredSize(new Dimension(10, 40));
		pnTitulo.setBackground(new Color(204, 0, 204));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		pnTitulo.setLayout(null);

		lbTitulo = new JLabel("Calculadora");
		lbTitulo.setBounds(375, 5, 208, 29);
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		pnTitulo.add(lbTitulo);

		lbIcone = new JLabel("");
		lbIcone.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/aula14/iconCalc.png")));
		lbIcone.setBounds(25, 5, 35, 29);
		pnTitulo.add(lbIcone);

		pnCentral = new JPanel();
		pnCentral.setBackground(new Color(211, 211, 211));
		contentPane.add(pnCentral, BorderLayout.CENTER);
		SpringLayout sl_pnCentral = new SpringLayout();
		pnCentral.setLayout(sl_pnCentral);

		lbNum1 = new JLabel("Valor 1/ Peso (kg)");
		lbNum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, lbNum1, 10, SpringLayout.NORTH, pnCentral);
		sl_pnCentral.putConstraint(SpringLayout.WEST, lbNum1, 10, SpringLayout.WEST, pnCentral);
		pnCentral.add(lbNum1);

		lbNum2 = new JLabel("Valor 2/Altura (Ex.1.66)");
		lbNum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sl_pnCentral.putConstraint(SpringLayout.WEST, lbNum2, 0, SpringLayout.WEST, lbNum1);
		pnCentral.add(lbNum2);

		btSoma = new JButton("");
		btSoma.setPreferredSize(new Dimension(30, 10));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btSoma, 10, SpringLayout.NORTH, pnCentral);
		sl_pnCentral.putConstraint(SpringLayout.EAST, btSoma, -318, SpringLayout.EAST, pnCentral);
		btSoma.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/aula14/iconAdd.png")));
		btSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma();
			}
		});
		pnCentral.add(btSoma);

		btMult = new JButton("");
		btMult.setPreferredSize(new Dimension(30, 10));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btMult, 0, SpringLayout.NORTH, lbNum2);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btMult, 0, SpringLayout.WEST, btSoma);
		sl_pnCentral.putConstraint(SpringLayout.EAST, btMult, 0, SpringLayout.EAST, btSoma);
		btMult.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/aula14/iconMulti.png")));
		btMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplicacao();
			}
		});
		pnCentral.add(btMult);

		btDiv = new JButton("");
		btDiv.setPreferredSize(new Dimension(30, 10));
		sl_pnCentral.putConstraint(SpringLayout.SOUTH, btDiv, 36, SpringLayout.NORTH, lbNum2);
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btDiv, 0, SpringLayout.NORTH, lbNum2);
		btDiv.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/aula14/iconDiv.png")));
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divisao();
			}
		});
		pnCentral.add(btDiv);

		btSub = new JButton("");
		btSub.setPreferredSize(new Dimension(30, 10));
		sl_pnCentral.putConstraint(SpringLayout.WEST, btDiv, 0, SpringLayout.WEST, btSub);
		sl_pnCentral.putConstraint(SpringLayout.EAST, btDiv, 55, SpringLayout.WEST, btSub);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btSoma, 31, SpringLayout.EAST, btSub);
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btSub, 0, SpringLayout.NORTH, lbNum1);
		sl_pnCentral.putConstraint(SpringLayout.SOUTH, btSub, 36, SpringLayout.NORTH, lbNum1);
		btSub.setIcon(new ImageIcon(TelaCalculadora.class.getResource("/aula14/iconSub.png")));
		btSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subtracao();
			}
		});
		pnCentral.add(btSub);

		tfValor2 = new JTextField();
		sl_pnCentral.putConstraint(SpringLayout.SOUTH, btMult, -6, SpringLayout.SOUTH, tfValor2);
		sl_pnCentral.putConstraint(SpringLayout.NORTH, tfValor2, 6, SpringLayout.SOUTH, lbNum2);
		sl_pnCentral.putConstraint(SpringLayout.WEST, tfValor2, 0, SpringLayout.WEST, lbNum1);
		pnCentral.add(tfValor2);
		tfValor2.setColumns(10);

		tfValor1 = new JTextField();
		sl_pnCentral.putConstraint(SpringLayout.SOUTH, btSoma, -6, SpringLayout.SOUTH, tfValor1);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btSub, 60, SpringLayout.EAST, tfValor1);
		sl_pnCentral.putConstraint(SpringLayout.EAST, btSub, 115, SpringLayout.EAST, tfValor1);
		sl_pnCentral.putConstraint(SpringLayout.NORTH, lbNum2, 19, SpringLayout.SOUTH, tfValor1);
		sl_pnCentral.putConstraint(SpringLayout.NORTH, tfValor1, 6, SpringLayout.SOUTH, lbNum1);
		sl_pnCentral.putConstraint(SpringLayout.WEST, tfValor1, 0, SpringLayout.WEST, lbNum1);
		pnCentral.add(tfValor1);
		tfValor1.setColumns(10);

		lblNewLabel = new JLabel("RESULTADO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_pnCentral.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, lbNum1);
		sl_pnCentral.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, pnCentral);
		pnCentral.add(lblNewLabel);

		btIMC = new JButton("IMC");
		btIMC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btIMC, 0, SpringLayout.NORTH, lbNum1);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btIMC, 33, SpringLayout.EAST, btSoma);
		btIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaIMC();
			}
		});
		pnCentral.add(btIMC);

		btMMC = new JButton("MMC");
		btMMC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btMMC, 0, SpringLayout.NORTH, lbNum2);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btMMC, 0, SpringLayout.WEST, btIMC);
		btMMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaMMC();

			}
		});
		pnCentral.add(btMMC);

		btMDC = new JButton("MDC");
		btMDC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btMDC, 0, SpringLayout.NORTH, lbNum1);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btMDC, 41, SpringLayout.EAST, btIMC);
		btMDC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calculaMDC();
				
			}
		});
		pnCentral.add(btMDC);

		btFatorial = new JButton("Fatorial");
		btFatorial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btFatorial, 0, SpringLayout.NORTH, lbNum2);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btFatorial, 0, SpringLayout.WEST, btMDC);
		btFatorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaFatorial();
			}
		});
		pnCentral.add(btFatorial);
		
		btPotencia = new JButton("Pot\u00EAncia");
		sl_pnCentral.putConstraint(SpringLayout.NORTH, btPotencia, 19, SpringLayout.SOUTH, btMult);
		sl_pnCentral.putConstraint(SpringLayout.WEST, btPotencia, 0, SpringLayout.WEST, btDiv);
		btPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaPotencia();
			}
		});
		btPotencia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pnCentral.add(btPotencia);

		txResultado = new JTextArea();
		txResultado.setBackground(Color.LIGHT_GRAY);
		txResultado.setSelectedTextColor(new Color(0, 0, 0));
		txResultado.setPreferredSize(new Dimension(300, 22));
		contentPane.add(txResultado, BorderLayout.EAST);
	}

	public void soma() {
		txResultado.setText("");
		double n1 = Double.parseDouble(tfValor1.getText());
		double n2 = Double.parseDouble(tfValor2.getText());
		double soma = n1 + n2;

		txResultado.append(n1 + " + " + n2 + " = " + soma);

	}

	public void subtracao() {
		txResultado.setText("");
		double n1 = Double.parseDouble(tfValor1.getText());
		double n2 = Double.parseDouble(tfValor2.getText());
		double subtracao = n1 - n2;

		txResultado.append(n1 + " - " + n2 + " = " + subtracao);

	}

	public void multiplicacao() {
		txResultado.setText("");
		double n1 = Double.parseDouble(tfValor1.getText());
		double n2 = Double.parseDouble(tfValor2.getText());
		double multiplicacao = n1 * n2;

		txResultado.append(n1 + " * " + n2 + " = " + multiplicacao);

	}

	public void divisao() {
		txResultado.setText("");
		double n1 = Double.parseDouble(tfValor1.getText());
		double n2 = Double.parseDouble(tfValor2.getText());
		double divisao = n1 / n2;

		txResultado.append(n1 + " / " + n2 + " = " + divisao);

	}

	public void calculaIMC() {
		double peso = Double.parseDouble(tfValor1.getText());
		double altura = Double.parseDouble(tfValor2.getText());
		double imc = peso / (altura * altura);
		String classe = ClasseIMC.classeIMC(imc);
		txResultado.setText("");
		txResultado.append("\n" + "Índice do IMC: " + imc + "\nClassificação IMC: " + classe);
	}

	public void calculaMMC() {

		txResultado.setText("");
		long n1 = Long.parseLong(tfValor1.getText());
		long n2 = Long.parseLong(tfValor2.getText());
		Long resultado = aula06.Mat.mmc(n1, n2);
		
		txResultado.append("O MMC é " + resultado);	
	}
	
	public void calculaMDC() {
		txResultado.setText("");
		long n1 = Long.parseLong(tfValor1.getText());
		long n2 = Long.parseLong(tfValor2.getText());
		Long resultado = aula06.Mat.mdc(n1, n2);
		
		txResultado.append("O MDC é " + resultado);	
	}
	
	public void calculaFatorial() {
		txResultado.setText("");
		int n1 = Integer.parseInt(tfValor1.getText());
		int n2 = Integer.parseInt(tfValor2.getText());
		
		double fatorial1 = aula06.Mat.fatorial(n1);
		double fatorial2 = aula06.Mat.fatorial(n2);
		
		txResultado.append("O fatorial do Valor 1 é " + fatorial1 + "\nO fatorial do Valor 2 é " + fatorial2);	
		
	}
	
	public void calculaPotencia() {
		
		txResultado.setText("");
		int n1 = Integer.parseInt(tfValor1.getText());
		int n2 = Integer.parseInt(tfValor2.getText());
		double resultado = aula06.Mat.pow(n1, n2);
		
		txResultado.append("Total = " + resultado);
		
		
		
	}
}

/*
 * colcoar botao para calculo fatorial
 */
