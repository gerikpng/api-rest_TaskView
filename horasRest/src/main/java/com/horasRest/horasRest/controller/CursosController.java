package com.horasRest.horasRest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.horasRest.horasRest.dto.CursoDto;
import com.horasRest.horasRest.form.CursoForm;
import com.horasRest.horasRest.model.Curso;
import com.horasRest.horasRest.repository.CampusRepository;
import com.horasRest.horasRest.repository.CursoRepository;


@RestController
@RequestMapping("/cursos")
public class CursosController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private CampusRepository campusRepository;
	
	@GetMapping
	public List<CursoDto> lista(String nomeCurso) {
		List<Curso> cursos;
		if(nomeCurso == null) {
			cursos = cursoRepository.findAll();
		}else {
			cursos = cursoRepository.findByCursoCurNome(nomeCurso);
		}
		
		return CursoDto.converter(cursos);
	}
	
	@PostMapping
	public ResponseEntity<CursoDto> cadastrar(@RequestBody CursoForm form, UriComponentsBuilder uriBuilder) {
		Curso formCurso = form.converter(campusRepository);
		cursoRepository.save(formCurso);
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(formCurso.getCurId()).toUri();
		return ResponseEntity.created(uri).body(new CursoDto(formCurso));
	}
}
