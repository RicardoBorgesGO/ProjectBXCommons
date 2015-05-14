package br.com.infra.commons.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;



import br.com.infra.commons.constant.RoleEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "USUARIO", schema = "PUBLIC")
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

	@Column(name = "TENANT")
	private String tenanty;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "users")
	private List<Role> roles;

	@JsonIgnore
	@Transient
	public List<RoleEnum> getUserRoles() {
		List<RoleEnum> userRoles = new ArrayList<>();
		if (roles != null) {
			for (Role userRole : roles) {
				userRoles.add(userRole.getRoleEnum());
			}
		}
		return userRoles;
	}

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

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

	public String getTenanty() {
		return tenanty;
	}

	public void setTenanty(String tenanty) {
		this.tenanty = tenanty;
	}

}
