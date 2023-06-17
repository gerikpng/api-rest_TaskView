package com.horasRest.horasRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horasRest.horasRest.model.Campus;

public interface CampusRepository extends JpaRepository<Campus,Long> {
	
	
	Campus findByCamNome(String nomeCampus);
	
}
