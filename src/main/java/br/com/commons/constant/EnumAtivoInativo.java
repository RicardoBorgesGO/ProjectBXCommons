package br.com.commons.constant;

public enum EnumAtivoInativo {

	A("Ativo"), I("Inativo");

	private String descricao;

	private EnumAtivoInativo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
