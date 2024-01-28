package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioAtualizarRegistro1 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o id para pesquisa:");
		String num = entrada.nextLine();
		System.out.println("Informe o novo nome:");		
		String letra = entrada.nextLine();
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println(letra);
		System.out.println(num);

		String sql = "select * from where codigo = ?";
		String sql1 = "update pessoas set nome = ? where codigo = ? ";
		PreparedStatement stmt = conexao.prepareStatement(sql1);
		//stmt.setString(1, "%"+ letra + "%");
		stmt.setString(1, num);
		
		ResultSet resultado = stmt.executeQuery();

	}
}
