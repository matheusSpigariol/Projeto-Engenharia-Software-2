package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.FuncionarioController;
import dao.FuncionarioDAO;
import model.ModelFuncionario;
import view.ViewFuncionario;

 
public class ConnectionFactory {
 
   //Nome do usuário do mysql
   private static final String USERNAME = "root";
 
   //Senha do mysql
   private static final String PASSWORD = "root";
 
   //Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/estoque";
   /**
   * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
   * @param username
   * @param senha
   * @return uma conexão com o banco de dados
   * @throws Exception
   */
   public static Connection createConnectionToMySQL() throws Exception{
      Class.forName("com.mysql.cj.jdbc.Driver"); //Faz com que a classe seja carregada pela JVM
 
      //Cria a conexão com o banco de dados
      Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
 
      return connection;
   }
   public void conexao() throws Exception{
 
      //Recupera uma conexão com o banco de dados
      Connection con = createConnectionToMySQL();
 
      //Testa se a conexão é nula
      if(con != null){
         System.out.println("Conexão obtida com sucesso!" + con);
         con.close();
      }
          
      /*
      ModelFuncionario f1 = new ModelFuncionario("", "352652929749", 2, "teste", "9999999", "teste", "teste");
      int erro = new FuncionarioController().cadastrarFuncionario(f1);
      System.out.println(erro);
      */
   }
}
