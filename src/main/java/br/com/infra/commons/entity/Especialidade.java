package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Especialidades")
public class Especialidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7362551817791320359L;

	@Id
	@GeneratedValue(generator = "ESPECIALIDADE_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "ESPECIALIDADE_SEQ", name = "ESPECIALIDADE_SQ")
	private Long id;

	// @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// @JoinColumn(name = "ID_TIPO_COLABORADOR")
	// private TipoDeColaborador tipoDeColaborador;

	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Especialidade other = (Especialidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	// public TipoDeColaborador getTipoDeColaborador() {
	// return tipoDeColaborador;
	// }
	//
	// public void setTipoDeColaborador(TipoDeColaborador tipoDeColaborador) {
	// this.tipoDeColaborador = tipoDeColaborador;
	// }

}
