package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao2 {
	
	public static Connection getConexao() {
		//A fábrica2 não incide na fragilidade da segunda
		//Seus dados de acesso ao banco de dados são salvos num arquivo junto aos bin da jvm. Logo qualquer alteração no acesso do banco de dados poderá ser realizada através da alteração do arquivo
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e); 
		}
	}
	
	public static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}