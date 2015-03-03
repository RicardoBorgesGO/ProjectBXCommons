package br.com.infra.commons.entity;

import java.io.Serializable;

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

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 6657566408540164483L;

	@Id
	@GeneratedValue(generator = "USUARIO_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "USUARIO_SEQ", name = "USUARIO_SQ")
	private int id;

	@Column(name = "LOGIN", unique = true, nullable = false, updatable = false)
	private String login;

	@Column(name = "SENHA", nullable = false)
	private String senha;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
