package optional.model;

import java.util.Optional;

public class Caminhao {

	private String modelo;
	private int potencia;
	
//	VAMOS TROCAR A CLASSE "SEGURO" POR UM OPCIONAL.
//	private Seguro seguro;
	private Optional<Seguro> SeguroOpicional;
	

	public Caminhao(String modelo, int potencia, Optional<Seguro> seguroOpicional) {
	super();
	this.modelo = modelo;
	this.potencia = potencia;
	SeguroOpicional = seguroOpicional;
}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Optional<Seguro> getSeguroOpicional() {
		return SeguroOpicional;
	}
	
	public void setSeguroOpicional(Optional<Seguro> seguroOpicional) {
		SeguroOpicional = seguroOpicional;
	}
	
}
