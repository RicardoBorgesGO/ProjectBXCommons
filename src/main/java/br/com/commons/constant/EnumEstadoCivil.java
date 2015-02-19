package br.com.commons.constant;

public enum EnumEstadoCivil {

	SOLTEIRO("Solteiro(a)"), CASADO("Casado(a)"), DIVORCIADO("Divorciado(a)"), VIUVO(
			"Viúvo(a)");

	private String descricao;

	private EnumEstadoCivil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
