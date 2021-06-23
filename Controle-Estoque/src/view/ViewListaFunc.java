package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.FuncionarioController;
import dao.FuncionarioDAO;
import model.ModelFuncionario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewListaFunc {

	private JFrame frmListaDeFuncionrios;
	private JTextField textField;
	private JTextField textoBusca;
	private JTable table;
	private final String colunas[] = { "Nome", "CPF", "Cargo", "Telefone", "Usuario", "Senha" };
	private final String dados[][] = { { "Aqui", "é", "onde", "os", "dados", "ficarão" } };
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 * 
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
	 * 
	 * @wbp.parser.entryPoint
	 */
	public ViewListaFunc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Inicialização da table------------------------
		model = new DefaultTableModel();
		table = new JTable(model);

		FuncionarioDAO fdao = new FuncionarioDAO();

		model.addColumn("ID");
		model.addColumn("Nome");
		model.addColumn("CPF");
		model.addColumn("Cargo");
		model.addColumn("Telefone");
		model.addColumn("Usuario");
		model.addColumn("Senha");
		// -------------------------------------------------

		frmListaDeFuncionrios = new JFrame();
		frmListaDeFuncionrios.setTitle("Lista de Funcion\u00E1rios");
		frmListaDeFuncionrios.setBounds(100, 100, 440, 600);
		frmListaDeFuncionrios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnVolta = new JButton("Voltar");
		btnVolta.setBounds(110, 516, 197, 23);
		btnVolta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmListaDeFuncionrios.setVisible(false);
			}
		});

		textField = new JTextField("Controle de Estoque");
		textField.setEditable(false);
		textField.setBounds(0, 0, 424, 20);
		textField.setBackground(Color.ORANGE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);

		JButton btnRemove = new JButton("Remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
				int removeID = (int) table.getValueAt(index, 0);
				FuncionarioDAO f1 = new FuncionarioDAO();
				f1.excluiFuncionario(removeID);
				model.setRowCount(0);
				for (ModelFuncionario f : fdao.getAllFuncionario()) {

					model.addRow(new Object[] { f.getId(), f.getNome(), f.getCpf(), f.getCargo(), f.getTelefone(),
							f.getUsuario(), f.getSenha() });
				}
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

		JLabel editNome = new JLabel("Nome:");
		JLabel editCPF = new JLabel("CPF:");
		JLabel editCargo = new JLabel("Cargo:");
		JLabel editTelefone = new JLabel("Telefone:");
		JLabel editUsuario = new JLabel("Usu\u00E1rio:");
		JLabel editSenha = new JLabel("Senha:");
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
				int updateID = (int) table.getValueAt(index, 0);
				ModelFuncionario funAltera = new ModelFuncionario(String.valueOf(textField_1.getText()),
						String.valueOf(textField_2.getText()), updateID, String.valueOf(textField_3.getText()),
						String.valueOf(textField_4.getText()), String.valueOf(textField_5.getText()),
						String.valueOf(textField_6.getText()));
				int erro = new FuncionarioController().editarFuncionario(funAltera);
				System.out.println(erro);
				model.setRowCount(0);
				for (ModelFuncionario f : fdao.getAllFuncionario()) {

					model.addRow(new Object[] { f.getId(), f.getNome(), f.getCpf(), f.getCargo(), f.getTelefone(),
							f.getUsuario(), f.getSenha() });
				}
			}
		});
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editNome.setEnabled(false);
				editCPF.setEnabled(false);
				editCargo.setEnabled(false);
				editTelefone.setEnabled(false);
				editUsuario.setEnabled(false);
				editSenha.setEnabled(false);
				btnSalvar.setEnabled(false);
			}
		});

		JButton btnAltera = new JButton("Alterar");
		btnAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editNome.setEnabled(true);
				editCPF.setEnabled(true);
				editCargo.setEnabled(true);
				editTelefone.setEnabled(true);
				editUsuario.setEnabled(true);
				editSenha.setEnabled(true);
				btnSalvar.setEnabled(true);
				btnCancelar.setEnabled(true);
				int index = table.getSelectedRow();
				if (index >= 0 && index < table.getRowCount()) {
					String NOME = (String) table.getValueAt(index, 1);
					String CPF = (String) table.getValueAt(index, 2);
					String CARGO = (String) table.getValueAt(index, 3);
					String TELEFONE = (String) table.getValueAt(index, 4);
					String USUARIO = (String) table.getValueAt(index, 5);
					String SENHA = (String) table.getValueAt(index, 6);
					textField_1.setText(NOME);
					textField_2.setText(CPF);
					textField_3.setText(CARGO);
					textField_4.setText(TELEFONE);
					textField_5.setText(USUARIO);
					textField_6.setText(SENHA);
				}
			}
		});
		btnAltera.setBounds(303, 249, 111, 23);

		JButton btnBusca = new JButton("Buscar");
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				model.setRowCount(0); // limpa a tabela

				if (textoBusca.getText().equals("")) {
					for (ModelFuncionario f : fdao.getAllFuncionario()) {

						model.addRow(new Object[] { f.getId(), f.getNome(), f.getCpf(), f.getCargo(), f.getTelefone(),
								f.getUsuario(), f.getSenha() });
					}
				} else {
					for (ModelFuncionario f : fdao.getPesquisa(textoBusca.getText())) {

						model.addRow(new Object[] { f.getId(), f.getNome(), f.getCpf(), f.getCargo(), f.getTelefone(),
								f.getUsuario(), f.getSenha() });
					}
				}

			}
		});
		btnBusca.setBounds(10, 215, 111, 23);

		textoBusca = new JTextField();
		textoBusca.setBounds(153, 216, 261, 20);
		textoBusca.setColumns(10);
		frmListaDeFuncionrios.getContentPane().setBackground(new Color(238, 232, 170));
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

		// 09/06/2021 - Antonio, Matheus e Rapha

		for (ModelFuncionario f : fdao.getAllFuncionario()) {

			model.addRow(new Object[] { f.getId(), f.getNome(), f.getCpf(), f.getCargo(), f.getTelefone(),
					f.getUsuario(), f.getSenha() });
		}
		// acaba aq, resto pro prox sprint (clown emoji)
		// TO-DO -> remover opção de editar as linhas da tabela!

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnAltera.setEnabled(true);
				btnRemove.setEnabled(true);
			}
		});

		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("-----Lista de Funcionarios------");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(99, 31, 237, 14);
		frmListaDeFuncionrios.getContentPane().add(lblNewLabel);

		editNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editNome.setBounds(20, 296, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editNome);

		editCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editCPF.setBounds(20, 321, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editCPF);

		editCargo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editCargo.setBounds(20, 346, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editCargo);

		editTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editTelefone.setBounds(20, 371, 56, 14);
		frmListaDeFuncionrios.getContentPane().add(editTelefone);

		editUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editUsuario.setBounds(20, 395, 46, 14);
		frmListaDeFuncionrios.getContentPane().add(editUsuario);

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

		btnSalvar.setBounds(20, 460, 187, 23);
		frmListaDeFuncionrios.getContentPane().add(btnSalvar);

		btnCancelar.setBounds(217, 460, 179, 23);
		frmListaDeFuncionrios.getContentPane().add(btnCancelar);

		btnSalvar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnAltera.setEnabled(false);
		btnRemove.setEnabled(false);
		editNome.setEnabled(false);
		editCPF.setEnabled(false);
		editCargo.setEnabled(false);
		editTelefone.setEnabled(false);
		editUsuario.setEnabled(false);
		editSenha.setEnabled(false);

	}
}
