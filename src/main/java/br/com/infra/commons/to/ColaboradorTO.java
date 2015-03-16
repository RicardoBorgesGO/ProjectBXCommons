package br.com.infra.commons.to;

import java.io.Serializable;
import java.util.List;

import br.com.infra.commons.constant.EnumAtivoInativo;
import br.com.infra.commons.entity.Especialidade;
import br.com.infra.commons.entity.Evento;
import br.com.infra.commons.entity.TipoDeColaborador;

@Deprecated
public class ColaboradorTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6472657692788364522L;
	
	private Especialidade especialidade;

	private EnumAtivoInativo ativoInativo;

	private String registroNoCadastroRegionalOdontologico;

	private TipoDeColaborador tipoDeColaborador;

	private List<Evento> eventos;

	public String getRegistroNoCadastroRegionalOdontologico() {
		return registroNoCadastroRegionalOdontologico;
	}

	public void setRegistroNoCadastroRegionalOdontologico(
			String registroNoCadastroRegionalOdontologico) {
		this.registroNoCadastroRegionalOdontologico = registroNoCadastroRegionalOdontologico;
	}

	public EnumAtivoInativo getAtivoInativo() {
		return ativoInativo;
	}

	public void setAtivoInativo(EnumAtivoInativo ativoInativo) {
		this.ativoInativo = ativoInativo;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public TipoDeColaborador getTipoDeColaborador() {
		return tipoDeColaborador;
	}

	public void setTipoDeColaborador(TipoDeColaborador tipoDeColaborador) {
		this.tipoDeColaborador = tipoDeColaborador;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

}
