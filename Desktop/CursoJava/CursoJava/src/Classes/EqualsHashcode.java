package Classes;

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Edu";
		u1.email = "EduGostoso@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Fernandinha";
		u2.email = "BeiraMar@gmail.com";
		
		Usuario u3 = new Usuario();
		u3.nome = "Fernandinha";
		u3.email = "BeiraMar@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(u3));
		
		// System.out.println(u1.equals(u1)); TRUE
	}

}
