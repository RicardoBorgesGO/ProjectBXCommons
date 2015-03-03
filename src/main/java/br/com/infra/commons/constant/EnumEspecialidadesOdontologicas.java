package br.com.infra.commons.constant;

public enum EnumEspecialidadesOdontologicas {

	CIRURGIA_E_TRAUMATOLOGIA_BUCO_MAXILO_FACIAL("Cirurgia e Traumatologia Buco-Maxilo-Facial"),
	CLINICA_GERAL("Clínica Geral"),
	DENTISTICA("Dentística"),
	DISFUNCAO_TEMPORO_MANDIBULAR_E_DOR_OROFACIAL("Disfunção Têmporo-Mandibular e Dor-Orofacial"),
	ENDODONTIA("Endodontia"),
	ESTOMATOLOGIA("Estomatologia"),
	RADIOLOGIA_ODONTOLOGICA_E_IMAGINOLOGIA("Radiologia Odontológica e Imaginologia"),
	IMPLANTODONTIA("Implantodontia"),
	ODONTOLOGIA_LEGAL("Odontologia Legal"),
	ODONTOGERIATRIA("Odontogeriatria"),
	ODONTOPEDIATRIA("Odontopediatria"),
	ODONTOLOGIA_DO_TRABALHO("Odontologia do Trabalho"),
	ODONTOLOGIA_PARA_PACIENTES_COM_NECESSIDADES_ESPECIAIS("Odontologia para Pacientes com Necessidades Especiais"),
	ORTODONTIA("Ortodontia"),
	ORTOPEDIA_FUNCIONAL_DOS_MAXILARES("Ortopedia Funcional dos Maxilares"),
	PATOLOGIA_BUCAL("Patologia Bucal"),
	PERIODONTIA("Periodontia"),
	PROTESE_BUCO_MAXILO_FACIAL("Prótese Buco-Maxilo-Facial"),
	PROTESE_DENTARIA("Prótese Dentária"),
	SAUDE_COLETIVA("Saúde Coletiva");

	private String descricao;

	private EnumEspecialidadesOdontologicas(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
