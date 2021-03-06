package br.com.infra.commons.entity;

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

	private Integer numero;

	private String logradouro;

	private String complemento;

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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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
