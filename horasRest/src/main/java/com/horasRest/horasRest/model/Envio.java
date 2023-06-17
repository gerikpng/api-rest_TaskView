package com.horasRest.horasRest.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Envio {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long envId;
	
	private String envDescricao;
	private String envArquivo;
	private Long gruId;
	private Long atiId;
	private String envSituacao;
	private Long aluMatricula;
	private LocalDate envData;
	public Long getEnvId() {
		return envId;
	}
	public void setEnvId(Long envId) {
		this.envId = envId;
	}
	public String getEnvDescricao() {
		return envDescricao;
	}
	public void setEnvDescricao(String envDescricao) {
		this.envDescricao = envDescricao;
	}
	public String getEnvArquivo() {
		return envArquivo;
	}
	public void setEnvArquivo(String envArquivo) {
		this.envArquivo = envArquivo;
	}
	public Long getGruId() {
		return gruId;
	}
	public void setGruId(Long gruId) {
		this.gruId = gruId;
	}
	public Long getAtiId() {
		return atiId;
	}
	public void setAtiId(Long atiId) {
		this.atiId = atiId;
	}
	public String getEnvSituacao() {
		return envSituacao;
	}
	public void setEnvSituacao(String envSituacao) {
		this.envSituacao = envSituacao;
	}
	public Long getAluMatricula() {
		return aluMatricula;
	}
	public void setAluMatricula(Long aluMatricula) {
		this.aluMatricula = aluMatricula;
	}
	public LocalDate getEnvData() {
		return envData;
	}
	public void setEnvData(LocalDate envData) {
		this.envData = envData;
	}
	
	
}
