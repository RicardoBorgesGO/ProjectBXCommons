package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_COLABORADOR", schema = "PUBLIC")
public class TipoDeColaborador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5373000680705237412L;

	@Id
	@GeneratedValue(generator = "TIPO_COLABORADOR_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "TIPO_COLABORADOR_SEQ", name = "TIPO_COLABORADOR_SQ")
	private Long id;

	private String nome;

	private boolean especialidade;

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

	public boolean isEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(boolean especialidade) {
		this.especialidade = especialidade;
	}

}
