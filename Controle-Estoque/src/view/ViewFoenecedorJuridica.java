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
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;

import conexaojdbc.ConnectionFactory;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class ViewFoenecedorJuridica {

	private JFrame frame;
	private JTextField txtControleDeEstoque;
	private JTextField txtNome;
	private JTextField txtCategoria;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtEstado;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtEmail;
	private JTextField txtCelular;
	private JTextField txtTelefone;
	private JTextField txtSite;
	private JTextField txtCpf;
	private JTextField txtObservacao;
	private JTextField txtRazaoSocial;
	private JTextField txtInscricaoEstadual;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public void rodaJanela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
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
	public ViewFoenecedorJuridica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtControleDeEstoque = new JTextField("Controle de Estoque - Pessoa Fisica");
		txtControleDeEstoque.setEditable(false);
		txtControleDeEstoque.setBackground(Color.ORANGE);
		txtControleDeEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		txtControleDeEstoque.setColumns(10);
		/*/JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(ViewFuncionario.class.getResource("C:\\Users\\ViníciusRozendoFerra\\Documents\\1Vinicius\\1Faculdade\\1Matérias\\prog\\EngSoftware2\\Projeto-Engenharia-Software-2")));
		lblNewLabel.setBounds(100, 0, 250, 250);
		ViewPrincipal.getContentPane().add(lblNewLabel);/*/
		
		txtNome = new JTextField();
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtNome.setText("Nome Fantasia");
		txtNome.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		txtCategoria.setText("Categoria");
		txtCategoria.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setHorizontalAlignment(SwingConstants.CENTER);
		txtCep.setText("CEP");
		txtCep.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		txtEndereco.setText("Endereco");
		txtEndereco.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setText("numero");
		txtNumero.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstado.setText("Estado");
		txtEstado.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtCidade.setText("Cidade");
		txtCidade.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setHorizontalAlignment(SwingConstants.CENTER);
		txtBairro.setText("Bairro");
		txtBairro.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setText("E-mail");
		txtEmail.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelular.setText("Celular");
		txtCelular.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelefone.setText("Telefone");
		txtTelefone.setColumns(10);
		
		txtSite = new JTextField();
		txtSite.setHorizontalAlignment(SwingConstants.CENTER);
		txtSite.setText("Site");
		txtSite.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtCpf.setText("CNPJ");
		txtCpf.setColumns(10);
		
		txtObservacao = new JTextField();
		txtObservacao.setHorizontalAlignment(SwingConstants.CENTER);
		txtObservacao.setText("Observacao");
		txtObservacao.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		
		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setHorizontalAlignment(SwingConstants.CENTER);
		txtRazaoSocial.setText("Razao Social");
		txtRazaoSocial.setColumns(10);
		
		txtInscricaoEstadual = new JTextField();
		txtInscricaoEstadual.setText("Inscricao Estadual");
		txtInscricaoEstadual.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtControleDeEstoque, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtCpf, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(txtObservacao, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtEndereco, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
												.addComponent(txtBairro, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(txtCidade, 84, 84, 84)
												.addComponent(txtTelefone, 84, 84, 84))
											.addGap(2))
										.addComponent(txtSite, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtEstado)
										.addComponent(txtNumero)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtInscricaoEstadual, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
												.addComponent(txtCelular, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtNome, Alignment.LEADING)
										.addComponent(txtCategoria, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
									.addGap(16)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtRazaoSocial, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
										.addComponent(txtCep, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(198)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
					.addGap(28))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtControleDeEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRazaoSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtInscricaoEstadual, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtObservacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(183)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().setBackground(new Color(238,232,170));

	}
}
