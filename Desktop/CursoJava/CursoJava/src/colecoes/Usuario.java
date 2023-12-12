package colecoes;

import java.util.Objects;

public class Usuario {

	String nome;
	
	
	Usuario(String nome){
		this.nome = nome;
	}
	
	public String toString() {
		return "Meu nome é "+ this.nome+".";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
//	public int hashCode() {
//		return nome.length();
//	}
//	public int hashCode() {
//		return nome.length()*nome.length();
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
}
