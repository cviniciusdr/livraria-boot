package br.com.cviniciusdr.livraria.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cviniciusdr.livraria.domain.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	Livro findById(Long id);
	List<Livro> findAll();

}
