package br.com.cviniciusdr.livraria.api;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Livro")
public interface LivroResource {

	@GetMapping(value="/{id}", produces = "application/json")
	@ApiOperation(value = "Lista livro por ID")
    ResponseEntity find(@PathParam("id") Long id);
	
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "Lista todos livro")
	ResponseEntity findAll();


}
