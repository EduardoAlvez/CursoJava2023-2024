package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoaPorCodigo {

	public static void main(String[] args) throws SQLException {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o código: ");
		int c = leitor.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, c);
		int contador = stmt.executeUpdate();
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso.");
			System.out.println("Linha(S) afetada(s): "+ contador);
		}else
			System.out.println("Nenhuma Pessoa encontrada!");
		
		
		conexao.close();
		leitor.close();
		
	}
}
