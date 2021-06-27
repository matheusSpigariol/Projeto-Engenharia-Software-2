package view;

import java.awt.EventQueue;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

import controller.FuncionarioController;
import model.ModelFuncionario;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewProduto {

	private JFrame JanelaDeCadastro;
	private JTextField NomeInput;
	private JTextField DescricaoInput;
	private JTextField QuantInput;
	private JTextField PrecoInput;
	private JTextField ValidadeInput;
	private JTextField FornecedorInput;

	FuncionarioController f = new FuncionarioController(new ModelFuncionario());
	private JTextField textField;

	public void rodaJanela() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDeCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewProduto() {
		initialize();
	}

	private void initialize() {
		JanelaDeCadastro = new JFrame();
		JanelaDeCadastro.setTitle("Cadastro de Produtos");
		JanelaDeCadastro.getContentPane().setBackground(new Color(238, 232, 170));
		JanelaDeCadastro.setBounds(100, 100, 440, 600);
		JanelaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JanelaDeCadastro.getContentPane().setLayout(null);

		JLabel NomeLabel = new JLabel("Nome:");
		NomeLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		NomeLabel.setBounds(40, 280, 70, 15);
		JanelaDeCadastro.getContentPane().add(NomeLabel);

		JLabel IconLabel = new JLabel("");
		IconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		IconLabel.setIcon(new ImageIcon(ViewProduto.class.getResource("/assets/prod.png")));
		IconLabel.setBounds(100, 3, 250, 237);
		JanelaDeCadastro.getContentPane().add(IconLabel);

		JLabel Header = new JLabel("Cadastro de Produtos");
		Header.setFont(new Font("Dialog", Font.BOLD, 20));
		Header.setVerticalAlignment(SwingConstants.BOTTOM);
		Header.setHorizontalAlignment(SwingConstants.CENTER);
		Header.setBounds(79, 240, 291, 24);
		JanelaDeCadastro.getContentPane().add(Header);

		JLabel DescricaoLabel = new JLabel("Descri\u00E7\u00E3o:");
		DescricaoLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		DescricaoLabel.setBounds(40, 310, 130, 15);
		JanelaDeCadastro.getContentPane().add(DescricaoLabel);

		JLabel QuantLabel = new JLabel("Quantidade:");
		QuantLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		QuantLabel.setBounds(40, 340, 95, 19);
		JanelaDeCadastro.getContentPane().add(QuantLabel);

		JLabel PrecoLabel = new JLabel("Pre\u00E7o:");
		PrecoLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		PrecoLabel.setBounds(40, 370, 95, 15);
		JanelaDeCadastro.getContentPane().add(PrecoLabel);

		JLabel ValidadeLabel = new JLabel("Validade:");
		ValidadeLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		ValidadeLabel.setBounds(40, 400, 70, 15);
		JanelaDeCadastro.getContentPane().add(ValidadeLabel);

		JLabel FornecedorLabel = new JLabel("Fornecedor:");
		FornecedorLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		FornecedorLabel.setBounds(40, 430, 95, 15);
		JanelaDeCadastro.getContentPane().add(FornecedorLabel);

		NomeInput = new JTextField();
		NomeInput.setBounds(146, 280, 244, 19);
		JanelaDeCadastro.getContentPane().add(NomeInput);
		NomeInput.setColumns(10);

		DescricaoInput = new JTextField();
		DescricaoInput.setBounds(146, 310, 244, 19);
		JanelaDeCadastro.getContentPane().add(DescricaoInput);
		DescricaoInput.setColumns(10);

		QuantInput = new JTextField();
		QuantInput.setBounds(146, 340, 244, 19);
		JanelaDeCadastro.getContentPane().add(QuantInput);
		QuantInput.setColumns(10);

		PrecoInput = new JTextField();
		PrecoInput.setBounds(146, 370, 244, 19);
		JanelaDeCadastro.getContentPane().add(PrecoInput);
		PrecoInput.setColumns(10);

		ValidadeInput = new JTextField();
		ValidadeInput.setBounds(146, 400, 244, 19);
		JanelaDeCadastro.getContentPane().add(ValidadeInput);
		ValidadeInput.setColumns(10);

		FornecedorInput = new JTextField();
		FornecedorInput.setBounds(146,430,244,19);
		JanelaDeCadastro.getContentPane().add(FornecedorInput);
		FornecedorInput.setColumns(10);

		JButton SalvarButton = new JButton("Salvar Dados");
		SalvarButton.setBounds(40, 500, 155, 25);
		SalvarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NomeValue = NomeInput.getText();
				String DescricaoValue = DescricaoInput.getText();
				String QuantValue = QuantInput.getText();
				String PrecoValue = PrecoInput.getText();
				String ValidadeValue = ValidadeInput.getText();
				String FornecedorValue = FornecedorInput.getText();
				
				Boolean error = false;
				String ErrorText = "";

				if (NomeValue.isEmpty()) {
					error = true;
					ErrorText = "Preencha o Nome do Produto ";
				}
				if (DescricaoValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Descricao do Produto ";
					} else {
						ErrorText += "\nPreencha a Descricao do Produto";
					}

				}
				if (QuantValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Quantidade do Produto ";
					} else {
						ErrorText += "\nPreencha a Quantidade do Produto";
					}
				}
				if (PrecoValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o Preco do Produto ";
					} else {
						ErrorText += "\nPreencha o Preço do Produto";
					}
				}
				if (ValidadeValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Validade do Produto ";
					} else {
						ErrorText += "\nPreencha a Validade do Produto";
					}
				}
				if (FornecedorValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o Fornecedor do Produto ";
					} else {
						ErrorText += "\nPreencha o Fornecedor do Produto";
					}
				}
				if (error == false) {
					JOptionPane.showMessageDialog(null, "Produto Cadastrado!", "Sucesso",
							JOptionPane.DEFAULT_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, ErrorText, "Erro", JOptionPane.ERROR_MESSAGE);
				}
				

			}
		});

		JanelaDeCadastro.getContentPane().add(SalvarButton);

		JButton FecharButton = new JButton("Sair");
		FecharButton.setBounds(235, 500, 155, 25);
		FecharButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JanelaDeCadastro.setVisible(false);
			}
		});

		JanelaDeCadastro.getContentPane().add(FecharButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(146, 429, 244, 19);
		JanelaDeCadastro.getContentPane().add(textField);
	}
}
