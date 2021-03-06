package br.com.infra.commons.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.WordUtils;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import br.com.infra.commons.constant.EnumEstadoCivil;
import br.com.infra.commons.constant.EnumOperadoraCelular;
import br.com.infra.commons.constant.EnumSexo;
import br.com.infra.commons.util.CustomDateDeserializer;
import br.com.infra.commons.util.CustomDefaultDateSerializer;

@Entity
@Table(name = "PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2221529017638744402L;

	@Id
	@GeneratedValue(generator = "PESSOA_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "PESSOA_SEQ", name = "PESSOA_SQ")
	private Long id;

	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_NASCIMENTO")
	private Date dataDeNascimento;

	@Enumerated(EnumType.STRING)
	@Column(name = "ESTADO_CIVIL")
	private EnumEstadoCivil estadoCivil;

	@Enumerated(EnumType.STRING)
	@Column(name = "SEXO")
	private EnumSexo sexo;

	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "ENDERECO")
	private Endereco endereco;

	@Column(name = "NUMERO_TELEFONE")
	private String telefone;

	@Column(name = "TELEFONE_CELULAR")
	private String telefoneCelular;

	@Column(name = "OPERADORA_CELULAR")
	@Enumerated(EnumType.STRING)
	private EnumOperadoraCelular operadoraCelular;

	@Column(name = "EMAIL")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		if (nome != null)
			nome = WordUtils.capitalize(nome.toLowerCase());
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null)
			nome = nome.toUpperCase();
		this.nome = nome;
	}

	@JsonSerialize(using = CustomDefaultDateSerializer.class)
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	@JsonDeserialize(using = CustomDateDeserializer.class)
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public EnumEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EnumEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public EnumSexo getSexo() {
		return sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public EnumOperadoraCelular getOperadoraCelular() {
		return operadoraCelular;
	}

	public void setOperadoraCelular(EnumOperadoraCelular operadoraCelular) {
		this.operadoraCelular = operadoraCelular;
	}

	public Endereco getEndereco() {
		if (endereco == null)
			endereco = new Endereco();
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
