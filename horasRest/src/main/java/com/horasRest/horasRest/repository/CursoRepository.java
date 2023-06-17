package com.horasRest.horasRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horasRest.horasRest.model.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {

	List<Curso> findByCursoCurNome(String nomeCurso);
	
}
