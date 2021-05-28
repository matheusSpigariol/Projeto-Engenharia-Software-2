package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaojdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ModelFuncionario;

public class FuncionarioDAO {

	public boolean CadastraFuncionario(ModelFuncionario funcionario) {

		String sql = "INSERT INTO FUNCIONARIO(NOME, CPF,  ID, CARGO, TELEFONE, USUARIO, SENHA) "
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

}
