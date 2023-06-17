package com.horasRest.horasRest.form;

import com.horasRest.horasRest.model.Campus;
import com.horasRest.horasRest.model.Curso;
import com.horasRest.horasRest.repository.CampusRepository;


public class CursoForm {
	private String nomeCurso;
	private String nomeCampus;
	
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}



	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}



	public String getNomeCampus() {
		return nomeCampus;
	}



	public void setNomeCampus(String nomeCampus) {
		this.nomeCampus = nomeCampus;
	}



	public Curso converter(CampusRepository repository) {
		// TODO Auto-generated method stub
		Campus campus = repository.findByCamNome(nomeCurso);
		return new Curso(campus,nomeCurso);
	}
	
}
