package br.com.pa.enums;

public enum Nipes {
	
	PAUS("P"), COPAS("C"), OUROS("O"), ESPADA("E");
	
	private String sigla;
	
	private Nipes(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
