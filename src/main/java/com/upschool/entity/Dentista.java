package com.upschool.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "PUBLIC", name = "DENTISTA")
public class Dentista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1206092031335697470L;

	@Id
	@GeneratedValue(generator = "DENTISTA_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "DENTISTA_SEQ", name = "DENTISTA_SQ")
	private Long id;

	private String nome;

	private String especialidade;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_NASCIMENTO")
	private Date dataDeNascimento;

	@Column(name = "CRO")
	private String registroNoCadastroRegionalOdontologico;

	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "ENDERECO")
	private Endereco endereco;
	
	//TODO Colocar email
	//TODO Colocar rg e cpf???

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getRegistroNoCadastroRegionalOdontologico() {
		return registroNoCadastroRegionalOdontologico;
	}

	public void setRegistroNoCadastroRegionalOdontologico(
			String registroNoCadastroRegionalOdontologico) {
		this.registroNoCadastroRegionalOdontologico = registroNoCadastroRegionalOdontologico;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
