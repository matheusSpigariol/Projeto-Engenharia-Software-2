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

public class ViewListaProd {

	private JFrame frmListaDeProdutos;
	private JTextField textField;
	private JTextField textoBusca;
	private JTable table;
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
					frmListaDeProdutos.setVisible(true);
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
	public ViewListaProd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Inicializa��o da table------------------------
		model = new DefaultTableModel();
		table = new JTable(model);

		//FuncionarioDAO fdao = new FuncionarioDAO();

		model.addColumn("ID");
		model.addColumn("Nome");
		model.addColumn("Descri��o");
		model.addColumn("Quantidade");
		model.addColumn("Pre�o");
		model.addColumn("Validade");
		model.addColumn("Fornecedor");
		// -------------------------------------------------

		frmListaDeProdutos = new JFrame();
		frmListaDeProdutos.setTitle("Lista de Produtos");
		frmListaDeProdutos.setBounds(100, 100, 440, 600);
		frmListaDeProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnVolta = new JButton("Voltar");
		btnVolta.setBounds(110, 516, 197, 23);
		btnVolta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmListaDeProdutos.setVisible(false);
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
				//integra a� kkkk
			}
		});
		btnRemove.setBounds(153, 249, 111, 23);

		JButton btnAdiciona = new JButton("Adicionar");
		btnAdiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewProduto vf1 = new ViewProduto();
				vf1.rodaJanela();
			}
		});
		btnAdiciona.setBounds(10, 249, 111, 23);

		JLabel editNome = new JLabel("Nome:");
		JLabel editDescricao = new JLabel("Descri\u00E7\u00E3o:");
		JLabel editQuantidade = new JLabel("Quantidade:");
		JLabel editPreco = new JLabel("Pre\u00E7o:");
		JLabel editValidade = new JLabel("Validade:");
		JLabel editFornecedor = new JLabel("Fornecedor:");
		JButton btnSalvar = new JButton("Salvar");
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//integrar com banco, se vira kkkkk
			}
		});
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editNome.setEnabled(false);
				editDescricao.setEnabled(false);
				editQuantidade.setEnabled(false);
				editPreco.setEnabled(false);
				editValidade.setEnabled(false);
				editFornecedor.setEnabled(false);
				btnSalvar.setEnabled(false);
			}
		});

		JButton btnAltera = new JButton("Alterar");
		btnAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editNome.setEnabled(true);
				editDescricao.setEnabled(true);
				editQuantidade.setEnabled(true);
				editPreco.setEnabled(true);
				editValidade.setEnabled(true);
				editFornecedor.setEnabled(true);
				btnSalvar.setEnabled(true);
				btnCancelar.setEnabled(true);
				//integra
			}
		});
		btnAltera.setBounds(303, 249, 111, 23);

		JButton btnBusca = new JButton("Buscar");
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//integra

			}
		});
		btnBusca.setBounds(10, 215, 111, 23);

		textoBusca = new JTextField();
		textoBusca.setBounds(153, 216, 261, 20);
		textoBusca.setColumns(10);
		frmListaDeProdutos.getContentPane().setBackground(new Color(238, 232, 170));
		frmListaDeProdutos.getContentPane().setLayout(null);
		frmListaDeProdutos.getContentPane().add(textField);
		frmListaDeProdutos.getContentPane().add(btnVolta);
		frmListaDeProdutos.getContentPane().add(btnAdiciona);
		frmListaDeProdutos.getContentPane().add(btnBusca);
		frmListaDeProdutos.getContentPane().add(btnRemove);
		frmListaDeProdutos.getContentPane().add(btnAltera);
		frmListaDeProdutos.getContentPane().add(textoBusca);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 404, 139);
		frmListaDeProdutos.getContentPane().add(scrollPane);

		

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnAltera.setEnabled(true);
				btnRemove.setEnabled(true);
			}
		});

		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("-----Lista de Produtos------");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(99, 31, 237, 14);
		frmListaDeProdutos.getContentPane().add(lblNewLabel);

		editNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editNome.setBounds(20, 296, 46, 14);
		frmListaDeProdutos.getContentPane().add(editNome);

		editDescricao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editDescricao.setBounds(20, 321, 56, 14);
		frmListaDeProdutos.getContentPane().add(editDescricao);

		editQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editQuantidade.setBounds(20, 346, 67, 14);
		frmListaDeProdutos.getContentPane().add(editQuantidade);

		editPreco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editPreco.setBounds(20, 371, 56, 14);
		frmListaDeProdutos.getContentPane().add(editPreco);

		editValidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editValidade.setBounds(20, 395, 56, 14);
		frmListaDeProdutos.getContentPane().add(editValidade);

		editFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editFornecedor.setBounds(20, 420, 67, 14);
		frmListaDeProdutos.getContentPane().add(editFornecedor);

		textField_1 = new JTextField();
		textField_1.setBounds(95, 294, 301, 20);
		frmListaDeProdutos.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(95, 319, 301, 20);
		frmListaDeProdutos.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(95, 344, 301, 20);
		frmListaDeProdutos.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 369, 301, 20);
		frmListaDeProdutos.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(95, 393, 301, 20);
		frmListaDeProdutos.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(95, 418, 301, 20);
		frmListaDeProdutos.getContentPane().add(textField_6);

		btnSalvar.setBounds(20, 460, 187, 23);
		frmListaDeProdutos.getContentPane().add(btnSalvar);

		btnCancelar.setBounds(217, 460, 179, 23);
		frmListaDeProdutos.getContentPane().add(btnCancelar);

		btnSalvar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnAltera.setEnabled(false);
		btnRemove.setEnabled(false);
		editNome.setEnabled(false);
		editDescricao.setEnabled(false);
		editQuantidade.setEnabled(false);
		editPreco.setEnabled(false);
		editValidade.setEnabled(false);
		editFornecedor.setEnabled(false);

	}
}
