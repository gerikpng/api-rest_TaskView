package com.horasRest.horasRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Grupo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long gruId;
	
	private String gruNome;
	private Integer gruHora;
	private Long curId;
	public Long getGruId() {
		return gruId;
	}
	public void setGruId(Long gruId) {
		this.gruId = gruId;
	}
	public String getGruNome() {
		return gruNome;
	}
	public void setGruNome(String gruNome) {
		this.gruNome = gruNome;
	}
	public Integer getGruHora() {
		return gruHora;
	}
	public void setGruHora(Integer gruHora) {
		this.gruHora = gruHora;
	}
	public Long getCurId() {
		return curId;
	}
	public void setCurId(Long curId) {
		this.curId = curId;
	}
	
}
