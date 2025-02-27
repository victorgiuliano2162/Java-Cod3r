package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		String a = entrada.nextLine();
		Connection conexao = FabricaConexao.getConexao();
		String sql = "select * from pessoas where nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%"+a+"%");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " -> " + p.getNome());
		}
		
		//select * from pessoas where nome like '%variável%';
		
		stmt.close();
		conexao.close();
		
		
	}
}
