package dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import conexaojdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import model.ModelFuncionario;

public class FuncionarioDAO {

	public boolean cadastraFuncionario(ModelFuncionario funcionario) {

		String sql = "INSERT INTO funcionario(NOME, CPF,  ID, CARGO, TELEFONE, USUARIO, SENHA) "
				+ "VALUES(?, ?, ?, ?, ?,?,?)";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, funcionario.getNome());
			statement.setString(2, funcionario.getCpf());
			statement.setInt(3, funcionario.getId());
			statement.setString(4, funcionario.getCargo());
			statement.setString(5, funcionario.getTelefone());
			statement.setString(6, funcionario.getUsuario());
			statement.setString(7, funcionario.getSenha());
			statement.execute();
			connection.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean editaFuncionario(ModelFuncionario funcionario) {

		String sql = "UPDATE funcionario set NOME = ?, CPF = ?, CARGO = ?, TELEFONE = ?, USUARIO = ?, SENHA = ? "
				+ "WHERE ID = ?";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, funcionario.getNome());
			statement.setString(2, funcionario.getCpf());
			statement.setString(3, funcionario.getCargo());
			statement.setString(4, funcionario.getTelefone());
			statement.setString(5, funcionario.getUsuario());
			statement.setString(6, funcionario.getSenha());
			statement.setInt(7, funcionario.getId());

			statement.execute();
			connection.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean excluiFuncionario(int id) {

		String sql = "DELETE FROM funcionario WHERE ID = ?";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setInt(1, id);

			statement.execute();
			connection.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public ModelFuncionario getFuncionario(int idFuncionario) {

		String sql = "SELECT * FROM funcionario WHERE ID = " + idFuncionario;
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);


			if(rs.next()) {

				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				String cpf = rs.getString("CPF");
				String cargo = rs.getString("CARGO");
				String telefone = rs.getString("TELEFONE");
				String usuario = rs.getString("USUARIO");
				String senha = rs.getString("SENHA");

				return (new ModelFuncionario(nome, cpf, id, cargo, telefone, usuario, senha));

			}else{
				return null;
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public ArrayList<ModelFuncionario> getAllFuncionario() {
		ArrayList<ModelFuncionario> funcionarios = new ArrayList<ModelFuncionario>();
		String sql = "SELECT * FROM funcionario";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while(rs.next()) {

				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				String cpf = rs.getString("CPF");
				String cargo = rs.getString("CARGO");
				String telefone = rs.getString("TELEFONE");
				String usuario = rs.getString("USUARIO");
				String senha = rs.getString("SENHA");

				funcionarios.add(new ModelFuncionario(nome, cpf, id, cargo, telefone, usuario, senha));

			}

			return funcionarios;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
