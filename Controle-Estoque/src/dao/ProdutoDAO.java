package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexaojdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.ModelFuncionario;
import model.ModelProduto;

public class ProdutoDAO {

	public boolean CadastraProduto(ModelProduto produto) {
		String sql = "INSERT INTO PRODUTO(NOME, DESCRICAO, ID, QUANTIDADE, PRECO, VALIDADE, FORNECEDOR) "
				+ "VALUES(?, ?, ?, ?, ?,?,?)";
		Connection connection;
		
		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, produto.getNome());
			statement.setString(2, produto.getDescricao());
			statement.setInt(3, 0);			
			statement.setInt(4, produto.getQuantidade());
			statement.setDouble(5, produto.getPreco());
			statement.setString(6, produto.getValidade());
			statement.setString(7, produto.getFornecedor());
			statement.execute();
			connection.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
	
	public boolean editaProduto(ModelProduto produto) {

		String sql = "UPDATE produto set NOME = ?, DESCRICAO = ?, QUANTIDADE = ?, PRECO = ?, VALIDADE = ?, FORNECEDOR = ? "
				+ "WHERE ID = ?";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, produto.getNome());
			statement.setString(2, produto.getDescricao());
			statement.setInt(3, produto.getQuantidade());
			statement.setDouble(4, produto.getPreco());
			statement.setString(5, produto.getValidade());
			statement.setString(6, produto.getFornecedor());
			statement.setInt(7, produto.getId());

			statement.execute();
			connection.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
	
	public boolean excluiProduto(int id) {

		String sql = "DELETE FROM produto WHERE ID = ?";
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
	
	public ModelProduto getProduto(int idProduto) {

		String sql = "SELECT * FROM produto WHERE ID = " + idProduto;
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);


			if(rs.next()) {

				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				String descricao = rs.getString("DESCRICAO");
				int quantidade = rs.getInt("QUANTIDADE");
				double preco = rs.getDouble("PRECO");
				String validade = rs.getString("VALIDADE");
				String fornecedor = rs.getString("FORNECEDOR");

				return (new ModelProduto(nome, descricao, id, quantidade, preco, validade, fornecedor));

			}else{
				return null;
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	public ArrayList<ModelProduto> getAllProduto() {
		ArrayList<ModelProduto> produtos = new ArrayList<ModelProduto>();
		String sql = "SELECT * FROM produto";
		Connection connection;

		try {
			connection = ConnectionFactory.createConnectionToMySQL();

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while(rs.next()) {

				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				String descricao = rs.getString("DESCRICAO");
				int quantidade = rs.getInt("QUANTIDADE");
				double preco = rs.getDouble("PRECO");
				String validade = rs.getString("VALIDADE");
				String fornecedor = rs.getString("FORNECEDOR");

				produtos.add(new ModelProduto(nome, descricao, id, quantidade, preco, validade, fornecedor));

			}

			return produtos;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}