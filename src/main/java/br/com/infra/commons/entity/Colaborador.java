package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.infra.commons.constant.EnumAtivoInativo;

@Entity
@Table(schema = "PUBLIC", name = "COLABORADOR")
public class Colaborador extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1206092031335697470L;

	@OneToOne(optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "ID_ESPECIALIDADE")
	private Especialidade especialidade;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private EnumAtivoInativo ativoInativo;

	@Column(name = "CRO")
	private String registroNoCadastroRegionalOdontologico;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TIPO_COLABORADOR")
	private TipoDeColaborador tipoDeColaborador;

	//TODO Elaborar solucao para colocar Lazy
//	@OneToMany(mappedBy = "colaborador", fetch = FetchType.EAGER)
//	private List<Evento> eventos;
	
	public Colaborador() {
		// TODO Auto-generated constructor stub
	}
	
	public Colaborador(Long id) {
		setId(id);
	}

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

//	public List<Evento> getEventos() {
//		return eventos;
//	}
//
//	public void setEventos(List<Evento> eventos) {
//		this.eventos = eventos;
//	}

}
