package com.upschool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.commons.constant.EnumTipoTelefone;

@Entity
@Table(schema = "PUBLIC", name = "TELEFONE")
public class Telefone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TELEFONE_SQ")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "TELEFONE_SQ", sequenceName = "TELEFONE_SEQ")
	private Long id;

	@Column(name = "NUMERO_TELEFONE")
	private String numeroDoTelefone;

	@Enumerated(EnumType.STRING)
	private EnumTipoTelefone tipoTelefone;

	public Telefone() {
	}

	public Telefone(EnumTipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDoTelefone() {
		return numeroDoTelefone;
	}

	public void setNumeroDoTelefone(String numeroDoTelefone) {
		this.numeroDoTelefone = numeroDoTelefone;
	}

	public EnumTipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(EnumTipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
