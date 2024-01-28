package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println(nome);
		
		String sql = "insert into pessoas (nome, codigo) values (?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome); //parametro número 1
		stmt.setInt(2, 6); //parametro número 2
		
		stmt.execute();
		
		System.out.println("Pessoa adicionada com sucesso");
		
		entrada.close();
	}
}
