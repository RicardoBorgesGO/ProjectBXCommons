package com.upschool.util;

public enum MensagemRespostaServico {

	SUCESSO_LOGIN_REALIZADO(100, "Login realizado com sucesso."),

	ERRO_USUARIO_NAO_ENCONTRADO(200, "Usuário não encontrado."),

	ERRO_NAO_CADASTRADO(999, "Erro não cadastrado.");

	private int codigo;
	private String mensagem;

	private MensagemRespostaServico(int codigo, String mensagem) {
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getMensagem() {
		return this.mensagem;
	}
}
