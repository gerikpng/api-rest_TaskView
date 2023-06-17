package com.horasRest.horasRest.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuId;
	
	private String usuNome;
	private LocalDate usuNasc;
	private BigDecimal usuMatricula;
	private BigDecimal usuCursoId;
	private String usuSenha;
	private String usuusuEmail;
	private Integer usuCoordenador;
	private Integer usuAdmin;
	
	public Long getUsuId() {
		return usuId;
	}
	public void setUsuId(Long usuId) {
		this.usuId = usuId;
	}
	public String getUsuNome() {
		return usuNome;
	}
	public void setUsuNome(String usuNome) {
		this.usuNome = usuNome;
	}
	public LocalDate getUsuNasc() {
		return usuNasc;
	}
	public void setUsuNasc(LocalDate usuNasc) {
		this.usuNasc = usuNasc;
	}
	public BigDecimal getUsuMatricula() {
		return usuMatricula;
	}
	public void setUsuMatricula(BigDecimal usuMatricula) {
		this.usuMatricula = usuMatricula;
	}
	public BigDecimal getUsuCursoId() {
		return usuCursoId;
	}
	public void setUsuCursoId(BigDecimal usuCursoId) {
		this.usuCursoId = usuCursoId;
	}
	public String getUsuSenha() {
		return usuSenha;
	}
	public void setUsuSenha(String usuSenha) {
		this.usuSenha = usuSenha;
	}
	public String getUsuusuEmail() {
		return usuusuEmail;
	}
	public void setUsuusuEmail(String usuusuEmail) {
		this.usuusuEmail = usuusuEmail;
	}
	public Integer getUsuCoordenador() {
		return usuCoordenador;
	}
	public void setUsuCoordenador(Integer usuCoordenador) {
		this.usuCoordenador = usuCoordenador;
	}
	public Integer getUsuAdmin() {
		return usuAdmin;
	}
	public void setUsuAdmin(Integer usuAdmin) {
		this.usuAdmin = usuAdmin;
	}
}
