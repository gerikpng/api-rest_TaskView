package com.horasRest.horasRest.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.horasRest.horasRest.model.Curso;


public class CursoDto {
	private Long id;
	private String nome;
	
	public CursoDto(Curso curso) {
		this.id = curso.getCurId();
		this.nome = curso.getCurNome();
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
		// test
	}

	public static List<CursoDto> converter(List<Curso> topicos) {
		// TODO Auto-generated method stub
		return topicos.stream().map(CursoDto::new).collect(Collectors.toList());
	}
	
	
}
