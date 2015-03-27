package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE", schema = "PUBLIC")
public class Paciente extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1189298104097138820L;

//	@OneToOne
//	@JoinColumn(name = "ID_COLABORADOR")
//	private Colaborador colaborador;

	private String cpf;

	private Long rg;

//	public Colaborador getColaborador() {
//		return colaborador;
//	}
//
//	public void setColaborador(Colaborador colaborador) {
//		this.colaborador = colaborador;
//	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

}
