package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.infra.commons.constant.EnumAtivoInativo;
import br.com.infra.commons.constant.EnumEspecialidadesOdontologicas;

@Entity
@Table(schema = "PUBLIC", name = "COLABORADOR")
public class Colaborador extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1206092031335697470L;

	@Enumerated(EnumType.STRING)
	private EnumEspecialidadesOdontologicas especialidade;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private EnumAtivoInativo ativoInativo;

	@Column(name = "CRO")
	private String registroNoCadastroRegionalOdontologico;

	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "TIPO_COLABORADOR")
	private TipoDeColaborador tipoDeColaborador;

	public EnumEspecialidadesOdontologicas getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(EnumEspecialidadesOdontologicas especialidade) {
		this.especialidade = especialidade;
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

	public TipoDeColaborador getTipoDeColaborador() {
		return tipoDeColaborador;
	}

	public void setTipoDeColaborador(TipoDeColaborador tipoDeColaborador) {
		this.tipoDeColaborador = tipoDeColaborador;
	}

}
