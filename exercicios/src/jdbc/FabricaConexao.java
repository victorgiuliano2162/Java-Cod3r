package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		//Segue abaixo uma das formas de conectar ao banco de dados
		//Um dos problemas deste modelo, além da sua insegurança, é a dificulade em alterá-lo, uma vez que a classe compilada deveria ser recompilada e upada caso algum dos dados de acesso ao banco fosse alterado
		
		try {
			final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "153769";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e); 
		}
	}
}
