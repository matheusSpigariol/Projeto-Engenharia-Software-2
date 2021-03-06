package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;

import conexaojdbc.ConnectionFactory;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class ViewPrincipal {

	JFrame frmPginaInicial;
	private JTextField textField;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ConnectionFactory con = new ConnectionFactory();
		con.conexao();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipal window = new ViewPrincipal();
					window.frmPginaInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPginaInicial = new JFrame();
		frmPginaInicial.setTitle("P\u00E1gina Inicial");
		frmPginaInicial.setBounds(100, 100, 440, 600);
		frmPginaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("P?gina Inicial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Relat?rio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Conta");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_3 = new JButton("Agenda");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_4 = new JButton("Estoque");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_5 = new JButton("Gerenciar Funcionarios");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewGerenciaFunc vf1 = new ViewGerenciaFunc();
			    vf1.rodaJanela();
			}
		});
		
		JButton btnNewButton_6 = new JButton("Cadastrar Fornecedor");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFornecedor vf1 = new ViewFornecedor();
			    vf1.rodaJanela();
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
		
		
		JLabel IconLabel = new JLabel("");
		IconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		IconLabel.setIcon(new ImageIcon(ViewFuncionario.class.getResource("/assets/funcionario.png")));
		IconLabel.setBounds(0, 0, 0, 0);
		//JanelaDeCadastro.getContentPane().add(IconLabel);
		
		
		JButton btnNewButton_7 = new JButton("Gerenciar Produto");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewGerenciaProd vf1 = new ViewGerenciaProd();
			    vf1.rodaJanela();
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frmPginaInicial.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(2, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(80, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
							.addComponent(btnNewButton_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(IconLabel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addGap(10)))
					.addGap(44)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(76))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(IconLabel, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
								.addGap(18)
								.addComponent(btnNewButton)
								.addGap(18)
								.addComponent(btnNewButton_2)
								.addGap(18)
								.addComponent(btnNewButton_3)
								.addGap(18)
								.addComponent(btnNewButton_1)
								.addGap(18)
								.addComponent(btnNewButton_4)
								.addGap(18)
								.addComponent(btnNewButton_5)
								.addGap(18)
								.addComponent(btnNewButton_7)
								.addGap(18)
								.addComponent(btnNewButton_6))))
					.addContainerGap())
		);
		frmPginaInicial.getContentPane().setLayout(groupLayout);
		frmPginaInicial.getContentPane().setBackground(new Color(238,232,170));

	}
}
