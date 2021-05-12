package aula22;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.Font;

public class TelaFormatada extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lbData;
	private JLabel lbCelular;
	private JLabel lbCEP;
	private JFormattedTextField tfData;
	private JFormattedTextField tfCelular;
	private JFormattedTextField tfCEP;
	private JLabel lbTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFormatada frame = new TelaFormatada();
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
	public TelaFormatada() {
		initComponents();
		tfCelular.setFormatterFactory(new DefaultFormatterFactory(Mascara.celular()) );
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		lbData = new JLabel("Data");
		sl_panel.putConstraint(SpringLayout.NORTH, lbData, 67, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lbData, 74, SpringLayout.WEST, panel);
		panel.add(lbData);
		
		lbCelular = new JLabel("Celular");
		sl_panel.putConstraint(SpringLayout.WEST, lbCelular, 0, SpringLayout.WEST, lbData);
		panel.add(lbCelular);
		
		lbCEP = new JLabel("CEP: ");
		sl_panel.putConstraint(SpringLayout.NORTH, lbCEP, 62, SpringLayout.SOUTH, lbCelular);
		sl_panel.putConstraint(SpringLayout.WEST, lbCEP, 0, SpringLayout.WEST, lbData);
		panel.add(lbCEP);
		
		tfData = new JFormattedTextField(Mascara.data());
		sl_panel.putConstraint(SpringLayout.NORTH, tfData, 64, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, tfData, 24, SpringLayout.EAST, lbData);
		sl_panel.putConstraint(SpringLayout.EAST, tfData, 89, SpringLayout.EAST, lbData);
		tfData.setText("");
		panel.add(tfData);
		
		tfCelular = new JFormattedTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, tfCelular, 32, SpringLayout.SOUTH, tfData);
		sl_panel.putConstraint(SpringLayout.WEST, tfCelular, 13, SpringLayout.EAST, lbCelular);
		sl_panel.putConstraint(SpringLayout.EAST, tfCelular, -170, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lbCelular, 3, SpringLayout.NORTH, tfCelular);
		panel.add(tfCelular);
		
		tfCEP = new JFormattedTextField(Mascara.cep());
		sl_panel.putConstraint(SpringLayout.NORTH, tfCEP, 56, SpringLayout.SOUTH, tfCelular);
		sl_panel.putConstraint(SpringLayout.WEST, tfCEP, 20, SpringLayout.EAST, lbCEP);
		sl_panel.putConstraint(SpringLayout.EAST, tfCEP, -171, SpringLayout.EAST, panel);
		panel.add(tfCEP);
		
		lbTitulo = new JLabel("M\u00E1scaras de Formata\u00E7\u00E3o");
		sl_panel.putConstraint(SpringLayout.NORTH, lbTitulo, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lbTitulo, 102, SpringLayout.WEST, panel);
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lbTitulo);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
