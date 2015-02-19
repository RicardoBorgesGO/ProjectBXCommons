package br.com.commons.constant;

public enum EnumTipoTelefone {

	RESIDENCIAL("Residêncial"), CELULAR("Celular"), COMERCIAL("Comercial");

	private String descricao;

	private EnumTipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
