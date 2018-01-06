package br.com.cviniciusdr.livraria.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cviniciusdr.livraria.api.LivroResource;
import br.com.cviniciusdr.livraria.domain.repository.LivroRepository;


@RestController
@RequestMapping("livro")
public class LivroController implements LivroResource{

	@Autowired
	private LivroRepository livroRepository;
	
    @Override
    public ResponseEntity find(Long id) {
        return ResponseEntity.ok().body( livroRepository.findById(id));
    }

    @Override
    public ResponseEntity findAll() {
        return ResponseEntity.ok( livroRepository.findAll());   
    }
}
