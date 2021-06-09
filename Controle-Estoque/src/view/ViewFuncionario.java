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
import javax.swing.JPasswordField;

public class ViewFuncionario {

	private JFrame JanelaDeCadastro;
	private JTextField NomeInput;
	private JTextField CPFInput;
	private JTextField CargoInput;
	private JTextField TelefoneInput;
	private JTextField UserInput;
	private JPasswordField passwordField;

	FuncionarioController f = new FuncionarioController(new ModelFuncionario());

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

	public ViewFuncionario() {
		initialize();
	}

	private void initialize() {
		JanelaDeCadastro = new JFrame();
		JanelaDeCadastro.setTitle("Cadastro de Funcion\u00E1rios");
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
		IconLabel.setIcon(new ImageIcon(ViewFuncionario.class.getResource("/assets/logo.png")));
		IconLabel.setBounds(100, 0, 250, 250);
		JanelaDeCadastro.getContentPane().add(IconLabel);

		JLabel Header = new JLabel("Cadastro de Funcionários");
		Header.setFont(new Font("Dialog", Font.BOLD, 20));
		Header.setVerticalAlignment(SwingConstants.BOTTOM);
		Header.setHorizontalAlignment(SwingConstants.CENTER);
		Header.setBounds(79, 226, 291, 24);
		JanelaDeCadastro.getContentPane().add(Header);

		JLabel CPFLabel = new JLabel("CPF:");
		CPFLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		CPFLabel.setBounds(40, 310, 130, 15);
		JanelaDeCadastro.getContentPane().add(CPFLabel);

		JLabel CargoLabel = new JLabel("Cargo:");
		CargoLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		CargoLabel.setBounds(40, 340, 70, 19);
		JanelaDeCadastro.getContentPane().add(CargoLabel);

		JLabel TelLabel = new JLabel("Telefone:");
		TelLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		TelLabel.setBounds(40, 370, 95, 15);
		JanelaDeCadastro.getContentPane().add(TelLabel);

		JLabel UserLabel = new JLabel("Usuário:");
		UserLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		UserLabel.setBounds(40, 400, 70, 15);
		JanelaDeCadastro.getContentPane().add(UserLabel);

		JLabel SenhaLabel = new JLabel("Senha:");
		SenhaLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		SenhaLabel.setBounds(40, 430, 70, 15);
		JanelaDeCadastro.getContentPane().add(SenhaLabel);

		NomeInput = new JTextField();
		NomeInput.setBounds(146, 280, 244, 19);
		JanelaDeCadastro.getContentPane().add(NomeInput);
		NomeInput.setColumns(10);

		CPFInput = new JTextField();
		CPFInput.setBounds(146, 310, 244, 19);
		JanelaDeCadastro.getContentPane().add(CPFInput);
		CPFInput.setColumns(10);

		CargoInput = new JTextField();
		CargoInput.setBounds(146, 340, 244, 19);
		JanelaDeCadastro.getContentPane().add(CargoInput);
		CargoInput.setColumns(10);

		TelefoneInput = new JTextField();
		TelefoneInput.setBounds(146, 370, 244, 19);
		JanelaDeCadastro.getContentPane().add(TelefoneInput);
		TelefoneInput.setColumns(10);

		UserInput = new JTextField();
		UserInput.setBounds(146, 400, 244, 19);
		JanelaDeCadastro.getContentPane().add(UserInput);
		UserInput.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(146, 430, 244, 19);
		JanelaDeCadastro.getContentPane().add(passwordField);

		JButton SalvarButton = new JButton("Salvar Dados");
		SalvarButton.setBounds(40, 500, 155, 25);
		SalvarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NomeValue = NomeInput.getText();
				String CPFValue = CPFInput.getText();
				String CargoValue = CargoInput.getText();
				String TelefoneValue = TelefoneInput.getText();
				String UserValue = UserInput.getText();
				String passwordValue = new String(passwordField.getPassword()).trim();
				Boolean error = false;
				String ErrorText = "";

				if (NomeValue.isEmpty()) {
					error = true;
					ErrorText = "Preencha o Nome do Funcionário ";
				}
				if (CPFValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o CPF do Funcionário ";
					} else {
						ErrorText += "\nPreencha o CPF do Funcionário";
					}

				}
				if (CargoValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o Cargo do Funcionário ";
					} else {
						ErrorText += "\nPreencha o Cargo do Funcionário";
					}
				}
				if (TelefoneValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o Telefone do Funcionário ";
					} else {
						ErrorText += "\nPreencha o Telefone do Funcionário";
					}
				}
				if (UserValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha o Usuário do Funcionário ";
					} else {
						ErrorText += "\nPreencha o Usuário do Funcionário";
					}
				}
				if (passwordValue.isEmpty()) {
					error = true;
					if (ErrorText.isEmpty()) {
						ErrorText = "Preencha a Senha do Funcionário ";
					} else {
						ErrorText += "\nPreencha o Senha do Funcionário";
					}
				}
				if (error == false) {
					JOptionPane.showMessageDialog(null, "Funcionário Cadastrado!", "Sucesso",
							JOptionPane.DEFAULT_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, ErrorText, "Erro", JOptionPane.ERROR_MESSAGE);
				}
				ModelFuncionario fun = new ModelFuncionario(String.valueOf(NomeInput.getText()), String.valueOf(CPFInput.getText()),
						5, String.valueOf(CargoInput.getText()), String.valueOf(TelefoneInput.getText()),
						String.valueOf(UserInput.getText()), String.valueOf(passwordField.getPassword()));
				int erro = new FuncionarioController().cadastrarFuncionario(fun);
			    System.out.println(erro);

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
	}
}
