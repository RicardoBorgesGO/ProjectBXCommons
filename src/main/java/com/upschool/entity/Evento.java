package com.upschool.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.upschool.util.CustomDateDeserializer;

@Entity
@Table(name = "EVENTO", schema = "PUBLIC")
public class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3370361768017369262L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "EVENTO_SQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 0, schema = "PUBLIC", name = "EVENTO_SQ", sequenceName = "EVENTO_SEQ")
	private Long id;

	@Column(name = "NOME_DO_EVENTO")
	private String nomeDoEvento;

	@Column(name = "DATA_DO_EVENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDoEvento;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public Date getDataDoEvento() {
		return dataDoEvento;
	}

	@JsonDeserialize(using = CustomDateDeserializer.class)
	public void setDataDoEvento(Date dataDoEvento) {
		this.dataDoEvento = dataDoEvento;
	}

}
