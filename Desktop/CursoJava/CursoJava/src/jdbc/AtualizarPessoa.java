package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o código da Pessoa: ");
		int codigo = leitor.nextInt();
		
		
//		TODA ESSA PARTE. FOI FEITA PRA PEGAR UMA PESSOA PELO CODIGO ESPECIFICO. FUNCIONOU CORRETAMENTE
//		AGORA FALTA MODIFICA O NOME DESSA PESSOA PARA O DIGITADO A CIMA...
		Connection conexao = FabricaConexao.getConexao();
		
		String SQLSelect = "SELECT * FROM pessoas WHERE codigo = ?";
		String SQLUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(SQLSelect);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();

		if(resultado.next()){
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome Atual: "+p.getNome());
			leitor.nextLine();
			
			System.out.print("Digite o novo nome: ");
			String novoNome = leitor.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(SQLUpdate);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Nome Alterado!");
		}else {
			System.out.println("Pessoa não encontrada.");
		}
				
		
		stmt.close();
		conexao.close();
		leitor.close();
	}
}
