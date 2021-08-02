package dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import conexaojdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import model.ModelFornecedorJuridica;

public class FornecedorJuridicaDAO {
	public boolean cadastraFornecedorJuridica(ModelFornecedorJuridica fornecedorJuridica) {

		String sql = "INSERT INTO fornecedorJuridica(NOMEFANTASIA, CATEGORIA,  CEP, ENDERECO, NUMERO, "
				+ "ESTADO, CIDADE, BAIRRO, EMAIL, TELEFONE, CELULAR, SITE, CNPJ, OBSERVACAO, RAZAOSOCIAL, INSCEST) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, fornecedorJuridica.getNomeFantasia());
			statement.setString(2, fornecedorJuridica.getCategoria());
			statement.setString(4, fornecedorJuridica.getCep());
			statement.setString(5, fornecedorJuridica.getEndereco());
			statement.setInt(6, fornecedorJuridica.getNumero());
			statement.setString(7, fornecedorJuridica.getEstado());
			statement.setString(1, fornecedorJuridica.getCidade());
			statement.setString(2, fornecedorJuridica.getBairro());
			statement.setString(4, fornecedorJuridica.getEmail());
			statement.setString(5, fornecedorJuridica.getTelefone());
			statement.setString(7, fornecedorJuridica.getCelular());
			statement.setString(1, fornecedorJuridica.getSite());
			statement.setString(2, fornecedorJuridica.getCnpj());
			statement.setString(4, fornecedorJuridica.getObservacao());
			statement.setString(5, fornecedorJuridica.getRazaoSocial());
			statement.setString(5, fornecedorJuridica.getInscEst());
			statement.execute();
			connection.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
}
