package com.upschool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.commons.constant.EnumAtivoInativo;
import br.com.commons.constant.EnumEspecialidadesOdontologicas;

@Entity
@Table(schema = "PUBLIC", name = "DENTISTA")
public class Dentista extends Pessoa implements Serializable {

	//TODO Mudar de Dentista para Colaborador
	
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

}
