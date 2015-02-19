package com.upschool.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO", schema = "PUBLIC")
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2506543922604917410L;

	@Id
	@GeneratedValue(generator = "ENDERECO_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "ENDERECO_SQ", sequenceName = "ENDERECO_SEQ", allocationSize = 1, initialValue = 1)
	private Long id;

	private String cep;

	private String endereco;

	private String bairro;

	private String cidade;

	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}