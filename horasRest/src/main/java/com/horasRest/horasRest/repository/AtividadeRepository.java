package com.horasRest.horasRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horasRest.horasRest.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade,Long> {
	
}
