package dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import conexaojdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import model.ModelFornecedorPFisica;

public class FornecedorPFisicaDAO {
	public boolean cadastraFornecedorPFisica(ModelFornecedorPFisica fornecedorPFisica) {

		String sql = "INSERT INTO fornecedorpfisica(NOME, CATEGORIA,  CEP, ENDERECO, NUMERO, "
				+ "ESTADO, CIDADE, BAIRRO, EMAIL, TELEFONE, CELULAR, SITE, CPF, OBSERVACAO, ID) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, fornecedorPFisica.getNome());
			statement.setString(2, fornecedorPFisica.getCategoria());
			statement.setString(3, fornecedorPFisica.getCep());
			statement.setString(4, fornecedorPFisica.getEndereco());
			statement.setInt(5, fornecedorPFisica.getNumero());
			statement.setString(6, fornecedorPFisica.getEstado());
			statement.setString(7, fornecedorPFisica.getCidade());
			statement.setString(8, fornecedorPFisica.getBairro());
			statement.setString(9, fornecedorPFisica.getEmail());
			statement.setString(10, fornecedorPFisica.getTelefone());
			statement.setString(11, fornecedorPFisica.getCelular());
			statement.setString(12, fornecedorPFisica.getSite());
			statement.setString(13, fornecedorPFisica.getCpf());
			statement.setString(14, fornecedorPFisica.getObservacao());
			statement.setInt(15, 0);
			statement.execute();
			connection.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
}
