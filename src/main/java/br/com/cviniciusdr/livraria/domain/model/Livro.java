package br.com.cviniciusdr.livraria.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	public Livro() {
		this.id = 1L;
		this.nome = "Eragon";
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
}
