package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;

public class ViewListaFunc {

	private JFrame frmListaDeFuncionrios;
	private JTextField textField;
	private JTextField textoBusca;
	private JTable table;
	private final String colunas[]={"Nome","CPF","Cargo", "Telefone", "Usuario"};
	private final String dados[][]={};
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public void rodaJanela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmListaDeFuncionrios.setVisible(true);
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
	public ViewListaFunc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeFuncionrios = new JFrame();
		frmListaDeFuncionrios.setTitle("Lista de Funcion\u00E1rios");
		frmListaDeFuncionrios.setBounds(100, 100, 440, 600);
		frmListaDeFuncionrios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVolta = new JButton("Voltar");
		btnVolta.setBounds(10, 517, 197, 23);
		btnVolta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewGerenciaFunc vf1 = new ViewGerenciaFunc();
			    vf1.rodaJanela();
			}
		});
		
		textField = new JTextField("Controle de Estoque");
		textField.setBounds(0, 0, 424, 20);
		textField.setBackground(Color.ORANGE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JButton btnRemove = new JButton("Remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemove.setBounds(153, 249, 111, 23);
		
		JButton btnAdiciona = new JButton("Adicionar");
		btnAdiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFuncionario vf1 = new ViewFuncionario();
			    vf1.rodaJanela();
			}
		});
		btnAdiciona.setBounds(10, 249, 111, 23);
		
		JButton btnAltera = new JButton("Alterar");
		btnAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAltera.setBounds(303, 249, 111, 23);
		
		JButton btnBusca = new JButton("Buscar");
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBusca.setBounds(10, 215, 111, 23);
		
		textoBusca = new JTextField();
		textoBusca.setBounds(153, 216, 261, 20);
		textoBusca.setColumns(10);
		frmListaDeFuncionrios.getContentPane().setBackground(new Color(238,232,170));
		frmListaDeFuncionrios.getContentPane().setLayout(null);
		frmListaDeFuncionrios.getContentPane().add(textField);
		frmListaDeFuncionrios.getContentPane().add(btnVolta);
		frmListaDeFuncionrios.getContentPane().add(btnAdiciona);
		frmListaDeFuncionrios.getContentPane().add(btnBusca);
		frmListaDeFuncionrios.getContentPane().add(btnRemove);
		frmListaDeFuncionrios.getContentPane().add(btnAltera);
		frmListaDeFuncionrios.getContentPane().add(textoBusca);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 404, 139);
		frmListaDeFuncionrios.getContentPane().add(scrollPane);
		
		table = new JTable(dados,colunas);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("-----Lista de Funcion\u00E1rios------");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(99, 31, 237, 14);
		frmListaDeFuncionrios.getContentPane().add(lblNewLabel);
		
		JButton btnInicio = new JButton("P\u00E1gina Inicial");
		btnInicio.setBounds(217, 517, 197, 23);
		frmListaDeFuncionrios.getContentPane().add(btnInicio);
		
		JLabel editNome = new JLabel("Nome:");
		editNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editNome.setBounds(20, 296, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editNome);
		
		JLabel editCPF = new JLabel("CPF:");
		editCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editCPF.setBounds(20, 321, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editCPF);
		
		JLabel editCargo = new JLabel("Cargo:");
		editCargo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editCargo.setBounds(20, 346, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editCargo);
		
		JLabel editTelefone = new JLabel("Telefone:");
		editTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editTelefone.setBounds(20, 371, 56, 14);
		frmListaDeFuncionrios.getContentPane().add(editTelefone);
		
		JLabel editUsuario = new JLabel("Usu\u00E1rio:");
		editUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editUsuario.setBounds(20, 395, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editUsuario);
		
		JLabel editSenha = new JLabel("Senha:");
		editSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editSenha.setBounds(20, 420, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 294, 310, 20);
		frmListaDeFuncionrios.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 319, 310, 20);
		frmListaDeFuncionrios.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(86, 344, 310, 20);
		frmListaDeFuncionrios.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(86, 369, 310, 20);
		frmListaDeFuncionrios.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(86, 393, 310, 20);
		frmListaDeFuncionrios.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(86, 418, 310, 20);
		frmListaDeFuncionrios.getContentPane().add(textField_6);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(20, 460, 187, 23);
		frmListaDeFuncionrios.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(217, 460, 179, 23);
		frmListaDeFuncionrios.getContentPane().add(btnCancelar);
		

	}
}
