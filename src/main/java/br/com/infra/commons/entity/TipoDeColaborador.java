package br.com.infra.commons.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

	// TODO Colocar LAZY
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tipo_colaborador")
	private List<Especialidade> especialidades;

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

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
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
		TipoDeColaborador other = (TipoDeColaborador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
