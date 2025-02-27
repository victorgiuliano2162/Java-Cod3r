package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o indice a ser deletado");
		int indice = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String delete = "delete from pessoas where codigo = ?";
		//String delete = "delete from pessoas where codigo > ?";
		//Tanto o uso do sinal > quanto < pode ser usado para excluir multiplas linhas de código
		
		PreparedStatement stmt = conexao.prepareStatement(delete);
		stmt.setInt(1, indice);
		 
		int contador = stmt.executeUpdate();
		if(contador == 1) {
			System.out.println("Usuário excluído");
		} else if (contador > 1){
			System.out.println("Usuários excluídos");
		} else {
			System.out.println("Usuário não encontrado");
		}
		
		System.out.println("Número de linhas afetadas: " + contador);
		
		entrada.close();
		conexao.close();
	}
}
