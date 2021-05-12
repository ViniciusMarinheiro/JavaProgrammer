package aula15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.ComponentOrientation;
import javax.swing.SpringLayout;

public class TelaLayouts extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JTextField txtTextfield;
	private JButton btnNewButton_13;
	private JTextField txtTextfield_1;
	private JButton btnNewButton_14;
	private JLabel lblNewLabel;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JTextField txtEsteTextfieldDeve;
	private JButton btnNewButton_18;
	private JRadioButton rdbtnNewRadioButton;
	private JButton btnNewButton_19;
	private JCheckBox chckbxNewCheckBox;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton_20;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JButton btnNewButton_21;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLayouts frame = new TelaLayouts();
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
	public TelaLayouts() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("BorderLayout", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("Bot\u00E3o no Topo");
		panel.add(btnNewButton, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("Bot\u00E3o na Esquerda");
		panel.add(btnNewButton_1, BorderLayout.WEST);
		
		btnNewButton_2 = new JButton("Bot\u00E3o em Baixo");
		panel.add(btnNewButton_2, BorderLayout.SOUTH);
		
		btnNewButton_3 = new JButton("Bot\u00E3o na Direita");
		panel.add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("Bot\u00E3o no Centro");
		panel.add(btnNewButton_4, BorderLayout.CENTER);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("GridLayout", null, panel_1, null);
		panel_1.setLayout(new GridLayout(3, 5, 10, 10));
		
		btnNewButton_6 = new JButton("Bot\u00E3o 3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_5 = new JButton("Bot\u00E3o 1");
		panel_1.add(btnNewButton_5);
		
		btnNewButton_7 = new JButton("Bot\u00E3o 2");
		panel_1.add(btnNewButton_7);
		panel_1.add(btnNewButton_6);
		
		btnNewButton_9 = new JButton("Bot\u00E3o 4");
		panel_1.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("Bot\u00E3o 5");
		panel_1.add(btnNewButton_8);
		
		btnNewButton_10 = new JButton("Bot\u00E3o 6");
		panel_1.add(btnNewButton_10);
		
		btnNewButton_12 = new JButton("Bot\u00E3o 7");
		panel_1.add(btnNewButton_12);
		
		btnNewButton_11 = new JButton("Bot\u00E3o 8");
		panel_1.add(btnNewButton_11);
		
		txtTextfield = new JTextField();
		txtTextfield.setText("TextField 1");
		panel_1.add(txtTextfield);
		txtTextfield.setColumns(10);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("BoxLayout", null, panel_2, null);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		btnNewButton_13 = new JButton("Bot\u00E3o 1");
		panel_2.add(btnNewButton_13);
		
		txtTextfield_1 = new JTextField();
		txtTextfield_1.setText("TextField 1");
		panel_2.add(txtTextfield_1);
		txtTextfield_1.setColumns(10);
		
		btnNewButton_14 = new JButton("Bot\u00E3o 2");
		panel_2.add(btnNewButton_14);
		
		lblNewLabel = new JLabel("Label 1");
		panel_2.add(lblNewLabel);
		
		btnNewButton_15 = new JButton("Bot\u00E3o 3");
		panel_2.add(btnNewButton_15);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("FlowLayout", null, panel_3, null);
		
		btnNewButton_16 = new JButton("Bot\u00E3o 1");
		panel_3.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("Bot\u00E3o 2");
		panel_3.add(btnNewButton_17);
		
		txtEsteTextfieldDeve = new JTextField();
		txtEsteTextfieldDeve.setText("Este TextField deve ficar em um tamanho grande");
		panel_3.add(txtEsteTextfieldDeve);
		txtEsteTextfieldDeve.setColumns(10);
		
		btnNewButton_18 = new JButton("New button");
		panel_3.add(btnNewButton_18);
		
		rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel_3.add(rdbtnNewRadioButton);
		
		btnNewButton_19 = new JButton("New button");
		panel_3.add(btnNewButton_19);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox);
		
		comboBox = new JComboBox();
		panel_3.add(comboBox);
		
		comboBox_1 = new JComboBox();
		panel_3.add(comboBox_1);
		
		panel_5 = new JPanel();
		tabbedPane.addTab("GroupLayout", null, panel_5, null);
		
		lblNewLabel_1 = new JLabel("Login");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnNewButton_20 = new JButton("New button");
		
		lblNewLabel_2 = new JLabel("Senha");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
					.addContainerGap(349, Short.MAX_VALUE)
					.addComponent(btnNewButton_20)
					.addGap(105))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(164)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(230, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(79)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(113)
					.addComponent(btnNewButton_20)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("SpringLayout", null, panel_4, null);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		lblNewLabel_3 = new JLabel("Login");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 26, SpringLayout.NORTH, panel_4);
		panel_4.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_4.add(textField_2);
		
		btnNewButton_21 = new JButton("New button");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnNewButton_21, -35, SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnNewButton_21, -45, SpringLayout.EAST, panel_4);
		panel_4.add(btnNewButton_21);
		
		lblNewLabel_4 = new JLabel("Senha");
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_4, 27, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_2, -3, SpringLayout.NORTH, lblNewLabel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_2, 25, SpringLayout.EAST, lblNewLabel_4);
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 12, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_4);
		panel_4.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_3, -3, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField_2);
		textField_3.setColumns(10);
		panel_4.add(textField_3);
	}
}
