package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "CURSO")
@JsonIgnoreProperties(ignoreUnknown = true, value = "professor")
public class Curso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CURSO")
	@SequenceGenerator(allocationSize = 1, name = "SEQ_CURSO", sequenceName = "SQ_CURSO")
	private Long id;

	private String nome;

	@ManyToOne
	@JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;

	private Double preco;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(final Professor professor) {
		this.professor = professor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(final Double preco) {
		this.preco = preco;
	}

}
