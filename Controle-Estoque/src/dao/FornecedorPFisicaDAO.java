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

		String sql = "INSERT INTO fornecedorJuridica(NOME, CATEGORIA,  CEP, ENDERECO, NUMERO, "
				+ "ESTADO, CIDADE, BAIRRO, EMAIL, TELEFONE, CELULAR, SITE, CPF, OBSERVACAO) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, fornecedorPFisica.getNome());
			statement.setString(2, fornecedorPFisica.getCategoria());
			statement.setString(4, fornecedorPFisica.getCep());
			statement.setString(5, fornecedorPFisica.getEndereco());
			//statement.setInt(6, fornecedorPFisica.getNumero());????????????????????????????????????????????
			statement.setString(7, fornecedorPFisica.getEstado());
			statement.setString(1, fornecedorPFisica.getCidade());
			statement.setString(2, fornecedorPFisica.getBairro());
			statement.setString(4, fornecedorPFisica.getEmail());
			statement.setString(5, fornecedorPFisica.getTelefone());
			statement.setString(7, fornecedorPFisica.getCelular());
			statement.setString(1, fornecedorPFisica.getSite());
			statement.setString(2, fornecedorPFisica.getCpf());
			statement.setString(4, fornecedorPFisica.getObservacao());
			statement.execute();
			connection.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
}
