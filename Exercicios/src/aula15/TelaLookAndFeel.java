package aula15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLookAndFeel extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btAltera;
	private JRadioButton rdbtnNewRadioButton;
	private JSpinner spinner;
	private JCheckBox chckbxNewCheckBox;
	private JProgressBar progressBar;
	private JScrollBar scrollBar;
	private JSlider slider;
	private JPanel panel_1;
	private JPanel panel_2;
	private JComboBox cbLAF;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLookAndFeel frame = new TelaLookAndFeel();
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
	public TelaLookAndFeel() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		lblNewLabel = new JLabel("Isto \u00E9 um Label");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 76, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 44, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);

		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, textField, -285, SpringLayout.EAST, panel);
		panel.add(textField);
		textField.setColumns(10);

		btAltera = new JButton("Altera L&F");
		btAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLookAndFeel();
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btAltera, 32, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, btAltera, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(btAltera);

		rdbtnNewRadioButton = new JRadioButton("Radio button");
		sl_panel.putConstraint(SpringLayout.SOUTH, textField, -29, SpringLayout.NORTH, rdbtnNewRadioButton);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 0, SpringLayout.NORTH, btAltera);
		panel.add(rdbtnNewRadioButton);

		spinner = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, spinner, 73, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, spinner, 63, SpringLayout.EAST, textField);
		panel.add(spinner);

		chckbxNewCheckBox = new JCheckBox("Check box");
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton, -92, SpringLayout.WEST, chckbxNewCheckBox);
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 0, SpringLayout.NORTH, btAltera);
		panel.add(chckbxNewCheckBox);

		progressBar = new JProgressBar();
		progressBar.setValue(60);
		sl_panel.putConstraint(SpringLayout.NORTH, progressBar, 28, SpringLayout.SOUTH, btAltera);
		sl_panel.putConstraint(SpringLayout.WEST, progressBar, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, progressBar, -464, SpringLayout.EAST, panel);
		panel.add(progressBar);

		scrollBar = new JScrollBar();
		sl_panel.putConstraint(SpringLayout.EAST, spinner, -23, SpringLayout.WEST, scrollBar);
		sl_panel.putConstraint(SpringLayout.EAST, chckbxNewCheckBox, -124, SpringLayout.WEST, scrollBar);
		sl_panel.putConstraint(SpringLayout.NORTH, scrollBar, 76, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, scrollBar, 164, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, scrollBar, -10, SpringLayout.EAST, panel);
		panel.add(scrollBar);

		slider = new JSlider();
		sl_panel.putConstraint(SpringLayout.NORTH, slider, 0, SpringLayout.NORTH, progressBar);
		sl_panel.putConstraint(SpringLayout.EAST, slider, -100, SpringLayout.EAST, panel);
		panel.add(slider);

		panel_1 = new JPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, -76, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 186, SpringLayout.WEST, panel);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_1);

		panel_2 = new JPanel();
		panel_2.setToolTipText("");
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, panel_1);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, slider);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -76, SpringLayout.EAST, panel);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.add(panel_2);

		cbLAF = new JComboBox();
		cbLAF.setModel(new DefaultComboBoxModel(
				new String[] { "Metal", "Nimbus", "CDE/Motif", "Windows", "Windows Classic" }));
		sl_panel.putConstraint(SpringLayout.NORTH, cbLAF, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, cbLAF, 183, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, cbLAF, -180, SpringLayout.EAST, panel);
		panel.add(cbLAF);

		lblNewLabel_1 = new JLabel("Look and Feel");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, -4, SpringLayout.NORTH, cbLAF);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -18, SpringLayout.WEST, cbLAF);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_1);
	}

	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}

	private void setLookAndFeel() {
		String laf = cbLAF.getSelectedItem().toString();
		try {
			for (LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
				if (laf.equals(info.getName()) ) {
					UIManager.setLookAndFeel(info.getClassName());
					SwingUtilities.updateComponentTreeUI(this);
					this.repaint();
					break;
				}
			}
		}catch (ClassNotFoundException | InstantiationException |
				IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

	}
}
