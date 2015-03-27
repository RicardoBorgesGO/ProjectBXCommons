package br.com.infra.commons.constant;

public enum EnumOperadoraCelular {

	CLARO("Claro"), TIM("Tim"), VIVO("Vivo"), OI("Oi"), NEXTEL("Nextel");

	private String descricao;

	private EnumOperadoraCelular(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
