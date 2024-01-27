package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioConsultarPessoas {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a letra desejada:");
		//String letra = entrada.nextLine();
		String num = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		//System.out.println(letra);

		String sql = "select * from pessoas where nome like ?";
		String sql1 = "select * from pessoas where codigo like ?";
		PreparedStatement stmt = conexao.prepareStatement(sql1);
		//stmt.setString(1, "%"+ letra + "%");
		stmt.setString(1, num);
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " -> " + p.getNome());
		}
		
		//select * from pessoas where nome like '%variável%';
		
		entrada.close();
		stmt.close();
		conexao.close();

	}
}
