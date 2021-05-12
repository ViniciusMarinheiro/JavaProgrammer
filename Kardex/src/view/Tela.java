package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import model.Cliente;
import model.Entrada;
import model.Fornecedor;
import model.Produto;
import model.Saida;
import util.Configura;
import util.Converte;
import util.Mascara;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private Paineis painel;  // informa o painel atual em foco
	
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
	private JButton btCancelar;
	private JButton btGravar;
	private JButton btLimpar;
	private JPanel panel;
	private JLabel lbLogo;
	private JComboBox cbTema;
	private JLabel lbTema;
	private JPanel pnCentral;
	private JPanel pnProdutos;
	private JLabel lbProdutos;
	private JPanel pnClientes;
	private JLabel lbClientes;
	private JPanel pnFornecedores;
	private JLabel lbFornecedores;
	private JLabel lbProdutoID;
	private JTextField tfProdutoID;
	private JLabel lbProdutoNome;
	private JTextField tfProdutoNome;
	private JLabel lbProdutoLocalizacao;
	private JTextField tfProdutoLocalizacao;
	private JPanel pnQtde;
	private JLabel lbProdutoQtdeMinima;
	private JTextField tfProdutoQtdeMinima;
	private JLabel lbProdutoQtdeMaxima;
	private JTextField tfProdutoQtdeMaxima;
	private JLabel lbProdutoQtdeEstoque;
	private JTextField tfProdutoQtdeEstoque;
	private JLabel lbFornecedorID;
	private JTextField tfFornecedorID;
	private JLabel lbFornecedorCNPJ;
	private JFormattedTextField tfFornecedorCNPJ;
	private JLabel lbFornecedorNome;
	private JTextField tfFornecedorNome;
	private JLabel lbFornecedorTelefone;
	private JFormattedTextField tfFornecedorTelefone;
	private JLabel lbFornecedorEmail;
	private JTextField tfFornecedorEmail;
	private JPanel pnEntradas;
	private JPanel pnEntradasTitulo;
	private JLabel lbEntradas;
	private JScrollPane scEntradas;
	private JTable tbEntradas;
	private JPanel pnSaidas;
	private JPanel pnKardex;
	private JLabel lbIncluir;
	private JLabel lbClientesCPF;
	private JLabel lbClientesNome;
	private JLabel lbClientesCelular;
	private JLabel lbClientesEmail;
	private JFormattedTextField tfClientesCPF;
	private JTextField tfClientesNome;
	private JFormattedTextField tfClientesCelular;
	private JTextField tfClientesEmail;
	private JPanel pnSaidaTitulo;
	private JLabel lbSaidaTitulo;
	private JScrollPane scSaidas;
	private JTable tbSaidas;
	private JPanel pnKardexTitulo;
	private JLabel lbKardexTitulo;
	private JScrollPane pnKardexTabela;
	private JTable tbKardex;
	private JLabel lbAlterar;
	private JLabel lbExcluir;

	/**
	 * Create the frame.
	 */
	public Tela() {
		initComponents();
		setTitle("Sistema de Controle de Estoque");
		setLocationRelativeTo(null);
		setTemas();
		setPainel(Paineis.PRODUTOS);
		limpaTelaProduto();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnTitulo = new JPanel();
		pnTitulo.setPreferredSize(new Dimension(10, 70));
		pnTitulo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnTitulo.setBackground(new Color(204, 153, 0));
		contentPane.add(pnTitulo, BorderLayout.NORTH);
		pnTitulo.setLayout(null);

		lbLogo = new JLabel("");
		lbLogo.setBounds(30, 7, 64, 59);
		lbLogo.setIcon(new ImageIcon(Tela.class.getResource("/images/Logo2.png")));
		pnTitulo.add(lbLogo);

		lbTitulo = new JLabel("Sistema de Controle de Estoque");
		lbTitulo.setBounds(150, 15, 452, 39);
		lbTitulo.setForeground(new Color(255, 255, 204));
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pnTitulo.add(lbTitulo);

		pnMenu = new JPanel();
		pnMenu.setBackground(new Color(204, 153, 0));
		pnMenu.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(pnMenu, BorderLayout.WEST);
		pnMenu.setLayout(new GridLayout(0, 1, 0, 0));

		btProdutos = new JButton("Produtos");
		btProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.PRODUTOS);
			}
		});
		btProdutos.setForeground(Color.WHITE);
		btProdutos.setContentAreaFilled(false);
		btProdutos.setBorderPainted(false);
		btProdutos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		pnMenu.add(btProdutos);

		btClientes = new JButton("Clientes");
		btClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.CLIENTES);
			}
		});
		btClientes.setForeground(Color.WHITE);
		btClientes.setContentAreaFilled(false);
		btClientes.setBorderPainted(false);
		btClientes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		pnMenu.add(btClientes);

		btFornecedores = new JButton("Fornecedores");
		btFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.FORNECEDORES);
			}
		});
		btFornecedores.setForeground(Color.WHITE);
		btFornecedores.setContentAreaFilled(false);
		btFornecedores.setBorderPainted(false);
		btFornecedores.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		pnMenu.add(btFornecedores);

		btEntradas = new JButton("Entradas");
		btEntradas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.ENTRADAS);
			}
		});
		btEntradas.setForeground(Color.WHITE);
		btEntradas.setContentAreaFilled(false);
		btEntradas.setBorderPainted(false);
		btEntradas.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		pnMenu.add(btEntradas);

		btSaidas = new JButton("Saídas");
		btSaidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPainel(Paineis.SAIDAS);
			}
		});
		btSaidas.setForeground(Color.WHITE);
		btSaidas.setContentAreaFilled(false);
		btSaidas.setBorderPainted(false);
		btSaidas.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		pnMenu.add(btSaidas);

		btMovimentacao = new JButton("Movimenta\u00E7\u00E3o");
		btMovimentacao.setForeground(Color.WHITE);
		btMovimentacao.setContentAreaFilled(false);
		btMovimentacao.setBorderPainted(false);
		btMovimentacao.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		pnMenu.add(btMovimentacao);

		pnRodape = new JPanel();
		pnRodape.setBackground(Color.DARK_GRAY);
		contentPane.add(pnRodape, BorderLayout.SOUTH);
		FlowLayout fl_pnRodape = new FlowLayout(FlowLayout.RIGHT, 20, 5);
		fl_pnRodape.setAlignOnBaseline(true);
		pnRodape.setLayout(fl_pnRodape);

		lbTema = new JLabel("Tema:");
		lbTema.setForeground(Color.WHITE);
		pnRodape.add(lbTema);

		cbTema = new JComboBox();
		cbTema.setPreferredSize(new Dimension(180, 24));
		cbTema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLookAndFeel();
			}
		});
		cbTema.setModel(new DefaultComboBoxModel(
				new String[] { "Metal", "Nimbus", "CDE/Motif", "Windows", "Windows Classic" }));
		pnRodape.add(cbTema);

		btListar = new JButton("Listar");
		btListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS) listaProduto();
				else if (painel == Paineis.FORNECEDORES) listaFornecedor();
			}
		});
		btListar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pnRodape.add(btListar);

		btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS) limpaTelaProduto();
				else if (painel == Paineis.FORNECEDORES) limpaTelaFornecedor();
			}
		});
		btLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pnRodape.add(btLimpar);

		btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS) limpaTelaProduto();
				else if (painel == Paineis.FORNECEDORES) limpaTelaFornecedor();
			}
		});
		btCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pnRodape.add(btCancelar);

		btGravar = new JButton("Gravar");
		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel == Paineis.PRODUTOS) gravaProduto();
				else if (painel == Paineis.FORNECEDORES) gravaFornecedor();
				else if (painel == Paineis.CLIENTES) gravaClientes();
				else if (painel == Paineis.ENTRADAS);
				else if (painel == Paineis.SAIDAS);
				else if (painel == Paineis.MOVIMENTACAO);
			}

			private void gravaMovimentacao() {
				// TODO Auto-generated method stub
				
			}

			private void gravaSaida() {
				// TODO Auto-generated method stub
				
			}
		});
		btGravar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pnRodape.add(btGravar);

		pnCentral = new JPanel();
		contentPane.add(pnCentral, BorderLayout.CENTER);
		pnCentral.setLayout(new CardLayout(0, 0));

		pnProdutos = new JPanel();
		pnProdutos.setBackground(new Color(128, 128, 128));
		pnCentral.add(pnProdutos,Paineis.PRODUTOS.toString());

		lbProdutos = new JLabel("Produtos");
		lbProdutos.setFont(new Font("Tahoma", Font.PLAIN, 32));

		lbProdutoID = new JLabel("C\u00F3digo:");

		tfProdutoID = new JTextField();
		tfProdutoID.setEnabled(false);
		tfProdutoID.setColumns(10);

		lbProdutoNome = new JLabel("Nome:");

		tfProdutoNome = new JTextField();
		tfProdutoNome.setColumns(10);

		lbProdutoLocalizacao = new JLabel("Localiza\u00E7\u00E3o:");

		tfProdutoLocalizacao = new JTextField();
		tfProdutoLocalizacao.setColumns(10);

		pnQtde = new JPanel();
		pnQtde.setBackground(new Color(192, 192, 192));
		pnQtde.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Quantidades", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout Produtos = new GroupLayout(pnProdutos);
		Produtos.setHorizontalGroup(Produtos.createParallelGroup(Alignment.LEADING).addGroup(Produtos
				.createSequentialGroup().addGap(28)
				.addGroup(Produtos.createParallelGroup(Alignment.TRAILING).addComponent(lbProdutoLocalizacao)
						.addComponent(lbProdutoID).addComponent(lbProdutoNome))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(Produtos.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(tfProdutoID, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfProdutoNome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
						.addComponent(tfProdutoLocalizacao, Alignment.LEADING).addComponent(pnQtde, Alignment.LEADING,
								GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(27, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, Produtos.createSequentialGroup().addContainerGap(233, Short.MAX_VALUE)
						.addComponent(lbProdutos).addGap(206)));
		Produtos.setVerticalGroup(Produtos.createParallelGroup(Alignment.LEADING).addGroup(Produtos
				.createSequentialGroup().addGap(22).addComponent(lbProdutos).addGap(18)
				.addGroup(Produtos.createParallelGroup(Alignment.BASELINE).addComponent(lbProdutoID).addComponent(
						tfProdutoID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(Produtos.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfProdutoNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbProdutoNome))
				.addGap(18)
				.addGroup(Produtos.createParallelGroup(Alignment.BASELINE).addComponent(lbProdutoLocalizacao)
						.addComponent(tfProdutoLocalizacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(pnQtde, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(31, Short.MAX_VALUE)));

		lbProdutoQtdeMinima = new JLabel("M\u00EDnima");

		tfProdutoQtdeMinima = new JTextField();
		tfProdutoQtdeMinima.setPreferredSize(new Dimension(60, 20));
		tfProdutoQtdeMinima.setColumns(10);

		lbProdutoQtdeMaxima = new JLabel("M\u00E1xima");

		tfProdutoQtdeMaxima = new JTextField();
		tfProdutoQtdeMaxima.setPreferredSize(new Dimension(60, 20));
		tfProdutoQtdeMaxima.setColumns(10);

		lbProdutoQtdeEstoque = new JLabel("Estoque");

		tfProdutoQtdeEstoque = new JTextField();
		tfProdutoQtdeEstoque.setPreferredSize(new Dimension(60, 20));
		tfProdutoQtdeEstoque.setColumns(10);
		GroupLayout gl_pnQtde = new GroupLayout(pnQtde);
		gl_pnQtde.setHorizontalGroup(gl_pnQtde.createParallelGroup(Alignment.LEADING).addGroup(gl_pnQtde
				.createSequentialGroup().addGap(27)
				.addGroup(gl_pnQtde.createParallelGroup(Alignment.LEADING).addComponent(lbProdutoQtdeMinima)
						.addComponent(tfProdutoQtdeMinima, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
				.addGap(45)
				.addGroup(
						gl_pnQtde.createParallelGroup(Alignment.LEADING)
								.addComponent(tfProdutoQtdeMaxima, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lbProdutoQtdeMaxima))
				.addGap(41)
				.addGroup(gl_pnQtde.createParallelGroup(Alignment.LEADING).addComponent(lbProdutoQtdeEstoque)
						.addComponent(tfProdutoQtdeEstoque, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(48, Short.MAX_VALUE)));
		gl_pnQtde.setVerticalGroup(gl_pnQtde.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQtde.createSequentialGroup().addGap(21)
						.addGroup(gl_pnQtde.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQtde.createSequentialGroup().addComponent(lbProdutoQtdeMinima).addGap(6)
										.addComponent(tfProdutoQtdeMinima, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnQtde.createSequentialGroup()
										.addGroup(gl_pnQtde.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbProdutoQtdeMaxima).addComponent(lbProdutoQtdeEstoque))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnQtde.createParallelGroup(Alignment.BASELINE)
												.addComponent(tfProdutoQtdeMaxima, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(tfProdutoQtdeEstoque, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(42, Short.MAX_VALUE)));
		pnQtde.setLayout(gl_pnQtde);
		pnProdutos.setLayout(Produtos);

		pnClientes = new JPanel();
		pnClientes.setBackground(new Color(128, 128, 128));
		pnCentral.add(pnClientes,Paineis.CLIENTES.toString());

		lbClientes = new JLabel("Clientes");
		lbClientes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lbClientesCPF = new JLabel("CPF:");
		
		lbClientesNome = new JLabel("Nome:");
		
		lbClientesCelular = new JLabel("Celular:");
		
		lbClientesEmail = new JLabel("Email:");
		
		tfClientesCPF = new JFormattedTextField(Mascara.cpf());
		tfClientesCPF.setColumns(10);
		
		tfClientesNome = new JTextField();
		tfClientesNome.setColumns(10);
		
		tfClientesCelular = new JFormattedTextField(Mascara.celular());
		tfClientesCelular.setColumns(10);
		
		tfClientesEmail = new JTextField();
		tfClientesEmail.setColumns(10);
		GroupLayout gl_pnClientes = new GroupLayout(pnClientes);
		gl_pnClientes.setHorizontalGroup(
			gl_pnClientes.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnClientes.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(lbClientes)
					.addGap(221))
				.addGroup(Alignment.LEADING, gl_pnClientes.createSequentialGroup()
					.addGap(69)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnClientes.createSequentialGroup()
							.addComponent(lbClientesCPF, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfClientesCPF, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnClientes.createSequentialGroup()
							.addComponent(lbClientesNome, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfClientesNome, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnClientes.createSequentialGroup()
							.addComponent(lbClientesCelular, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfClientesCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnClientes.createSequentialGroup()
							.addComponent(lbClientesEmail, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfClientesEmail)))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_pnClientes.setVerticalGroup(
			gl_pnClientes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnClientes.createSequentialGroup()
					.addGap(24)
					.addComponent(lbClientes)
					.addGap(54)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbClientesCPF)
						.addComponent(tfClientesCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbClientesNome)
						.addComponent(tfClientesNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbClientesCelular)
						.addComponent(tfClientesCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_pnClientes.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbClientesEmail)
						.addComponent(tfClientesEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		pnClientes.setLayout(gl_pnClientes);

		pnFornecedores = new JPanel();
		pnFornecedores.setBackground(new Color(128, 128, 128));
		pnCentral.add(pnFornecedores,Paineis.FORNECEDORES.toString());

		lbFornecedores = new JLabel("Fornecedores");
		lbFornecedores.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		lbFornecedorID = new JLabel("C\u00F3digo:");
		
		tfFornecedorID = new JTextField();
		tfFornecedorID.setText("Preenchimento Autom\u00E1tico");
		tfFornecedorID.setEnabled(false);
		tfFornecedorID.setColumns(10);
		
		lbFornecedorCNPJ = new JLabel("CNPJ:");
		
		tfFornecedorCNPJ = new JFormattedTextField(Mascara.cnpj());
		tfFornecedorCNPJ.setColumns(10);
		
		lbFornecedorNome = new JLabel("Nome:");
		
		tfFornecedorNome = new JTextField();
		tfFornecedorNome.setColumns(10);
		
		lbFornecedorTelefone = new JLabel("Telefone:");
		
		tfFornecedorTelefone = new JFormattedTextField(Mascara.telefone());
		tfFornecedorTelefone.setColumns(10);
		
		lbFornecedorEmail = new JLabel("Email:");
		
		tfFornecedorEmail = new JTextField();
		tfFornecedorEmail.setColumns(10);
		GroupLayout gl_pnFornecedores = new GroupLayout(pnFornecedores);
		gl_pnFornecedores.setHorizontalGroup(
			gl_pnFornecedores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnFornecedores.createSequentialGroup()
					.addContainerGap(54, Short.MAX_VALUE)
					.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnFornecedores.createSequentialGroup()
							.addComponent(lbFornecedores)
							.addGap(152))
						.addGroup(gl_pnFornecedores.createSequentialGroup()
							.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbFornecedorEmail)
								.addComponent(lbFornecedorTelefone)
								.addComponent(lbFornecedorNome)
								.addComponent(lbFornecedorCNPJ)
								.addComponent(lbFornecedorID))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tfFornecedorEmail)
								.addComponent(tfFornecedorNome, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
								.addComponent(tfFornecedorTelefone, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfFornecedorCNPJ, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfFornecedorID, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
							.addGap(35))))
		);
		gl_pnFornecedores.setVerticalGroup(
			gl_pnFornecedores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnFornecedores.createSequentialGroup()
					.addGap(22)
					.addComponent(lbFornecedores)
					.addGap(39)
					.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbFornecedorID)
						.addComponent(tfFornecedorID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbFornecedorCNPJ)
						.addComponent(tfFornecedorCNPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbFornecedorNome)
						.addComponent(tfFornecedorNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbFornecedorTelefone)
						.addComponent(tfFornecedorTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnFornecedores.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfFornecedorEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbFornecedorEmail))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		pnFornecedores.setLayout(gl_pnFornecedores);
		
		pnEntradas = new JPanel();
		pnCentral.add(pnEntradas, Paineis.ENTRADAS.toString());
		pnEntradas.setLayout(new BorderLayout(0, 0));
		
		pnEntradasTitulo = new JPanel();
		pnEntradas.add(pnEntradasTitulo, BorderLayout.NORTH);
		
		lbEntradas = new JLabel("Entradas");
		lbEntradas.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		lbIncluir = new JLabel("Incluir");
		lbIncluir.setForeground(Color.BLUE);
		lbIncluir.setPreferredSize(new Dimension(50, 0));
		lbIncluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cadastraEntrada();
			}
		});
		lbIncluir.setBorder(null);
		lbIncluir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbIncluir.setIcon(new ImageIcon(Tela.class.getResource("/images/btAdiciona.png")));
		
		lbAlterar = new JLabel("<html><font color=green>Alterar</font></html>");
		lbAlterar.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lbAlterar.setIcon(new ImageIcon(Tela.class.getResource("/images/btAltera.png")));
		lbAlterar.setPreferredSize(new Dimension(50, 0));
		lbAlterar.setHorizontalAlignment(SwingConstants.CENTER);
		lbAlterar.setBorder(null);
		
		lbExcluir = new JLabel("<html><font color=red>Excluir</font></html>");
		lbExcluir.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lbExcluir.setIcon(new ImageIcon(Tela.class.getResource("/images/btExclui.png")));
		lbExcluir.setPreferredSize(new Dimension(50, 0));
		lbExcluir.setHorizontalAlignment(SwingConstants.CENTER);
		lbExcluir.setBorder(null);
		GroupLayout gl_pnEntradasTitulo = new GroupLayout(pnEntradasTitulo);
		gl_pnEntradasTitulo.setHorizontalGroup(
			gl_pnEntradasTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnEntradasTitulo.createSequentialGroup()
					.addGap(139)
					.addComponent(lbEntradas, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lbIncluir, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbAlterar, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbExcluir, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pnEntradasTitulo.setVerticalGroup(
			gl_pnEntradasTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnEntradasTitulo.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(gl_pnEntradasTitulo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbIncluir, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
						.addComponent(lbAlterar, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
						.addComponent(lbExcluir, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
					.addGap(15))
				.addGroup(Alignment.LEADING, gl_pnEntradasTitulo.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(lbEntradas))
		);
		pnEntradasTitulo.setLayout(gl_pnEntradasTitulo);
		
		scEntradas = new JScrollPane();
		pnEntradas.add(scEntradas, BorderLayout.CENTER);
		
		tbEntradas = new JTable();
		tbEntradas.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scEntradas.setViewportView(tbEntradas);
		
		pnSaidas = new JPanel();
		pnCentral.add(pnSaidas, Paineis.SAIDAS.toString());
		pnSaidas.setLayout(new BorderLayout(0, 0));
		
		pnSaidaTitulo = new JPanel();
		pnSaidas.add(pnSaidaTitulo, BorderLayout.NORTH);
		
		lbSaidaTitulo = new JLabel("Saídas");
		lbSaidaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 32));
		pnSaidaTitulo.add(lbSaidaTitulo);
		
		scSaidas = new JScrollPane();
		pnSaidas.add(scSaidas, BorderLayout.CENTER);
		
		tbSaidas = new JTable();
		tbSaidas.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scSaidas.setViewportView(tbSaidas);
		
		pnKardex = new JPanel();
		pnCentral.add(pnKardex, "name_247247875326900");
		pnKardex.setLayout(new BorderLayout(0, 0));
		
		pnKardexTitulo = new JPanel();
		pnKardex.add(pnKardexTitulo, BorderLayout.NORTH);
		
		lbKardexTitulo = new JLabel("Ficha de Kardex");
		pnKardexTitulo.add(lbKardexTitulo);
		lbKardexTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		pnKardexTabela = new JScrollPane();
		pnKardex.add(pnKardexTabela, BorderLayout.CENTER);
		
		tbKardex = new JTable();
		tbKardex.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		pnKardexTabela.setViewportView(tbKardex);
	}

	/*
	 * Inclua métodos somente após este comentário Pendências: - unificar selector
	 * - bloquear acesso ao código e qtdeEstoque
	 * 
	 */

	private void listaFornecedor() {
		for (Fornecedor f: Fornecedor.getLista()) {
			System.out.println(f);
		}
	}
	
	private void listaProduto() {
		new TelaListagem(painel).setVisible(true);
	}

	private void limpaTelaFornecedor() {
		tfFornecedorID.setText("");
		tfFornecedorCNPJ.setText("");
		tfFornecedorNome.setText("");
		tfFornecedorTelefone.setText("");
		tfFornecedorEmail.setText("");
		tfFornecedorCNPJ.requestFocus();
	}
	
	private void limpaTelaProduto() {
		tfProdutoID.setText("");
		tfProdutoNome.setText("");
		tfProdutoLocalizacao.setText("");
		tfProdutoQtdeMaxima.setText("");
		tfProdutoQtdeMinima.setText("");
		tfProdutoQtdeEstoque.setText("");
		tfProdutoNome.requestFocus();
	}
	


	private void gravaFornecedor() {
		int id = Converte.toInt(tfFornecedorID.getText());
		String cnpj = tfFornecedorCNPJ.getText();
		String nome = tfFornecedorNome.getText();
		String telefone = tfFornecedorTelefone.getText();
		String email = tfFornecedorEmail.getText();
		new Fornecedor(cnpj,nome,telefone,email);
		limpaTelaFornecedor();
	}
	
	private void gravaClientes() {
		
		String cpf = tfClientesCPF.getText();
		String nome = tfClientesNome.getText();
		String telefone = tfClientesCelular.getText();
		String email = tfClientesEmail.getText();
		new Cliente (cpf,nome,telefone,email);
		limpaTelaClientes();
	}
	
	private void limpaTelaClientes() {
		tfFornecedorID.setText("");
		tfClientesCPF.setText("");
		tfClientesNome.setText("");
		tfClientesCelular.setText("");
		tfClientesEmail.setText("");
		tfClientesCPF.requestFocus();
	}
	
	private void gravaProduto() {
		int id = Converte.toInt(tfProdutoID.getText());
		String nome = tfProdutoNome.getText();
		String localizacao = tfProdutoLocalizacao.getText();
		int qtdeMaxima = Integer.parseInt(tfProdutoQtdeMaxima.getText());
		int qtdeMinima = Integer.parseInt(tfProdutoQtdeMinima.getText());
		int qtdeEstoque = Integer.parseInt(tfProdutoQtdeEstoque.getText());
		new Produto(nome, localizacao, qtdeMaxima, qtdeMinima, qtdeEstoque);
		
		limpaTelaProduto();
	}

	private void setPainel(Paineis pn) {
		CardLayout cl = (CardLayout) pnCentral.getLayout();
		cl.show(pnCentral,pn.toString());
		painel = pn;
		if (painel == Paineis.ENTRADAS) {
			atualizaTabelaEntradas();
		}
		else if (painel == Paineis.SAIDAS)
			atualizaTabelaSaidas();
	}
	
	private void atualizaTabelaEntradas() {
		tbEntradas.setModel(Entrada.getTableModel());
		DefaultTableCellRenderer centro =  new DefaultTableCellRenderer();
		centro.setHorizontalAlignment(SwingConstants.CENTER);
		
		DefaultTableCellRenderer direita =  new DefaultTableCellRenderer();
		direita.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tbEntradas.getTableHeader().setDefaultRenderer(centro);
		tbEntradas.getColumnModel().getColumn(0).setCellRenderer(centro);
		tbEntradas.getColumnModel().getColumn(3).setCellRenderer(centro);
		tbEntradas.getColumnModel().getColumn(5).setCellRenderer(direita);
		tbEntradas.getColumnModel().getColumn(6).setCellRenderer(direita);
		
		
		tbEntradas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
		tbEntradas.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(40);
		tbEntradas.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(50);
	}
	
	private void atualizaTabelaSaidas() {
		tbSaidas.setModel(Saida.getTableModel());
		DefaultTableCellRenderer centro =  new DefaultTableCellRenderer();
		centro.setHorizontalAlignment(SwingConstants.CENTER);
		
		DefaultTableCellRenderer direita =  new DefaultTableCellRenderer();
		direita.setHorizontalAlignment(SwingConstants.RIGHT);
		
		tbSaidas.getTableHeader().setDefaultRenderer(centro);
		tbSaidas.getColumnModel().getColumn(0).setCellRenderer(centro);
		tbSaidas.getColumnModel().getColumn(3).setCellRenderer(centro);
		tbSaidas.getColumnModel().getColumn(5).setCellRenderer(direita);
		tbSaidas.getColumnModel().getColumn(6).setCellRenderer(direita);
		
		
		tbSaidas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
		tbSaidas.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(40);
		tbSaidas.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(50);
	}
	
	private void setLookAndFeel() {
		String laf = (String) cbTema.getSelectedItem();
		Configura.configuraLookAndFeel(laf);
		SwingUtilities.updateComponentTreeUI(this);
		this.repaint();
	}

	private void setTemas() {
		// limpar o combobox de temas
		cbTema.removeAllItems();
		// pegar os look and feel disponíveis no sistema operacional
		for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			// preencher o combobox com os look and feel disponíveis
			cbTema.addItem(info.getName());
		}
		// ajusta Look and Feel Windows como padrão
		cbTema.setSelectedItem("Windows");
	}
	
	private void cadastraEntrada() {
		new TelaEntradas().setVisible(true);
	}
}
