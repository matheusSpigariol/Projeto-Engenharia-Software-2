package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class ViewGerenciaProd {

	private JFrame frmGernciaDeProduto;
	private JTextField textField;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public void rodaJanela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGernciaDeProduto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public ViewGerenciaProd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGernciaDeProduto = new JFrame();
		frmGernciaDeProduto.setTitle("Ger\u00EAncia de Produto");
		frmGernciaDeProduto.setBounds(100, 100, 440, 600);
		frmGernciaDeProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("P?gina Inicial");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmGernciaDeProduto.setVisible(false);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Adicionar Produto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewProduto vf1 = new ViewProduto();
			    vf1.rodaJanela();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Lista de Produtos");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewListaProd vf2 = new ViewListaProd();
			    vf2.rodaJanela();
			}
		});
		
		textField = new JTextField("Controle de Estoque");
		textField.setEditable(false);
		textField.setBackground(Color.ORANGE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("-------Ger\u00EAncia de Produto-------");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		/*/JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(ViewFuncionario.class.getResource("C:\\Users\\Vin?ciusRozendoFerra\\Documents\\1Vinicius\\1Faculdade\\1Mat?rias\\prog\\EngSoftware2\\Projeto-Engenharia-Software-2")));
		lblNewLabel.setBounds(100, 0, 250, 250);
		ViewPrincipal.getContentPane().add(lblNewLabel);/*/
		
		GroupLayout groupLayout = new GroupLayout(frmGernciaDeProduto.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(72))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(btnNewButton_2)
							.addGap(18)
							.addComponent(btnNewButton_3)
							.addGap(294))
						.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		frmGernciaDeProduto.getContentPane().setLayout(groupLayout);
		frmGernciaDeProduto.getContentPane().setBackground(new Color(238,232,170));

	}
}
