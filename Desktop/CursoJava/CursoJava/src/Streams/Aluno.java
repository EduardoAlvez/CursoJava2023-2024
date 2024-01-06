package Streams;

import java.util.Objects;

public class Aluno {
    String nome;
    final double nota;
    boolean bomComportamento = true;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public String toString() {
    	return nome+" tem nota de "+nota;
    }

	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
    
}
