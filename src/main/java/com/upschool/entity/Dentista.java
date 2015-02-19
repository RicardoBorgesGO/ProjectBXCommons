package com.upschool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "PUBLIC", name = "DENTISTA")
public class Dentista extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1206092031335697470L;

	private String especialidade;

	@Column(name = "CRO")
	private String registroNoCadastroRegionalOdontologico;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getRegistroNoCadastroRegionalOdontologico() {
		return registroNoCadastroRegionalOdontologico;
	}

	public void setRegistroNoCadastroRegionalOdontologico(
			String registroNoCadastroRegionalOdontologico) {
		this.registroNoCadastroRegionalOdontologico = registroNoCadastroRegionalOdontologico;
	}
	
	public void adicionaTelefone(Telefone telefone) {
		getTelefones().add(telefone);
	}

}
