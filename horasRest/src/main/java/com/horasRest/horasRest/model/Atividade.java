package com.horasRest.horasRest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Atividade {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long atiId;
	
	private String atiNome;
	private Long gruId;
	private Integer atiHoraTotal;
	private Integer atiHoraSemestre;
	private Integer atiHoraEnvio;
	private String atiComprovantes;
	public Long getAtiId() {
		return atiId;
	}
	public void setAtiId(Long atiId) {
		this.atiId = atiId;
	}
	public String getAtiNome() {
		return atiNome;
	}
	public void setAtiNome(String atiNome) {
		this.atiNome = atiNome;
	}
	public Long getGruId() {
		return gruId;
	}
	public void setGruId(Long gruId) {
		this.gruId = gruId;
	}
	public Integer getAtiHoraTotal() {
		return atiHoraTotal;
	}
	public void setAtiHoraTotal(Integer atiHoraTotal) {
		this.atiHoraTotal = atiHoraTotal;
	}
	public Integer getAtiHoraSemestre() {
		return atiHoraSemestre;
	}
	public void setAtiHoraSemestre(Integer atiHoraSemestre) {
		this.atiHoraSemestre = atiHoraSemestre;
	}
	public Integer getAtiHoraEnvio() {
		return atiHoraEnvio;
	}
	public void setAtiHoraEnvio(Integer atiHoraEnvio) {
		this.atiHoraEnvio = atiHoraEnvio;
	}
	public String getAtiComprovantes() {
		return atiComprovantes;
	}
	public void setAtiComprovantes(String atiComprovantes) {
		this.atiComprovantes = atiComprovantes;
	}
	
	
}
