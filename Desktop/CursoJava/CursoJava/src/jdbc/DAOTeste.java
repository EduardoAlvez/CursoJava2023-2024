package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Momo de Momo"));
		System.out.println(dao.incluir(sql, "Momo"));
		System.out.println(dao.incluir(sql, "De Momo"));
		
		
		dao.close();
	}
}
