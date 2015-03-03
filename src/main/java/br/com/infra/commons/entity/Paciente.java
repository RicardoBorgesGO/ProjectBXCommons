package br.com.infra.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE", schema = "PUBLIC")
public class Paciente extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1189298104097138820L;
	
}
