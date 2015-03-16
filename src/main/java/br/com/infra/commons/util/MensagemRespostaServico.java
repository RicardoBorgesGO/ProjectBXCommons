package br.com.infra.commons.util;

public enum MensagemRespostaServico {
	
	SUCESSO_SALVAR(100, "Sucesso ao salvar."),
	
	SUCESSO_ATUALIZADAR(100, "Sucesso ao atualizar."),

	ERRO_NAO_SALVO(200, "Erro ao salvar."),
	
	ERRO_NAO_ATUALIZADO(200, "Erro ao atualizar."),

	SUCESSO_LOGIN_REALIZADO(100, "Login realizado com sucesso."),

	ERRO_USUARIO_NAO_ENCONTRADO(200, "Usuário não encontrado."),

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
