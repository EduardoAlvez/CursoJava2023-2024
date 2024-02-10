package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Inforeme o nome: ");
		String nome = leitor.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
//		USANDO O PREPAREDSTATEMENT O BANCO DE DADOS FICA MAIS SEGURO A TENTATIVA DE USO POR CODIGO COLOCADO NA ENTRADA.
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();

		
		
		System.out.println("PESSOA INCLUIDA COM SUCESSO!");
		leitor.close();
	}
}
