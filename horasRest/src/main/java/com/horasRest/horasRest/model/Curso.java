package com.horasRest.horasRest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Curso {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long curId;
	private String curNome;
	
	public Curso() {
		
	}
	
	public Curso(Campus campus, String curNome) {
		
	}
	
	public Long getCurId() {
		return curId;
	}
	public void setCurId(Long curId) {
		this.curId = curId;
	}

	public String getCurNome() {
		return curNome;
	}
	public void setCurNome(String curNome) {
		this.curNome = curNome;
	}
	
		
	
}
