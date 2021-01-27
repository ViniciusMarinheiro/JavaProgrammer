package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JPanel pnTitulo;
	private JLabel lbTitulo;
	private JPanel pnMenu;
	private JButton btProdutos;
	private JButton btClientes;
	private JButton btFornecedores;
	private JButton btEntradas;
	private JButton btSaidas;
	private JButton btMovimentacao;
	private JPanel pnRodape;
	private JButton btListar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

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
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnTitulo = new JPanel();
		pnTitulo.setBackground(new Color(0, 51, 102));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		
		lbTitulo = new JLabel("Sistema de Controle de Estoque");
		lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setFont(new Font("Lucida Sans", Font.PLAIN, 32));
		pnTitulo.add(lbTitulo);
		
		pnMenu = new JPanel();
		contentPane.add(pnMenu, BorderLayout.WEST);
		pnMenu.setLayout(new GridLayout(6, 0, 0, 0));
		
		btProdutos = new JButton("Produtos");
		btProdutos.setContentAreaFilled(false);
		btProdutos.setBorderPainted(false);
		btProdutos.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		pnMenu.add(btProdutos);
		
		btClientes = new JButton("Clientes");
		btClientes.setContentAreaFilled(false);
		btClientes.setBorderPainted(false);
		btClientes.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		pnMenu.add(btClientes);
		
		btFornecedores = new JButton("Fornecedores");
		btFornecedores.setContentAreaFilled(false);
		btFornecedores.setBorderPainted(false);
		btFornecedores.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		pnMenu.add(btFornecedores);
		
		btEntradas = new JButton("Entradas");
		btEntradas.setContentAreaFilled(false);
		btEntradas.setBorderPainted(false);
		btEntradas.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		pnMenu.add(btEntradas);
		
		btSaidas = new JButton("Saídas");
		btSaidas.setContentAreaFilled(false);
		btSaidas.setBorderPainted(false);
		btSaidas.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		pnMenu.add(btSaidas);
		
		btMovimentacao = new JButton("Movimentação");
		btMovimentacao.setContentAreaFilled(false);
		btMovimentacao.setBorderPainted(false);
		btMovimentacao.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		pnMenu.add(btMovimentacao);
		
		pnRodape = new JPanel();
		pnRodape.setBackground(new Color(0, 51, 102));
		contentPane.add(pnRodape, BorderLayout.SOUTH);
		pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 5));
		
		btListar = new JButton("Listar");
		btListar.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		pnRodape.add(btListar);
		
		btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		pnRodape.add(btnNewButton_2);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		pnRodape.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Gravar");
		btnNewButton_1.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		pnRodape.add(btnNewButton_1);
	}

}
