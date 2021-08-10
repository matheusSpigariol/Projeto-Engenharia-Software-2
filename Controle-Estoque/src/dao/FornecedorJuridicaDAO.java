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

		String sql = "INSERT INTO fornecedorjuridica(NOMEFANTASIA, CATEGORIA,  CEP, ENDERECO, NUMERO, "
				+ "ESTADO, CIDADE, BAIRRO, EMAIL, TELEFONE, CELULAR, SITE, CNPJ, OBSERVACAO, RAZAOSOCIAL, INSCEST, ID) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, fornecedorJuridica.getNomeFantasia());
			statement.setString(2, fornecedorJuridica.getCategoria());
			statement.setString(3, fornecedorJuridica.getCep());
			statement.setString(4, fornecedorJuridica.getEndereco());
			statement.setInt(5, fornecedorJuridica.getNumero());
			statement.setString(6, fornecedorJuridica.getEstado());
			statement.setString(7, fornecedorJuridica.getCidade());
			statement.setString(8, fornecedorJuridica.getBairro());
			statement.setString(9, fornecedorJuridica.getEmail());
			statement.setString(10, fornecedorJuridica.getTelefone());
			statement.setString(11, fornecedorJuridica.getCelular());
			statement.setString(12, fornecedorJuridica.getSite());
			statement.setString(13, fornecedorJuridica.getCnpj());
			statement.setString(14, fornecedorJuridica.getObservacao());
			statement.setString(15, fornecedorJuridica.getRazaoSocial());
			statement.setString(16, fornecedorJuridica.getInscEst());
			statement.setInt(17, 0);
			statement.execute();
			connection.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
}
