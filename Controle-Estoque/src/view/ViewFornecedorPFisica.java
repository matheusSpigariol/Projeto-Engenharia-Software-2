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
import javax.swing.JOptionPane;

import java.awt.Font;

public class ViewFornecedorPFisica {

	private JFrame frame;
	private JTextField txtControleDeEstoque;
	private JTextField txtNomePF;
	private JTextField txtCategoriaPF;
	private JTextField txtCepPF;
	private JTextField txtEnderecoPF;
	private JTextField txtNumeroPF;
	private JTextField txtEstadoPF;
	private JTextField txtCidadePF;
	private JTextField txtBairroPF;
	private JTextField txtEmailPF;
	private JTextField txtCelularPF;
	private JTextField txtTelefonePF;
	private JTextField txtSitePF;
	private JTextField txtCpfPF;
	private JTextField txtObservacaoPF;
	private JButton btnNewButton_1;
	private JLabel CategoriaPF;
	private JLabel CepPF;
	private JLabel EndereoPF;
	private JLabel NumeroPF;
	private JLabel EnderecoPF;
	private JLabel CidadePF;
	private JLabel EstadoPF;
	private JLabel EmailPF;
	private JLabel TelefonePF;
	private JLabel CelularPF;
	private JLabel SitePF;
	private JLabel CpfPF;
	private JLabel ObservacaoPF;

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
	public ViewFornecedorPFisica() {
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
		
		txtNomePF = new JTextField();
		txtNomePF.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomePF.setColumns(10);
		
		txtCategoriaPF = new JTextField();
		txtCategoriaPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtCategoriaPF.setColumns(10);
		
		txtCepPF = new JTextField();
		txtCepPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtCepPF.setColumns(10);
		
		txtEnderecoPF = new JTextField();
		txtEnderecoPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnderecoPF.setColumns(10);
		
		txtNumeroPF = new JTextField();
		txtNumeroPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroPF.setColumns(10);
		
		txtEstadoPF = new JTextField();
		txtEstadoPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstadoPF.setColumns(10);
		
		txtCidadePF = new JTextField();
		txtCidadePF.setHorizontalAlignment(SwingConstants.CENTER);
		txtCidadePF.setColumns(10);
		
		txtBairroPF = new JTextField();
		txtBairroPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtBairroPF.setColumns(10);
		
		txtEmailPF = new JTextField();
		txtEmailPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailPF.setColumns(10);
		
		txtCelularPF = new JTextField();
		txtCelularPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelularPF.setColumns(10);
		
		txtTelefonePF = new JTextField();
		txtTelefonePF.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelefonePF.setColumns(10);
		
		txtSitePF = new JTextField();
		txtSitePF.setHorizontalAlignment(SwingConstants.CENTER);
		txtSitePF.setColumns(10);
		
		txtCpfPF = new JTextField();
		txtCpfPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtCpfPF.setColumns(10);
		
		txtObservacaoPF = new JTextField();
		txtObservacaoPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtObservacaoPF.setColumns(10);
		
		JButton CadPF = new JButton("Cadastrar");
		CadPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NomeValue = txtNomePF.getText();
				String CategoriaValue = txtCategoriaPF.getText();
				String CepValue = txtCepPF.getText();
				String EnderecoValue = txtEnderecoPF.getText();
				String NumeroValue = txtNumeroPF.getText();
				String EstadoValue = txtEstadoPF.getText();
				String CidadeValue = txtCidadePF.getText();
				String BairroValue = txtBairroPF.getText();
				String EmailValue = txtEmailPF.getText();
				String CelularValue = txtCelularPF.getText();
				String TelefoneValue = txtTelefonePF.getText();
				String SiteValue = txtSitePF.getText();
				String CnpjValue = txtCpfPF.getText();
				String ObservacaoValue = txtObservacaoPF.getText();
				Boolean error = false;
				String ErrorText = "";

				if (NomeValue.isEmpty()) {
					error = true;
					ErrorText = "Preencha o Nome do Funcionário ";
				}
				if (CategoriaValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a categoria ";
					} else {
						ErrorText += "\nPreencha a categoria";
					}

				}
				if (CepValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o CEP ";
					} else {
						ErrorText += "\nPreencha o CEP";
					}
				}
				if (EnderecoValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o endereco ";
					} else {
						ErrorText += "\nPreencha o endereco";
					}
				}
				if (NumeroValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o numero ";
					} else {
						ErrorText += "\nPreencha o numero";
					}
				}
				if (EstadoValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o estado ";
					} else {
						ErrorText += "\nPreencha o estado";
					}
				}
				if (CidadeValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a cidade ";
					} else {
						ErrorText += "\nPreencha a cidade";
					}

				}
				if (BairroValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o bairro ";
					} else {
						ErrorText += "\nPreencha o bairro";
					}
				}
				if (EmailValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o email ";
					} else {
						ErrorText += "\nPreencha o email";
					}
				}
				if (CelularValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o celular ";
					} else {
						ErrorText += "\nPreencha o celular";
					}
				}
				if (TelefoneValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o telefone ";
					} else {
						ErrorText += "\nPreencha o telefone";
					}
				}
				if (SiteValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o site ";
					} else {
						ErrorText += "\nPreencha o site";
					}
				}
				if (CnpjValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o CPF ";
					} else {
						ErrorText += "\nPreencha o CPF";
					}
				}
				if (ObservacaoValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Observacao ";
					} else {
						ErrorText += "\nPreencha a Observacao";
					}

				}
				if (error == false) {
					JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado!", "Sucesso",
							JOptionPane.DEFAULT_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, ErrorText, "Erro", JOptionPane.ERROR_MESSAGE);
				}
				/*
				ModelFornecedorPFisica ff = new ModelFornecedorPFisica(String.valueOf(txtNomePF.getText()), String.valueOf(txtCategoriaPF.getText()),
						String.valueOf(txtCepPF.getText()), String.valueOf(txtEnderecoPF.getText()),
						Integer.parseInt(txtNumeroPF.getText()), String.valueOf(txtEstadoPF.getText()), String.valueOf(txtCidadePF.getText()), 
						String.valueOf(txtBairroPF.getText()), String.valueOf(txtEmailPF.getText()), String.valueOf(txtCelularPF.getText()), 
						String.valueOf(txtTelefonePF.getText()), String.valueOf(txtSitePF.getText()), String.valueOf(txtCpfPF.getText()),
						String.valueOf(txtObservacaoPF.getText()),1);
				int erro = new FornecedorPFisicaController().cadastraFornecedorPFisica(ff);
			    System.out.println(erro);
			    */
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		JLabel NomePF = new JLabel("Nome:");
		NomePF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NomePF.setEnabled(false);
		
		CategoriaPF = new JLabel("Categoria:");
		CategoriaPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CategoriaPF.setEnabled(false);
		
		CepPF = new JLabel("CEP:");
		CepPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CepPF.setEnabled(false);
		
		EndereoPF = new JLabel("Endere\u00E7o:");
		EndereoPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EndereoPF.setEnabled(false);
		
		NumeroPF = new JLabel("Numero:");
		NumeroPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NumeroPF.setEnabled(false);
		
		EnderecoPF = new JLabel("Bairro:");
		EnderecoPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EnderecoPF.setEnabled(false);
		
		CidadePF = new JLabel("Cidade:");
		CidadePF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CidadePF.setEnabled(false);
		
		EstadoPF = new JLabel("Estado:");
		EstadoPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EstadoPF.setEnabled(false);
		
		EmailPF = new JLabel("E-mail:");
		EmailPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EmailPF.setEnabled(false);
		
		TelefonePF = new JLabel("Telefone:");
		TelefonePF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TelefonePF.setEnabled(false);
		
		CelularPF = new JLabel("Celular:");
		CelularPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CelularPF.setEnabled(false);
		
		SitePF = new JLabel("Site:");
		SitePF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SitePF.setEnabled(false);
		
		CpfPF = new JLabel("CPF:");
		CpfPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CpfPF.setEnabled(false);
		
		ObservacaoPF = new JLabel("Observacao:");
		ObservacaoPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ObservacaoPF.setEnabled(false);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtControleDeEstoque, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(EndereoPF, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtEnderecoPF, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtBairroPF, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
										.addComponent(EnderecoPF, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCidadePF, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
										.addComponent(CidadePF, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(NumeroPF, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(EstadoPF, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumeroPF, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEstadoPF, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))))
					.addGap(18))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(CpfPF, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(SitePF, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addGap(394))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(EmailPF, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmailPF, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(TelefonePF, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtTelefonePF, 84, 84, 84))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCelularPF, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(CelularPF, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
									.addGap(23))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(CategoriaPF, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(NomePF)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtNomePF, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(txtCepPF, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
											.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addComponent(CepPF, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
												.addGap(159))))
									.addGap(28))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(CadPF, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
									.addGap(198)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
									.addGap(24))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtCategoriaPF, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
									.addContainerGap()))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtSitePF)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtCpfPF, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(ObservacaoPF, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtObservacaoPF, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap()))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtControleDeEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(NomePF)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNomePF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(CategoriaPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(CepPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCategoriaPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCepPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(EndereoPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(NumeroPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEnderecoPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumeroPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(EnderecoPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(EstadoPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(CidadePF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtBairroPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEstadoPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCidadePF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(EmailPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(TelefonePF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(CelularPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEmailPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelefonePF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCelularPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(SitePF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSitePF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(CpfPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(ObservacaoPF, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCpfPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtObservacaoPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(86)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(CadPF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().setBackground(new Color(238,232,170));

	}
}
