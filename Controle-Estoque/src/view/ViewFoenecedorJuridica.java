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
import controller.FornecedorJuridicaController;
import model.ModelFornecedorJuridica;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class ViewFoenecedorJuridica {

	private JFrame frame;
	private JTextField txtControleDeEstoque;
	private JTextField textNomeFantasiaPJ;
	private JTextField txtCategoriaPJ;
	private JTextField txtCepPJ;
	private JTextField txtEnderecoPJ;
	private JTextField txtNumeroPJ;
	private JTextField txtEstadoPJ;
	private JTextField txtCidadePJ;
	private JTextField txtBairroPJ;
	private JTextField txtEmailPJ;
	private JTextField txtCelularPJ;
	private JTextField txtTelefonePJ;
	private JTextField txtSitePJ;
	private JTextField txtCnpjPJ;
	private JTextField txtObservacaoPJ;
	private JButton btnNewButton_1;
	private JLabel CategoriaPJ;
	private JLabel CepPJ;
	private JLabel EndereoPJ;
	private JLabel NumeroPJ;
	private JLabel BairroPJ;
	private JLabel CidadePJ;
	private JLabel EstadoPJ;
	private JLabel EmailPJ;
	private JLabel TelefonePJ;
	private JLabel CelularPJ;
	private JLabel SitePJ;
	private JLabel CnpjPJ;
	private JLabel ObservacaoPJ;
	private JTextField textRazaoSocialPJ;
	private JLabel RazaoSocialPJ;
	private JTextField textInscEstPJ;
	private JLabel InscEstPJ;

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
		
		txtControleDeEstoque = new JTextField("Controle de Estoque - Pessoa Juridica");
		txtControleDeEstoque.setEditable(false);
		txtControleDeEstoque.setBackground(Color.ORANGE);
		txtControleDeEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		txtControleDeEstoque.setColumns(10);
		/*/JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(ViewFuncionario.class.getResource("C:\\Users\\ViníciusRozendoFerra\\Documents\\1Vinicius\\1Faculdade\\1Matérias\\prog\\EngSoftware2\\Projeto-Engenharia-Software-2")));
		lblNewLabel.setBounds(100, 0, 250, 250);
		ViewPrincipal.getContentPane().add(lblNewLabel);/*/
		
		textNomeFantasiaPJ = new JTextField();
		textNomeFantasiaPJ.setHorizontalAlignment(SwingConstants.CENTER);
		textNomeFantasiaPJ.setColumns(10);
		
		txtCategoriaPJ = new JTextField();
		txtCategoriaPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtCategoriaPJ.setColumns(10);
		
		txtCepPJ = new JTextField();
		txtCepPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtCepPJ.setColumns(10);
		
		txtEnderecoPJ = new JTextField();
		txtEnderecoPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnderecoPJ.setColumns(10);
		
		txtNumeroPJ = new JTextField();
		txtNumeroPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroPJ.setColumns(10);
		
		txtEstadoPJ = new JTextField();
		txtEstadoPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstadoPJ.setColumns(10);
		
		txtCidadePJ = new JTextField();
		txtCidadePJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtCidadePJ.setColumns(10);
		
		txtBairroPJ = new JTextField();
		txtBairroPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtBairroPJ.setColumns(10);
		
		txtEmailPJ = new JTextField();
		txtEmailPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailPJ.setColumns(10);
		
		txtCelularPJ = new JTextField();
		txtCelularPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelularPJ.setColumns(10);
		
		txtTelefonePJ = new JTextField();
		txtTelefonePJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelefonePJ.setColumns(10);
		
		txtSitePJ = new JTextField();
		txtSitePJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtSitePJ.setColumns(10);
		
		txtCnpjPJ = new JTextField();
		txtCnpjPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtCnpjPJ.setColumns(10);
		
		txtObservacaoPJ = new JTextField();
		txtObservacaoPJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtObservacaoPJ.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NomeValue = textNomeFantasiaPJ.getText();
				String CategoriaValue = txtCategoriaPJ.getText();
				String CepValue = txtCepPJ.getText();
				String EnderecoValue = txtEnderecoPJ.getText();
				String NumeroValue = txtNumeroPJ.getText();
				String EstadoValue = txtEstadoPJ.getText();
				String CidadeValue = txtCidadePJ.getText();
				String BairroValue = txtBairroPJ.getText();
				String EmailValue = txtEmailPJ.getText();
				String CelularValue = txtCelularPJ.getText();
				String TelefoneValue = txtTelefonePJ.getText();
				String SiteValue = txtSitePJ.getText();
				String CnpjValue = txtCnpjPJ.getText();
				String ObservacaoValue = txtObservacaoPJ.getText();
				String RazaoSocialValue = textRazaoSocialPJ.getText();
				String InscEstValue = textInscEstPJ.getText();
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
						ErrorText += "\nPreencha Preencha o estado";
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
						ErrorText = "Preencha o CNPJ ";
					} else {
						ErrorText += "\nPreencha o CNPJ";
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
				if (RazaoSocialValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Razao Social ";
					} else {
						ErrorText += "\nPreencha a Razao Social";
					}
				}
				if (InscEstValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Inscricao Estadual ";
					} else {
						ErrorText += "\nPreencha o Inscricao Estadual";
					}
				}
				if (error == false) {
					JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado!", "Sucesso",
							JOptionPane.DEFAULT_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, ErrorText, "Erro", JOptionPane.ERROR_MESSAGE);
				}
				ModelFornecedorJuridica fj = new ModelFornecedorJuridica(String.valueOf(textNomeFantasiaPJ.getText()), String.valueOf(txtCategoriaPJ.getText()),
						String.valueOf(txtCepPJ.getText()), String.valueOf(txtEnderecoPJ.getText()),
						Integer.parseInt(txtNumeroPJ.getText()), String.valueOf(txtEstadoPJ.getText()), String.valueOf(txtCidadePJ.getText()), 
						String.valueOf(txtBairroPJ.getText()), String.valueOf(txtEmailPJ.getText()), String.valueOf(txtCelularPJ.getText()), 
						String.valueOf(txtTelefonePJ.getText()), String.valueOf(txtSitePJ.getText()), String.valueOf(txtCnpjPJ.getText()),
						String.valueOf(txtObservacaoPJ.getText()), String.valueOf(textRazaoSocialPJ.getText()), String.valueOf(textInscEstPJ.getText()),1);
				int erro = new FornecedorJuridicaController().cadastrarFornecedorJuridica(fj);
			    System.out.println(erro);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		JLabel NomePJ = new JLabel("Nome Fantasia:");
		NomePJ.setBackground(Color.BLACK);
		NomePJ.setForeground(Color.BLACK);
		NomePJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NomePJ.setEnabled(false);
		
		CategoriaPJ = new JLabel("Categoria:");
		CategoriaPJ.setBackground(Color.BLACK);
		CategoriaPJ.setForeground(Color.BLACK);
		CategoriaPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CategoriaPJ.setEnabled(false);
		
		CepPJ = new JLabel("CEP:");
		CepPJ.setBackground(Color.BLACK);
		CepPJ.setForeground(Color.BLACK);
		CepPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CepPJ.setEnabled(false);
		
		EndereoPJ = new JLabel("Endere\u00E7o:");
		EndereoPJ.setBackground(Color.BLACK);
		EndereoPJ.setForeground(Color.BLACK);
		EndereoPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EndereoPJ.setEnabled(false);
		
		NumeroPJ = new JLabel("Numero:");
		NumeroPJ.setBackground(Color.BLACK);
		NumeroPJ.setForeground(Color.BLACK);
		NumeroPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NumeroPJ.setEnabled(false);
		
		BairroPJ = new JLabel("Bairro:");
		BairroPJ.setBackground(Color.BLACK);
		BairroPJ.setForeground(Color.BLACK);
		BairroPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		BairroPJ.setEnabled(false);
		
		CidadePJ = new JLabel("Cidade:");
		CidadePJ.setBackground(Color.BLACK);
		CidadePJ.setForeground(Color.BLACK);
		CidadePJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CidadePJ.setEnabled(false);
		
		EstadoPJ = new JLabel("Estado:");
		EstadoPJ.setBackground(Color.BLACK);
		EstadoPJ.setForeground(Color.BLACK);
		EstadoPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EstadoPJ.setEnabled(false);
		
		EmailPJ = new JLabel("E-mail:");
		EmailPJ.setBackground(Color.BLACK);
		EmailPJ.setForeground(Color.BLACK);
		EmailPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EmailPJ.setEnabled(false);
		
		TelefonePJ = new JLabel("Telefone:");
		TelefonePJ.setBackground(Color.BLACK);
		TelefonePJ.setForeground(Color.BLACK);
		TelefonePJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TelefonePJ.setEnabled(false);
		
		CelularPJ = new JLabel("Celular:");
		CelularPJ.setBackground(Color.BLACK);
		CelularPJ.setForeground(Color.BLACK);
		CelularPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CelularPJ.setEnabled(false);
		
		SitePJ = new JLabel("Site:");
		SitePJ.setBackground(Color.BLACK);
		SitePJ.setForeground(Color.BLACK);
		SitePJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SitePJ.setEnabled(false);
		
		CnpjPJ = new JLabel("CNPJ:");
		CnpjPJ.setBackground(Color.BLACK);
		CnpjPJ.setForeground(Color.BLACK);
		CnpjPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CnpjPJ.setEnabled(false);
		
		ObservacaoPJ = new JLabel("Observacao:");
		ObservacaoPJ.setBackground(Color.BLACK);
		ObservacaoPJ.setForeground(Color.BLACK);
		ObservacaoPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ObservacaoPJ.setEnabled(false);
		
		textRazaoSocialPJ = new JTextField();
		textRazaoSocialPJ.setColumns(10);
		
		RazaoSocialPJ = new JLabel("Razao Social:");
		RazaoSocialPJ.setBackground(Color.BLACK);
		RazaoSocialPJ.setForeground(Color.BLACK);
		RazaoSocialPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RazaoSocialPJ.setEnabled(false);
		
		textInscEstPJ = new JTextField();
		textInscEstPJ.setColumns(10);
		
		InscEstPJ = new JLabel("Insc Est:");
		InscEstPJ.setBackground(Color.BLACK);
		InscEstPJ.setForeground(Color.BLACK);
		InscEstPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		InscEstPJ.setEnabled(false);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtControleDeEstoque, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtEnderecoPJ, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtBairroPJ, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
								.addComponent(BairroPJ, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCidadePJ, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
								.addComponent(CidadePJ, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
						.addComponent(EndereoPJ, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(EstadoPJ, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumeroPJ, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
						.addComponent(NumeroPJ, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
						.addComponent(txtEstadoPJ, 0, 0, Short.MAX_VALUE))
					.addGap(28))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(CnpjPJ, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
								.addGap(198)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addGap(24))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(CategoriaPJ, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
										.addComponent(CepPJ, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addGap(159))
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
										.addComponent(txtCepPJ, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(textNomeFantasiaPJ, Alignment.LEADING)
												.addComponent(txtCategoriaPJ, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
											.addComponent(NomePJ))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(RazaoSocialPJ, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addComponent(textRazaoSocialPJ, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
								.addGap(28))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtCnpjPJ, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addComponent(ObservacaoPJ, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
												.addGap(96))
											.addComponent(txtObservacaoPJ, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
													.addComponent(txtSitePJ, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(EmailPJ, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
															.addComponent(txtEmailPJ, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(TelefonePJ, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
															.addComponent(txtTelefonePJ, 84, 84, 84))))
												.addPreferredGap(ComponentPlacement.RELATED))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(SitePJ, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
												.addGap(297)))
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(InscEstPJ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(CelularPJ, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtCelularPJ, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
											.addComponent(textInscEstPJ, 0, 0, Short.MAX_VALUE))))
								.addGap(28)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtControleDeEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(RazaoSocialPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(NomePJ))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNomeFantasiaPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textRazaoSocialPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(CepPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(CategoriaPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCategoriaPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCepPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(NumeroPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(EndereoPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEnderecoPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumeroPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(BairroPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(EstadoPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(CidadePJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtBairroPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEstadoPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCidadePJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(EmailPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(TelefonePJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(CelularPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEmailPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelefonePJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCelularPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(SitePJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(InscEstPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSitePJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textInscEstPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(CnpjPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(ObservacaoPJ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCnpjPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtObservacaoPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(86)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().setBackground(new Color(238,232,170));

	}
}
