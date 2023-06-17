package com.horasRest.horasRest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Campus {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long camId;
	private String camNome;

	public Long getCamId() {
		return camId;
	}

	public void setCamId(Long camId) {
		this.camId = camId;
	}

	public String getCamNome() {
		return camNome;
	}

	public void setCamNome(String camNome) {
		this.camNome = camNome;
	}
	
}
