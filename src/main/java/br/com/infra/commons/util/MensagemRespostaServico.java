package br.com.infra.commons.util;

public enum MensagemRespostaServico {
	
	SUCESSO_LOGIN_REALIZADO(100, "Login realizado com sucesso."),
	SUCESSO_SALVAR(101, "Sucesso ao salvar."),
	SUCESSO_ATUALIZADAR(102, "Sucesso ao atualizar."),

	ERRO_USUARIO_NAO_ENCONTRADO(200, "Usuário não encontrado."),
	ERRO_NAO_SALVO(201, "Erro ao salvar."),
	ERRO_NAO_ATUALIZADO(202, "Erro ao atualizar."),

	ERRO_NAO_CADASTRADO(999, "Erro não cadastrado.");

	private final int codigo;
	private final String mensagem;

	private MensagemRespostaServico(final int codigo, final String mensagem) {
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public String toString() {
		return getMensagem();
	}
}
